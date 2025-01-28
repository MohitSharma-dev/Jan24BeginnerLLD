package copyConstructor;

public class Client {
    public static void main(String[] args) {

        Student st = new Student(1 , 26 , 80.0 , 2020);

//        we want to create another student but we want to copy it from st
        Student st1 = st;
        System.out.println("");

//        Student st2 = new Student(
//                st2.getId();
//        );

        Student st3 = new Student(st);
        System.out.println("");

//        st and st3 might belong to same Batch
//        if I have a Batch class everyone
    }
}
