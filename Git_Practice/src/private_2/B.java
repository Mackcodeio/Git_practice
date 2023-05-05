package private_2;

public class B {
    private B(){ // private constructor

    }

    void msg(){
        System.out.println("Hello Java");
    }
}
class simple{
    public static void main(String[] args) {
       //  B obj=new B();  // compiler Time error.

    }
}
