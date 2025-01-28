package inheritance.constructorChaining;

public class D extends C {
    D(){
        super(5);
        System.out.println("Constructor of D is executed");
//        java: call to super must be first statement in constructor
//        super(5);



    }
}
