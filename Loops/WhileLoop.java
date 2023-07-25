package JavaLanguage.Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 90) {
            int b = a + a;
            System.out.println(b);
            a++;
        }

        int c = 100;
        while (a <= 200) {
            System.out.println(c);
            c++;
        }

        int s = 100;
        do {
            System.out.println(s);
            s++;
        } while (s <= 200);

        for (int i = 0; i <= 15; i++) {
            int b = 2 * i + 1;
            System.out.println(b);
        }
        
        int n = 100;
        for (int i = 200; i != n; i--) {
            System.out.println(i);
        }

    }
}
