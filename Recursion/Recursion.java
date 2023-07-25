public class Recursion {
    public static void main(String[] args) {
        // number(2);
        // int ans = fabo(55);
        // System.out.println(ans);

        // func(6);
        // funcRev(6);
        // funcBoth(6);

        // int ans = factorial(5);
        // System.out.println(ans);

        // int answer = Sum(5);
        // System.out.println(answer);

        // int answer = sumOfDigits(1342);
        // System.out.println(answer);

        reverse(12345);
        System.out.println(sum);
       
    }

    static void func(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(n - 1);
    }

    static void funcRev(int n) {
        if (n == 0) { // base condition
            return;
        }
        funcRev(n - 1);
        System.out.println(n);
    }

    static void funcBoth(int n) {
        if (n == 0) { // base condition
            return;
        }
        System.out.println(n);
        funcBoth(n - 1);
        System.out.println(n);
    }

    static void number(int n) {
        if (n == 8) { // base condition
            System.out.println(n);
            return;
        }
        System.out.println(n); // body

        number(n + 1);
    }

    static int fabo(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fabo(n - 1) + fabo(n - 2);
    }

    static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return n  * factorial(n-1);
    }

    static int Sum(int n){
        if (n == 1) {
            return 1;
        }
        return n  + Sum(n-1);
    }

    static int sumOfDigits(int n){
        if ( n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10); 
    }

    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int reminder = n % 10;
        sum = sum *10 + reminder;
        reverse(n/10); 
    }


}
