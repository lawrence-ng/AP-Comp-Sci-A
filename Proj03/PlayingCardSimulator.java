import java.util.Random;

public class PlayingCardSimulator
{
    public static void main(String[] args) {
    Random rng = new Random();
    int randomCard = rng.nextInt(12) + 1;
    int randomSuit = rng.nextInt(3) + 1;
    
    if (randomCard == 11) {
        System.out.print("J");
    }
    
    else if (randomCard == 12) {
        System.out.print("Q");
    }
    
    else if (randomCard == 13) {
        System.out.print("K");
    }
    
    else {
        System.out.print(randomCard);
    }
    
    if (randomSuit == 1) {
        System.out.print("\u2660");
    }
    
    else if (randomSuit == 2) {
        System.out.print("\u2665");
    }
    
    else if (randomSuit == 3) {
        System.out.print("\u2666");
    }
    
    else if (randomSuit == 4) {
        System.out.print("\u2663");
    }
}
    
}
