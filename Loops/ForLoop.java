package JavaLanguage.Loops;

// import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // print number from 1 to n

        // System.out.println("Type the Number");
        // Scanner num = new Scanner(System.in);
        // int n = num.nextInt();

        // char chart = num.next().trim().charAt(8);
        // System.out.println(chart);


        // for(int i=1; i<=n; i++){
        //     System.out.println(i + " ");
        //     System.out.println("sameer sattar");
        // }

        // int i =0;
        // while(i<=n){
        //     System.out.println(i + " ");
        //     System.out.println("sameer sattar");
        //     i++;
        // }

        // int n= 45555666;
        // int count = 0; 
        // while(n > 0){
        //     int rem = n % 10;
        //     if(rem == 6){
        //         count++;
        //     }

        //     n = n / 10;
        // }
        // System.out.println(count);

        String num = "23597"; 
        String reverseNum  = "";
        int numLength = num.length();

        for(int i=(numLength - 1); i>=0; i--){
            reverseNum = reverseNum + num.charAt(i);
        }
        System.out.println(reverseNum);

       


        // num.close();
    }
}
