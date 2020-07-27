package lesson09;

import java.util.Arrays;

/**
 * JavaAdvanced
 * 27.07.20 19: 09
 */
public class Main {
    public static void main(String[] args) {
        String[] bankData = {"1234576487658953 Andry", "1334576487658978 Ivan"};
        Card[] cards = cardClient(bankData);
        printArrayCard(cards);
        System.out.println(Arrays.toString(cards));

    }

    public static Card[] cardClient(String[] array) {
        Card[] cards = new Card[array.length];
        for (int i = 0; i < array.length; i++) {
            String[] rez = array[i].split(" "); //split содержит регулярное выражение
            //new Person(rez[1]);
            switch (getCardType(rez[0])) {
                case 1:
                    cards[i] = new Master(new Person(rez[1]), rez[0]);
                    break;
                case 2:
                    cards[i] = new Visa(new Person(rez[1]), rez[0]);
                    break;
                default:
                    System.out.println("error");
            }
            //cards[i] = new Card(new Person(rez[1]), rez[0]);
        }
        return cards;
    }


    public static int getCardType(String number) {
        if (number.startsWith("12")) return 1;
        if (number.startsWith("13")) return 2;
        return 0;
    }

    public static void printArrayCard(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card.toSecureString());
        }
    }
}
