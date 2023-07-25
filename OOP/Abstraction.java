

abstract class Employees {
    int age;

    static void methods(){
        System.out.println("sameer");
    }

    void method2(){
        System.out.println("sdjhuj");
    }
    abstract void JuniorEmployee();

    abstract void SeniorsEmployees();

}

class Student extends Employees {
    public int Age(int age) {
        return this.age = age;
    }
    
    
    void method2(){
        System.out.println("sdjhujscsdccdsdc");
    }

    void JuniorEmployee() {
        System.out.println("Student 00");
    }

    void SeniorsEmployees() {
        System.out.println("senior 0");
    }
}

class Student1 extends Employees {
    void JuniorEmployee() {
        System.out.println("Student 01");
    }
    void method2(){
        System.out.println("sdjhujdfgvdvdfd");
    }

    void SeniorsEmployees() {
        System.out.println("senior 01");
    }
}

class Student2 extends Employees {
    int a = 77;
    void JuniorEmployee() {
        System.out.println("Student 02");
    }
    void method2(){
        System.out.println("sdjhujdfgvdvdfd");
    }

    void SeniorsEmployees() {
        System.out.println("senior 02");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Student sameer = new Student();
        sameer.JuniorEmployee();
        sameer.SeniorsEmployees();
        int age = sameer.Age(22222);
        System.out.println(age);
        Student.methods();

        Student1 sameer1 = new Student1();
        sameer1.JuniorEmployee();
        sameer1.SeniorsEmployees();
        Student1.methods();

        Employees sameer2 = new Student2();
        sameer2.JuniorEmployee();
        sameer2.SeniorsEmployees();
        Student2.methods();
        sameer2.method2();
        Employees.methods();

    }
}
