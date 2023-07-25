package input;
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        System.out.println("Taking input of Subject marks");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Taking input of Subject1 marks");
        int sub1 = input.nextInt();

        System.out.println("Taking input of Subject2 marks");
        int sub2 = input.nextInt();

        System.out.println("Taking input of Subject3 marks");
        int sub3 = input.nextInt();

        System.out.println("Taking input of Subject4 marks");
        int sub4 = input.nextInt();

        System.out.println("Taking input of Subject5 marks");
        int sub5 = input.nextInt();
        
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks  ");
        System.out.println(totalMarks);
        
        float div = (totalMarks/500f);
        float percentage = (div*100);
        System.out.println("percentage");
        System.out.println(percentage);


        input.close();
    }
}