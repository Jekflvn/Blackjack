package main.java.card;

public class card {

    private suit suit;
    private int number;
    private String ID;

    public card(suit suit, int number, String ID){
        this.number = number;
        this.suit = suit;
        this.ID = ID;
    }

    public suit getSuit(){
        return suit;
    }
    public int getValue(){
        return number;
    }
    public String getID(){
        return ID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        card other = (card) obj;
        return this.suit == other.suit && this.number == other.number;
    }
}
