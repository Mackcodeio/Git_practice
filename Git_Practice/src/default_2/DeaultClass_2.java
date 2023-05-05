package default_2;

import default_1.DeaultClass_1;

public class DeaultClass_2 {
    public static void main(String[] args) {
        DeaultClass_1 obj = new DeaultClass_1();
       // obj.msg();        // Compiler Time Error.

        // the scope of class DeaultClass_1 and its method msg() is default so it cannot be accessed from outside the package.
    }
}
