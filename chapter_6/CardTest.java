package chapter_6;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 = "+c1.kind+", "+c1.number+", 높인 "+c1.width+", 크긴 "+c1.height+ " 입니다.");
        System.out.println("c2 = "+c2.kind+", "+c2.number+", 높인 "+c2.width+", 크긴 "+c2.height+ " 입니다.");

        Card.width = 50;
        Card.height = 70;

        System.out.println("c1 = "+c1.kind+", "+c1.number+", 높인 "+c1.width+", 크긴 "+c1.height+ " 입니다.");
        System.out.println("c2 = "+c2.kind+", "+c2.number+", 높인 "+c2.width+", 크긴 "+c2.height+ " 입니다.");

        System.out.println(Card.height);
    }    
}

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}

