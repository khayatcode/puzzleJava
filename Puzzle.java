import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Puzzle {
    
    public void getTenRolls(){
        ArrayList<Integer> rollsArray = new ArrayList<Integer>();
        Random randomNumber = new Random();
        for(int i = 0; i < 10; i++){
            int randomRoll = randomNumber.nextInt(20) + 1;
            rollsArray.add(randomRoll);
        }
        System.out.println(rollsArray);
    }

    public char getRandomLetter(){
        Random randomNumber = new Random();
        int num = randomNumber.nextInt(26);
        char[] alphabet = new char[26];
        char letter = 'a';
        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = letter;
            letter++;
            if(letter == '{'){
                break;
            }
        }
        char randomLetter = alphabet[num];
        return randomLetter;

    }

    public String getRandomPassword(){
        String password = "";

        for(int i = 0; i < 8; i++){
            char randomLetter = getRandomLetter();
            password = password + randomLetter;
        }

        return password;
    }

    public ArrayList<String> getNewPasswordSet(int number){
        ArrayList<String> passwordList = new ArrayList<String>();

        for(int i = 0; i < number; i++){
            String password = getRandomPassword();
            passwordList.add(password);
        }
        return passwordList;
    }

    public ArrayList<String> shuffleArray(ArrayList<String> list){
        ArrayList<String> shuffledList = new ArrayList<String>();
        Random randomNumber = new Random();
        int listSize = list.size();
        for(int i = 0; i < listSize; i++){
            int randomIndex = randomNumber.nextInt(list.size());
            String randomString = list.get(randomIndex);
            shuffledList.add(randomString);
            list.remove(randomIndex);
        }
        return shuffledList;
    }
}
