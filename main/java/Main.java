package main.java;
import main.java.Action.Action;
import main.java.Action.ActionType;
import main.java.card.card;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Setting up num Decks
        System.out.println("How many Decks do you want to play with?");
        int userInt = scanner.nextInt();
        System.out.println("You are playing with " + userInt + " decks.");
        Deck playingdeck = new Deck(userInt);
        boolean playing = true;

        //Buying Chips
        System.out.println("How many chips do you want to buy?");
        int chips = scanner.nextInt();
        player playerOne = new player(chips);
        player Dealer = new player(chips);

        while (playing) {
            //How much player bets
            System.out.println("How much do you want to bet on this hand?");
            int bet = scanner.nextInt();
            while(bet > playerOne.getChips()){
                System.out.println("Sorry, you only have " + playerOne.getChips() + ". How much do you want to bet?");
                bet = scanner.nextInt();
            }

            //Deal Initial Hands
            for (int i = 0; i < 2; i++) {
                playerOne.addCard(playingdeck.drawCard());
                Dealer.addCard(playingdeck.drawCard());
            }
            System.out.println("The Dealers face-up card is a " + Dealer.showHand().get(0).getID());
            System.out.println("You have a " + playerOne.showHand().get(0).getID() +
                    " and a " + playerOne.showHand().get(1).getID() + ". Type STAND, HIT, DOUBLE, or SPLIT");
            String actionString = scanner.next();
            ActionType action = ActionType.valueOf(actionString);
            Boolean doubleDown = false;

            //Player Action Sequence
            while (!action.equals(ActionType.STAND)) {
                switch (action) {
                    case HIT:
                        card newHit = playingdeck.drawCard();
                        System.out.println("You drew a " + newHit.getID());
                        playerOne.addCard(newHit);
                        break;
                    case DOUBLE:
                        card newDouble = playingdeck.drawCard();
                        System.out.println("You drew a " + newDouble.getID() +
                                "\n");
                        playerOne.addCard(newDouble);
                        bet *= 2;
                        doubleDown = true;
                        break;
                    case SPLIT:
                        System.out.println("You split your" + playerOne.showHand().get(0).getID() +
                                "What do you want to do with your first hand?");
                }
                System.out.println(checkNums(playerOne));

                //Player Bust
                if (checkNums(playerOne) > 21) {
                    System.out.println("Sorry, your total is " + checkNums(playerOne) + ". You went bust. You lost " + bet + " dollars");
                    playerOne.addChips(bet * -1);
                    action = ActionType.STAND;
                    break;
                } else if (checkNums(playerOne) == 21) {
                    System.out.println("Your total is " + checkNums(playerOne) + ". BlackJack!!!");
                    action = ActionType.STAND;
                } else if (doubleDown){
                    System.out.println("You're total is " + checkNums(playerOne));
                    action = ActionType.STAND;
                } else {
                    //Player next action
                    System.out.println("You're total is " + checkNums(playerOne) + " What do you want to do? " +
                            "Type STAND or HIT");
                    actionString = scanner.next();
                    action = ActionType.valueOf(actionString);
                }
            }

            if (checkNums(playerOne) <= 21) {
                System.out.println("The Dealers face-down card is a " + Dealer.showHand().get(1).getID()
                + ". The dealer currently has a " + Dealer.showHand().get(0).getID() + " and " + Dealer.showHand().get(1).getID());
                //Dealer draws cards
                while (checkNums(Dealer) < 17) {
                    card dealerDraw = playingdeck.drawCard();
                    System.out.println("Dealer drew a " + dealerDraw.getID());
                    Dealer.addCard(dealerDraw);
                }

                //Dealer Bust
                if (checkNums(Dealer) > 21) {
                    System.out.println("The dealer has a " + checkNums(Dealer) + ". Congrats, you win!!! You won " + bet + " dollars");
                    playerOne.addChips(bet);
                }
                //Player Higher Hand
                else if (checkNums(Dealer) < checkNums(playerOne)) {
                    if (checkNums(playerOne) == 21) {
                        //Player wins blackjack
                        System.out.println("The dealer has a " + checkNums(Dealer) + ". You won off a blackjack!!! " +
                                "You won " + bet * 1.5 + " dollars");
                        playerOne.addChips((int) (bet * 1.5));
                    } else {
                        System.out.println("The dealer has a " + checkNums(Dealer) + ". Congrats, you win!!! You won " + bet + " dollars");
                        playerOne.addChips(bet);
                    }
                }
                //Dealer Higher Hand
                else if (checkNums(Dealer) > checkNums(playerOne)) {
                    System.out.println("The dealer has a " + checkNums(Dealer) + ". Sorry, you lost the bet. " +
                            " You lost " + bet + " dollars");
                    playerOne.addChips(bet * -1);
                }
                //Tie
                else {
                    System.out.println("The dealer has a " + checkNums(Dealer) + ". Its a tie!");
                }
                //Player Bust
            }
            System.out.println("Do you want to keep playing? You have " + playerOne.getChips() + " dollars. TYPE YES OR NO");
            String stillPlaying = scanner.next();
            if(stillPlaying.equals("NO")){
                playing = false;
            } else {
                playing = true;
                playerOne.clearHand();
                Dealer.clearHand();
            }
        }
        System.out.println("Thank you for playing!!!");
    }



    public static double checkNums(player x){
        int sum = 0;
        int aceCount = 0;
        for (card element : x.showHand()){
            sum += element.getValue();
            if(element.getID().equals("Ace")){
                aceCount++;
            }
        }
        if(sum > 21){
            for(int i = aceCount; i > 0; i--){
                sum -= 10;
                if(sum < 21){
                    break;
                }
            }
        }
        return sum;
    }

    private boolean currentInputString(String input){
        if(!input.equals("STAND") && !input.equals("HIT") && !input.equals("DOUBLE") && !input.equals("SPLIT")){
            return false;
        }
        return true;
    }

    public void Hit(player x){

    }
}