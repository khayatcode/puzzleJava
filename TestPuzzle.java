import java.util.Random;
import java.util.ArrayList;


public class TestPuzzle {
    
    public static void main(String[] args){
        Puzzle generateRandom = new Puzzle();

        System.out.println("\n----- Generate Random Array Number From 1-25 -----");
        generateRandom.getTenRolls();

        System.out.println("\n----- Generate Random Letter -----");
        System.out.println(generateRandom.getRandomLetter());

        System.out.println("\n----- Generate Random 8 Character Password -----");
        System.out.println(generateRandom.getRandomPassword());

        System.out.println("\n----- Generate Random 8 Random Password's -----");
        System.out.println(generateRandom.getNewPasswordSet(5));

        System.out.println("\n----- Shuffle List -----");
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(generateRandom.shuffleArray(list));








    }
}
