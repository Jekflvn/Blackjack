package main.java;

import main.java.card.card;
import main.java.card.suit;
import java.util.Random;
import java.util.ArrayList;
///fdafda
public class Deck {

    private ArrayList<card> deck;
    private card oneOfHearts;
    private card oneOfDiamonds;
    private card oneOfClubs;
    private card oneOfSpades;
    private card twoOfHearts;
    private card twoOfDiamonds;
    private card twoOfClubs;
    private card twoOfSpades;
    private card threeOfHearts;
    private card threeOfDiamonds;
    private card threeOfClubs;
    private card threeOfSpades;
    private card fourOfHearts;
    private card fourOfDiamonds;
    private card fourOfClubs;
    private card fourOfSpades;
    private card fiveOfHearts;
    private card fiveOfDiamonds;
    private card fiveOfClubs;
    private card fiveOfSpades;
    private card sixOfHearts;
    private card sixOfDiamonds;
    private card sixOfClubs;
    private card sixOfSpades;
    private card sevenOfHearts;
    private card sevenOfDiamonds;
    private card sevenOfClubs;
    private card sevenOfSpades;
    private card eightOfHearts;
    private card eightOfDiamonds;
    private card eightOfClubs;
    private card eightOfSpades;
    private card nineOfHearts;
    private card nineOfDiamonds;
    private card nineOfClubs;
    private card nineOfSpades;
    private card tenOfHearts;
    private card tenOfDiamonds;
    private card tenOfClubs;
    private card tenOfSpades;
    private card jackOfHearts;
    private card jackOfDiamonds;
    private card jackOfClubs;
    private card jackOfSpades;
    private card queenOfHearts;
    private card queenOfDiamonds;
    private card queenOfClubs;
    private card queenOfSpades;
    private card kingOfHearts;
    private card kingOfDiamonds;
    private card kingOfClubs;
    private card kingOfSpades;
    private card aceOfHearts;
    private card aceOfDiamonds;
    private card aceOfClubs;
    private card aceOfSpades;
    private int decksize;

    public Deck(int numDecks){
        deck = new ArrayList<>();
        twoOfHearts = new card(suit.HEARTS, 2, "2"); deck.add(twoOfHearts);
        twoOfDiamonds = new card(suit.DIAMONDS, 2, "2"); deck.add(twoOfDiamonds);
        twoOfClubs = new card(suit.CLUBS, 2, "2"); deck.add(twoOfClubs);
        twoOfSpades = new card(suit.SPADES, 2, "2"); deck.add(twoOfSpades);
        threeOfHearts = new card(suit.HEARTS, 3, "3"); deck.add(threeOfHearts);
        threeOfDiamonds = new card(suit.DIAMONDS, 3, "3"); deck.add(threeOfDiamonds);
        threeOfClubs = new card(suit.CLUBS, 3, "3"); deck.add(threeOfClubs);
        threeOfSpades = new card(suit.SPADES, 3, "3"); deck.add(threeOfSpades);
        fourOfHearts = new card(suit.HEARTS, 4, "4"); deck.add(fourOfHearts);
        fourOfDiamonds = new card(suit.DIAMONDS, 4, "4"); deck.add(fourOfDiamonds);
        fourOfClubs = new card(suit.CLUBS, 4, "4"); deck.add(fourOfClubs);
        fourOfSpades = new card(suit.SPADES, 4, "4"); deck.add(fourOfSpades);
        fiveOfHearts = new card(suit.HEARTS, 5, "5"); deck.add(fiveOfHearts);
        fiveOfDiamonds = new card(suit.DIAMONDS, 5, "5"); deck.add(fiveOfDiamonds);
        fiveOfClubs = new card(suit.CLUBS, 5, "5"); deck.add(fiveOfClubs);
        fiveOfSpades = new card(suit.SPADES, 5, "5"); deck.add(fiveOfSpades);
        sixOfHearts = new card(suit.HEARTS, 6, "6"); deck.add(sixOfHearts);
        sixOfDiamonds = new card(suit.DIAMONDS, 6, "6"); deck.add(sixOfDiamonds);
        sixOfClubs = new card(suit.CLUBS, 6, "6"); deck.add(sixOfClubs);
        sixOfSpades = new card(suit.SPADES, 6, "6"); deck.add(sixOfSpades);
        sevenOfHearts = new card(suit.HEARTS, 7, "7"); deck.add(sevenOfHearts);
        sevenOfDiamonds = new card(suit.DIAMONDS, 7, "7"); deck.add(sevenOfDiamonds);
        sevenOfClubs = new card(suit.CLUBS, 7, "7"); deck.add(sevenOfClubs);
        sevenOfSpades = new card(suit.SPADES, 7, "7"); deck.add(sevenOfSpades);
        eightOfHearts = new card(suit.HEARTS, 8, "8"); deck.add(eightOfHearts);
        eightOfDiamonds = new card(suit.DIAMONDS, 8, "8"); deck.add(eightOfDiamonds);
        eightOfClubs = new card(suit.CLUBS, 8, "8"); deck.add(eightOfClubs);
        eightOfSpades = new card(suit.SPADES, 8, "8"); deck.add(eightOfSpades);
        nineOfHearts = new card(suit.HEARTS, 9, "9"); deck.add(nineOfHearts);
        nineOfDiamonds = new card(suit.DIAMONDS, 9, "9"); deck.add(nineOfDiamonds);
        nineOfClubs = new card(suit.CLUBS, 9, "9"); deck.add(nineOfClubs);
        nineOfSpades = new card(suit.SPADES, 9, "9"); deck.add(nineOfSpades);
        tenOfHearts = new card(suit.HEARTS, 10, "10"); deck.add(tenOfHearts);
        tenOfDiamonds = new card(suit.DIAMONDS, 10, "10"); deck.add(tenOfDiamonds);
        tenOfClubs = new card(suit.CLUBS, 10, "10"); deck.add(tenOfClubs);
        tenOfSpades = new card(suit.SPADES, 10, "10"); deck.add(tenOfSpades);
        jackOfHearts = new card(suit.HEARTS, 10, "Jack"); deck.add(jackOfHearts);
        jackOfDiamonds = new card(suit.DIAMONDS, 10, "Jack"); deck.add(jackOfDiamonds);
        jackOfClubs = new card(suit.CLUBS, 10, "Jack"); deck.add(jackOfClubs);
        jackOfSpades = new card(suit.SPADES, 10, "Jack"); deck.add(jackOfSpades);
        queenOfHearts = new card(suit.HEARTS, 10, "Queen"); deck.add(queenOfHearts);
        queenOfDiamonds = new card(suit.DIAMONDS, 10, "Queen"); deck.add(queenOfDiamonds);
        queenOfClubs = new card(suit.CLUBS, 10, "Queen"); deck.add(queenOfClubs);
        queenOfSpades = new card(suit.SPADES, 10, "Queen"); deck.add(queenOfSpades);
        kingOfHearts = new card(suit.HEARTS, 10, "King"); deck.add(kingOfHearts);
        kingOfDiamonds = new card(suit.DIAMONDS, 10, "King"); deck.add(kingOfDiamonds);
        kingOfClubs = new card(suit.CLUBS, 10, "King"); deck.add(kingOfClubs);
        kingOfSpades = new card(suit.SPADES, 10, "King"); deck.add(kingOfSpades);
        aceOfHearts = new card(suit.HEARTS, 11, "Ace"); deck.add(aceOfHearts);
        aceOfDiamonds = new card(suit.DIAMONDS, 11, "Ace"); deck.add(aceOfDiamonds);
        aceOfClubs = new card(suit.CLUBS, 11, "Ace"); deck.add(aceOfClubs);
        aceOfSpades = new card(suit.SPADES, 11, "Ace"); deck.add(aceOfSpades);
        for(int i = 0; i < numDecks - 1; i++){
            deck.addAll(deck);
        }
        decksize = deck.size();
    }

    public card drawCard(){
        Random rand = new Random();
        int randomNum = rand.nextInt(decksize - 1) + 1;
        card draw = deck.get(randomNum);
        deck.remove(randomNum);
        decksize -= 1;
        return draw;
    }
}
