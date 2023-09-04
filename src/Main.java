import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        File ordbok = new File("/Users/oskarsalo/IdeaProjects/VG uppgift java/src/words.txt");

        Scanner textScanner = new Scanner(ordbok);
        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        char[] textArray = new char[0];
        while (textScanner.hasNextLine()) {
            words.add(textScanner.nextLine());
            String hidden_text = words.get((int) (Math.random() * words.size()));
            textArray = hidden_text.toCharArray();
            char[] myAnswers = new char[textArray.length];
            for (int i = 0; i < textArray.length; i++)
                myAnswers[i] = '?';

        }

        boolean finished = false;

        while (finished == false)
            System.out.println("***********************************");
        String letter = input.next();
        //kolla efter input
        while (letter.length() != 1 || Character.isDigit(letter.charAt(0)))
            System.out.println("Error med input - Försök igen");
        letter = input.next();

        //Kollar om bokstav är i det efterfrågade ordet
        boolean found = false;
        for (int i = 0; i < textArray.length; i++) {
            if(letter.charAt(0) == textArray[i])
                myAnswers[i] = textArray[i];
                found = true;

        }
    }

}