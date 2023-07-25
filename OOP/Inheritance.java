public class Inheritance{
    static class Student1 {
    int x;
    int y;
    int z;
    
    
       Student1(int x){
        this.x = x;
           System.out.println(x);
        }
    }
    static class Student2 extends Student1 {
        Student2(int x , int y){
            super(x);
        this.y = y;
            System.out.println(x + y);
        }
    }
    static class Student3 extends Student2 {
        Student3(int x , int y , int z){
            super(x,y);
        this.z = z;
            System.out.println(x + y + z);
        }
    }
    static class Student4 extends Student3 {
        int g;
        Student4(int x, int y , int z , int g){
            super(x, y, z);
             this.g = g;
            System.out.println(x + y + z + g );
        }
    }
   public static void main(String[] args) {

    Student4 sameer22 = new Student4(2,3,4,5);
    System.out.println(sameer22.g);

   } 
}
