package JavaLanguage.Methods;

public class Methods {
    static int logic(int a ,int b , int c , int d ){
        int f = a + b * c * d;
        return f;
    }

    static void sent(){
        System.out.println("sameer sattar shaikh");
    }

    static void sum(int  x, int y){
        int z = x + y;
        System.out.println(z);
    }
    static void sum(int  x, int y , int v){
        int z = x + y * v;
      System.out.println(z);
    }
    static void sum(int  x, int y , int u , int j){
        int z = x + y * u * j;
        System.out.println(z);
    }

    static int sum1(int ...arr){
        int result = 0;
       for(int a : arr) {
        result += a;
       }
       return result;
    }

    static int factorial( int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }


    public static void main(String[] args) {
        int e = logic(1,2,3,48);
        System.out.println(e);

        int k = logic(1,2,38,4);
        System.out.println(k);

        int i = logic(1,28,3,4);
        System.out.println(i);

        int t = logic(1,2,8,488);
        System.out.println(t);

        sent();
        sent();
        sent();
        sent();

        sum(2,3);
        sum(2,3,4);
        sum(2,3,4,5);

        System.out.println(sum1(22));
        System.out.println(sum1(2,3));
        System.out.println(sum1(2,3,5,6,7,8,89,0,00));
        System.out.println(sum1(2,3,3,4,5,6));

        int n  = 7;
        System.out.println(factorial(n));
        
    }    
}
