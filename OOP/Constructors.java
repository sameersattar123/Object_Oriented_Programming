public class Constructors {

   static class JavaExample {
        String we;

        JavaExample(String w) {
            we = w;
        }

        /*
         * This is the Copy Constructor, it
         * copies the values of one object
         * to the another object (the object
         * that invokes this constructor)
         */
        JavaExample(JavaExample je) {
            we = je.we;
        }

        void disp() {
            System.out.println("Website: " + we);
        }

        static class Demo {
            int value1;
            int value2;

            Demo() {
                value1 = 10;
                value2 = 20;
                System.out.println("Inside 1st Constructor");
            }

            Demo(int a) {
                value1 = a;
                System.out.println("Inside 2nd Constructor");
            }

            Demo(int a, int b) {
                value1 = a;
                value2 = b;
                System.out.println("Inside 3rd Constructor");
            }

            public void display() {
                System.out.println("Value1 === " + value1);
                System.out.println("Value2 === " + value2);
            }

            static class Student {
                int rollNumber;
                float marks;
                String name;

                Student(int rno, float marks, String naam) {
                    this.marks = marks;
                    this.name = naam;
                    this.rollNumber = rno;
                }

                Student(int rno, float marks) {
                    this.marks = marks;
                    this.rollNumber = rno;
                }

                Student(int rno) {
                    this.rollNumber = rno;
                }

                Student() {
                    System.out.println("how are you doing");
                }

            }

            public static void main(String[] args) {
                Student sameer = new Student(33333 );
                Student sameer2 = new Student(33 , 33.7f);
                Student sameer3 = new Student(33 , 33.7f , "sameer");
                // Student sameer1 = new Student(33 ,33);
                sameer.marks = 34;
                sameer.rollNumber= 33;
                sameer.name="sammeerrr3333";
                System.out.println(sameer.rollNumber);
                System.out.println(sameer2.rollNumber);
                System.out.println(sameer3.name);

                System.out.println("adxasdxas");
                Demo d1 = new Demo();
                Demo d2 = new Demo(30);
                Demo d3 = new Demo(30,40);
                d1.display();
                d2.display();
                d3.display();

                JavaExample obj1 = new JavaExample("Sameer Sattar");
                obj1.disp();

                /*
                 * Passing the object as an argument to the constructor
                 * This will invoke the copy constructor
                 */
                JavaExample obj2 = new JavaExample(obj1);
                obj2.disp();

            }
        
        }
    }
}
