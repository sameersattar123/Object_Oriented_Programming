package JavaLanguage;

public class Main {

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 1) {
            return 1;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    static int ProdOfDig(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * ProdOfDig(n / 10);
    }

    static void Concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Concept(--n);
    }

    static int sum = 0;

    static void Reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        Reverse(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Hello world sameer sattar");
        System.out.print("the sum is ");
        int num1 = 234444;
        int num2 = 243;
        int num3 = 73;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        char character = 'A';
        System.out.print(character);

        fun(6);
        funRev(6);
        funBoth(6);
        System.out.println(fact(5));
        System.out.println(sumOfDigits(12345678));
        System.out.println(ProdOfDig(9512));
        Concept(8);
        Reverse(12345);
        System.out.println(sum);

    }
}
