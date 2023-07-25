package JavaLanguage.PracticesQuestions;
import java.util.Scanner;

public class PracticeQuestions01{
    public static void main(String[] args) {

        // Question 01
        int a = 56;
        int b = 76;
        int c = 576;
        int sum = a + b + c;
        System.out.println(sum);

        // Question 02
        int sub1 = 46;
        int sub2 = 50;
        int sub3 = 60;
        float CGPA = (sub1 + sub2 + sub3)/30;
        System.out.println(CGPA);

        // Question 03
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hello " + name + ", have a good day");
        input.close();

        // Question 04
        System.out.println("Enter the number into Kilometers");
        Scanner number = new Scanner(System.in);
        int km = number.nextInt();
        float miles = km/1.609f;
        System.out.println(miles);
        number.close();

        // Question 05
        System.out.println("Enter the  number");
        Scanner num = new Scanner(System.in);
        System.out.println(num.hasNextInt());
        num.close();
    }
}
