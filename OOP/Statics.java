public class Statics {
    static class Human {
        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        Human(int age, String name, int salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population += 1;
        }
    }

    public static void main(String[] args) {
        Human student = new Human(20, "sameer sattar", 34440, false);
        Human student2 = new Human(20, "sameer sattar", 34440, false);
        Human student3 = new Human(20, "sameer sattar", 34440, false);
        System.out.println(student.age);
        System.out.println(student.married);
        System.out.println(student.salary);
        System.out.println(student.population);
        System.out.println(student2.population);
        System.out.println(student3.population);
    }
}
