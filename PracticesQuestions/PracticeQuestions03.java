package JavaLanguage.PracticesQuestions;

import java.util.Scanner;

public class PracticeQuestions03 {
    public static void main(String[] args) {
        // QUESTION 01
        String name = "SAMEER SATTAR SHAIKH";
         name = name.toLowerCase();
        System.out.println(name);

        // QUESTION 02
        String text = "SAMEER SATTAR SHAIKH";
        text = text.replace(" ", "_");
        System.out.println(text);

        //QUESTION 03
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();

        String Letter = "Dear name , thanks a lot";
        Letter = Letter.replaceFirst("name", Name);
        System.out.println(Letter);

        sc.close();

        //Question 04
        String name2 = "Dear Sameer,\n your are very good programmer ";
        System.out.println(name2);
    }
}
