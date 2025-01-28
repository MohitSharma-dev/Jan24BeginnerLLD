package inheritance.constructorChaining;

public class Client {
    public static void main(String[] args) {
        System.out.println("Object of D is going to be created");
        D d = new D();

        System.out.println("Object of B is going to be created");
        B b = new B();
    }
}
