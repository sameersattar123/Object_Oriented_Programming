import java.util.ArrayList;

public class Polymoriphism {

    // Compile time / Static polymorphism (Overloading);

    int sum(int x) {
        return x + x;
    }

    int sum(int x, int y) {
        return x + y;
    }

    int sum(int x, int y, int z) {
        return x + y + z;
    }

    // Runtime / Dynamic Polymorphirm (Overiding);

   static class Sum1{
        public void sumOfTwo(){
            System.out.println("Sum of Two in Sum1");
        }
    };

   static class Sum2 extends Sum1{
        public void sumOfTwo(){
            System.out.println("Sum of Two in Sum2");
        }
    };

    public static void main(String[] args) {

        // overloading
        Polymoriphism adding = new Polymoriphism();
        System.out.println(adding.sum(2, 3));
        System.out.println(adding.sum(2, 3, 4));
        System.out.println(adding.sum(2));

        // overriding   // static methods can not be override
        Sum1 a = new Sum2(); 
        a.sumOfTwo();
       
    }
}
