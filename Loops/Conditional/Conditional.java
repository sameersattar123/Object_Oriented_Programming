package JavaLanguage.Loops.Conditional;

public class Conditional {
    public static void main(String[] args) {
        int age = 100;
        if (age == 18) {
            System.out.println("your age is 18");
        } else if (age >= 18) {
            System.out.println("your age is greater than 18");
        } else {
            System.out.println("ypur age is less than 18");
        }

        int person1 = 88;
        int person2 = 84;
        int person3 = 88;
        if (person1 >= 80 && person2 >= 80 && person3 >= 80) {
            System.out.println("your age is greater than 80");
        } else if (person1 >= 80 || person2 >= 80 || person3 >= 80) {
            System.out.println("your age is not greater than 80");
        }

    }
}