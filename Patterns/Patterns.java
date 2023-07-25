package JavaLanguage.Patterns;

public class Patterns {
    static void Pattern01(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern02(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern03(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern04(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void Pattern05(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int totalCol = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern28(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int totalCol = i > n ? 2 * n - i : i;
            int totalSpaces = n - totalCol;    
            for (int s = 1; s < totalSpaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern30(int n){
        for (int i = 1; i <= n; i++) {
            int totalSpaces = n - i ;    
            for (int s = 0; s < totalSpaces; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
    static void Pattern17(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int totalCol = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   
    static void Pattern300(int n){
        for (int i = 1; i <= n; i++) {
            int totalSpaces = n - i ;    
            for (int s = 0; s < totalSpaces; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    Pattern01(4);
    Pattern02(4);
    Pattern05(5);
    Pattern17(7);
    Pattern28(5);
    Pattern30(6);
}
}
