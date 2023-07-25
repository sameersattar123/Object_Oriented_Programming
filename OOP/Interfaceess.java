interface A {
    void Aclass();
    void ABclass();
    void ABcclass();
}
interface C extends A {
    void AAclass();
    void ABBclass();
}

class B implements C {
    public void Aclass(){
        System.out.println("sss");
    }
    public void ABclass(){
        System.out.println("sssaxaxaxazxa");
        
    }
    public void ABcclass(){
        System.out.println("sssadxazxazx");

    }
    public  void AAclass(){
        System.out.println("sssadxazxazx");

    }
    public  void ABBclass(){
        System.out.println("sssadxazxazx");

    }
}

public class Interfaceess {
    public static void main(String[] args) {
        B sameer = new B();
        sameer.ABcclass();
        sameer.Aclass();
        sameer.ABcclass();
        sameer.ABBclass();
        sameer.AAclass();
    }
}
