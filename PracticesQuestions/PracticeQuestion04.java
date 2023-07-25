package JavaLanguage.PracticesQuestions;

import java.util.Scanner;

public class PracticeQuestion04 {
    public static void main(String[] args) {

        // Question 01

        int a = 11;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }

        // Question 02

        int sub1;
        int sub2;
        int sub3;
        Scanner sc = new Scanner(System.in);
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();

        float avg = (sub1 + sub2 + sub3) / 3.0f;
        System.out.println(avg);
        if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("you are passed in all subjects");
        } else {
            System.out.println("your are fail");
        }
        sc.close();

        // Question 03

        float TaxAmount;
        sc = new Scanner(System.in);
        System.out.println("Enter your Income");
        TaxAmount = sc.nextFloat();
        if (TaxAmount >= 250000 && TaxAmount <= 500000) {
            System.out.println("you have to pay 5% tax");
        } else if (TaxAmount >= 500000 && TaxAmount <= 1000000) {
            System.out.println("you have to pay 20% tax");
        } else {
            System.out.println("you have to pay 50% tax");
        }
        sc.close();

        // Question 04

        int num;
        System.out.println("Enter the number");
        sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num == 1) {
            System.out.println("Monday");
        } else if (num == 2) {
            System.out.println("Tuesday");
        } else if (num == 3) {
            System.out.println("Wednesday");
        } else if (num == 4) {
            System.out.println("Thrusday");
        } else if (num == 5) {
            System.out.println("friday");
        } else if (num == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
        sc.close();
        // Question 05

        int year;
        sc = new Scanner(System.in);
        System.out.println("Enter the year");
        year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        sc.close();
        // Question 06

        String Website;
        sc = new Scanner(System.in);
        System.out.println("Enter the website name");
        Website = sc.next();
        if (Website.endsWith(".com")) {
            System.out.println("It is a commercial website");
        } else if (Website.endsWith(".in")) {
            System.out.println("it is an indian website");
        } else if (Website.endsWith(".org")) {
            System.out.println("It is an organixation website");
        } else {
            System.out.println("it is not a website");
        }
        sc.close();

    }
}
