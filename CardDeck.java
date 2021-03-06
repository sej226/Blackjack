import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    private static final int CARD_COUNT = 13;
    private List<Card> cards;

    public Card getCard() {
        return null;
    }

    public CardDeck() {
        cards = this.generateCards();
    }

    private List<Card> generateCards(){
        List<Card> cards = new LinkedList<>();

        for (String pattern : PATTERNS) {
            for (int i = 1; i < CARD_COUNT; i++) {
               // Card card = new Card();
                //String denoination = this.numberToDenomination(i);
                //int point = this.numberToPoint(i);
                //Card card = new Card(pattern,denoination, point);
                Card card = new Card(pattern, i);
               // card.setDenomination(denoination);
               //card.setPattern(pattern);
                cards.add(card);
            }
        }
        return  cards;
    }

    /*  private String numberToDenomination(int number){
          if(number == 1){
              return "A";
          }else if(number == 11){
              return "J";
          }else if(number == 12){
              return "Q";
          }else if(number == 13){
              return "K";
          }

          return String.valueOf(number);
      }

      private int numberToPoint(int number){
          if (number >= 11){
              return 10;
          }
          return number;
      }
      card class가 해야 할 일
  */

    public Card draw(){
        Card selectedCard = getRandomCard();
        cards.remove(selectedCard);
        return selectedCard;
    }

    private Card getRandomCard(){
        int size = cards.size();
        int select = (int)(Math.random()*size);
        return cards.get(select);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }
        return  sb.toString();
    }
}