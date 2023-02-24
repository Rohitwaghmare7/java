  public class overloadfun { // ROhit waghmare Roll no : 213
    public int add(int x, int y) {
        return (x + y);
    }

    public double add(double x, double y) {
        return (x + y);
    }

    public int sub(int x, int y) {
        return (x - y);
    }

    public double sub(double x, double y) {
        return (x - y);
    }

    public int multi(int x, int y) {
        return (x * y);
    }

    public double multi(double x, double y) {
        return (x * y);
    }

    public int div(int x, int y) {
        return (x / y);
    }

    public double div(double x, double y) {
        return (x / y);
    }

    public static void main(String args[]) {
        overloadfun s = new overloadfun();
        System.out.println(s.add(50, 100));
        System.out.println(s.add(1.5, 2.5));
        System.out.println(s.sub(10, 20));
        System.out.println(s.sub(10.5, 20.5));
        System.out.println(s.multi(10, 20));
        System.out.println(s.multi(1.5, 2.5));
        System.out.println(s.div(10, 20));
        System.out.println(s.div(10.5, 20.5));
    }
}
