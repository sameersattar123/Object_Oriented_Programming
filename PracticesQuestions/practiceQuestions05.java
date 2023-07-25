package JavaLanguage.PracticesQuestions;

public class practiceQuestions05 {
    public static void main(String[] args) {
        // Question 01
        int a = 4;
        for (int i = a; i > 0; i--) {
        for (int j = 0; j < i; j++) {
        System.out.print("* ");
        }
        System.out.println("\n");
        }

        // Question 02
        int sum = 0;
        int b = 5;
        for (int i = 0; i < b; i++) {
            sum = sum + (2*i + 1);
        }
        System.out.println(sum);

        // Question 03

        int n =5;
        int table = 10;
        for ( int i = table; i >=1 ; i-- ){
            int  n1 = n * i; 
            System.out.println(n + " * " + i + " = " + n1 );
        }

        // Question 04;
        
        int m = 5;
        int fact =  1; 
            for ( int i = 1; i<=m ; i++){
                fact = i * fact;
            }   
            System.out.println(fact);
    }
}
