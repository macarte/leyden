import java.lang.invoke.MethodType;
import java.lang.ref.WeakReference;
import java.util.HashMap;
public class MyTest {

    public static void main(String... av) {

        System.gc();
        System.gc();
        System.out.println("\n\n\nt1========================================");
        MethodType t1 = MethodType.methodType(Object.class, Test1.class);

        System.out.println("\n\n\nt2========================================");
        MethodType t2 = MethodType.methodType(Object.class, Test2.class);

        System.out.println("\n\n\nt3========================================");
        MethodType t3 = MethodType.methodType(Object.class, Test3.class);
    }
}

class Test1 {}
class Test2 {}
class Test3 {}
