package private_1;

public class A{
    private int data=40;                    // called Data member or variable.
    private void msg() {                    // Method name msg() with not reture type
        System.out.println("Hello java");
    }
        public static void main(String[] args) {
            A obj= new A();
            System.out.println(obj.data);
            obj.msg();

        }
}

class Simple{
    public static void main(String[] args) {
        A obj = new A();
       // System.out.println(obj.data);  // Compile Time Error
        // obj.msg();                     // Compile Time Error
    }
}
