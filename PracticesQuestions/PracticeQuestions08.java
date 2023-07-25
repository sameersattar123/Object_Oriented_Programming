package JavaLanguage.PracticesQuestions;


class Employee {
    int Salary;
    String Name;

    public  int  getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
    public void setName( String n){
        Name = n;
    }
}

class CellPhone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
    public void callfreiend(){
        System.out.println("call from friend");
    }
}

class Sqaure{
    int side;

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    }
}
class rectangular{
    int length;
    int breathe;
    int heigth;

    public int area(){
        return breathe * heigth;
    }

    public int perimeter(){
        return 2 * (breathe + heigth);
    }
}
class circle{
    int radius;
    int pi = 3;
   

    public int area(){
        return pi * radius;
    }

    public int perimeter(){
        return 2 * pi * radius;
    }
}



public class PracticeQuestions08 {
    public static void main(String[] args) {
        // Question 01

        Employee sameer = new Employee();
        sameer.Name = "sameer sattar";
        sameer.Salary = 666;
        System.out.println(sameer.getSalary());
        System.out.println(sameer.getName());
        System.out.println(sameer.getName());

        // Queestion 02
        CellPhone sameerCellPhone = new CellPhone();
        sameerCellPhone.callfreiend();
        sameerCellPhone.ringing();
        sameerCellPhone.vibrating();;

        // Question 03

        Sqaure building = new Sqaure();
        building.side=8;
        System.out.println(building.area());
        System.out.println(building.perimeter());

        // Question 04

        rectangular building2 = new rectangular();
        building2.length=6;
        building2.breathe=7;
        building2.heigth=8;
        System.out.println(building2.area());
        System.out.println(building2.perimeter());

        // Question 05

        circle Circle = new circle();
        Circle.radius=77;
        System.out.println(Circle.area());
        System.out.println(Circle.perimeter());
    }
} 