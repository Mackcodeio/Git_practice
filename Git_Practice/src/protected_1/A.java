package protected_1;

public class A {
    protected void msg(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.msg();
    }
}
