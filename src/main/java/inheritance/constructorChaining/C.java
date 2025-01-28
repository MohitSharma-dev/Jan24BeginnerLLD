package inheritance.constructorChaining;

public class C extends B {
    C(){
        System.out.println("Constructor of C is executed");
    }

    C(int x){
        this();
        System.out.println("Parameterised Constructor of C is executed");
//        java: call to this must be first statement in constructor
//        this();
    }
}

// super : helps you to refer to parent class
// this : helps you to refer to the current class


// java says that "Hey parent class private attributes are not going to be inherited"