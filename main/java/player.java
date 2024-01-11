package main.java;

import main.java.card.card;

import java.util.ArrayList;

public class player {
    private Integer chips;

    private ArrayList<card> hand;

    public player(int buyin){
        chips = buyin;
        hand = new ArrayList<>();
    }

    public void addChips(int adding){
        chips += adding;
    }
    public void subtractChips(int subtract) {
        if (chips - subtract < 0) {
            throw new IllegalArgumentException("Not enough Chips");
        }
        chips -= subtract;
    }

    public int getChips(){
        return chips;
    }

    public void addCard(card card){
        hand.add(card);
    }

    public ArrayList<card> showHand(){
        return hand;
    }
    public void clearHand(){
        hand.clear();
    }

}
