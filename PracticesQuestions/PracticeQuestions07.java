package JavaLanguage.PracticesQuestions;

public class PracticeQuestions07 {

    static void table( int n){
    if(n==0 || n==1){
    System.out.println(1);
    }
    else{
    for(int i = 1; i<=10; i++){
    System.out.println(n + " x " + i + " = " + n*i);
    }
    }
    }

    static void pattern1(int n){
    for(int i =0; i<n; i++){
    for( int j=0 ; j<i+1; j++){
    System.out.print("* ");
    }
    System.out.println();
    }
    }

    static int sumEven(int n){
    if(n ==1){
    return 1;
    } else {
    return n = n + sumEven(n-1);
    }
    }

    static void pattern2(int n){
    for(int i = n; i>=0; i--){
    for( int j=0 ; j<i; j++){
    System.out.print("* ");
    }
    System.out.println();
    }
    }

    static int fab(int n ){
        if( n==1 || n == 2){
            return n-1;
        }else {
            return n =  fab(n-2) + fab(n-1); 
        }
    }

    static int avg( int a , int b){
        int x = (a + b) / 2;
        return x;
    }


    public static void main(String[] args) {

        // Question 01
        table(90);
        System.out.println(" ");
        table(91);
        System.out.println(" ");
        table(92);

        // Question 02
        pattern1(8);
        System.out.println("");
        pattern1(9);
        System.out.println("");
        pattern1(10);
        
        // Question 03
        int b = sumEven(6);
        System.out.println(b);
        
        // Question 04
        pattern2(4);
        System.out.println("");
        pattern2(9);
        System.out.println("");
        pattern2(10);

        // Question 05
        int x = fab(6);
        System.out.println(x);

        // Question 06
        int y = avg(2,2);
        System.out.println(y);
    }
}
