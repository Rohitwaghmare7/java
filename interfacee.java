
class a {
    void fun1() {
        System.out.println("fun1-a-perent");
    }
}

interface a2 {
    public void fun11();
}

interface a3 {
    public void fun12();
}

class b extends a implements a2, a3 {
    public void fun11() {
        System.out.println("fun11-b-child");
    }

    public void fun12() {
        System.out.println("fun12-b-child");
    }

    void fun2() {
        System.out.println("fun-2-child");
    }

}

    public class interfacee {

    public static void main(String[] args) {
        b ob = new b();
        ob.fun2();
        ob.fun12();
        ob.fun11();
        ob.fun1();
    }
}
