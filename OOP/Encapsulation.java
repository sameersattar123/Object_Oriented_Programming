
class Cat{
    private int mood = 50;
    private int hungry = 50;
    private int energy = 50;
    
public void sleep(){
    System.out.println("sleep ..");
    hungry++;
    energy++;
}
public void feed(){
    System.out.println("feed ..");
    mood++;
    energy--;
    meow();
}
public void play(){
    System.out.println("play ..");
    hungry--;
    mood++;
    meow();
}

private void meow(){
    System.out.println("meow");
}

public int getMood(){
    return mood;
}
public int getHungery(){
    return hungry;
}
public int getEnergy(){
    return energy;
}
}

public class Encapsulation {





    
    private int num = 999999;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

public static void main(String[] args) {
    // Encapsulation number = new Encapsulation();
    // System.out.println(number.getNum());
    // number.setNum(4444);
    // System.out.println(number.getNum());

    Cat cat = new Cat();
    cat.feed();
    cat.play();
    cat.feed();
    cat.sleep();

    System.out.println(cat.getEnergy());
    System.out.println(cat.getHungery());
    System.out.println(cat.getMood());

    
    
}
}

