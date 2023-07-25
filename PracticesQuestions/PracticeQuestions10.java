package JavaLanguage.PracticesQuestions;

import java.util.Scanner;

import JavaLanguage.Loops.ForLoop;

public class PracticeQuestions10 {
    public static void main(String[] args) {
        System.out.println("Enter Any Number");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Not a Even Number");
        }

        String CheckEvenNum = (num % 2 == 0) ? "Even Number" : "Not a Even Number";
        System.out.println(num + " is " + CheckEvenNum);

        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }
        if (isVowel) {
            System.out.println(ch + " This is a Vowel");
        } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Consonant");
        } else {
            System.out.println(ch + " is not a Alphabet");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Fist Number");
        int num1 = sc.nextInt();
        System.out.println("Enter a Fist Number");
        int num2 = sc.nextInt();
        System.out.println("Enter a Operator");
        char opr = sc.next().charAt(0);
        int output;

        if (opr == '+') {
            output = num1 + num2;
            System.out.println(output);
        } else if (opr == '-') {
            output = num1 - num2;
            System.out.println(output);
        } else if (opr == '*') {
            output = num1 * num2;
            System.out.println(output);
        } else if (opr == '/') {
            output = num1 / num2;
            System.out.println(output);
        } else {
            System.out.println("Operator is not correct");
        }

        int fact = 8;
        // int num = 1;
        for (int i = num; i <= fact; i++) {
        num = num * i;
        }
        System.out.println("Factorial of " + fact + " is " + num);

        int count = 10; int num11 = 0; int num22 = 1;
        System.out.println("Fabonnacci Series of " + count + " numbers : " );
        for (int i = 1; i <= count; i++) {
        System.out.println(num11 + " ");

        int sum = num1 + num2;
        num11 = num22;
        num22 = sum;
        }

        int table = 10;
        for (int i = 1; i < table; i++) {
            int ans = table * i;
            System.out.println(table + " * " + i + " = " + ans);
        }
    }

}
