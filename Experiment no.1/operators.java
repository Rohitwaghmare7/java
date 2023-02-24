import java.util.Scanner; //Rohit waghmare Roll no:213;

public class operators{
    public void Assignment() {
        int n1, n2;
        System.out.println("1] Assignment operators : ( = )");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n1 :");
        n1 = sc.nextInt();
        System.out.print("enter n2 :");
        n2 = sc.nextInt();
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println();
    }

    public void Arithmetic() {
        int n1, n2;
        System.out.println("2] Arithmetic operators : (+,-,*,%,/)");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n1 :");
        n1 = sc.nextInt();
        System.out.print("enter n2 :");
        n2 = sc.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n2 + " - " + n1 + " = " + (n2 - n1));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
        System.out.println(n2 + " / " + n1 + " = " + (n2 / n1));
        System.out.println();
    }

    public void Relationl() {
        int n1, n2;
        System.out.println("3] Relationl operators : (<,<=,>,>=,==,!=)");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n1 :");
        n1 = sc.nextInt();
        System.out.print("enter n2 :");
        n2 = sc.nextInt();
        System.out.println(n1 + "< " + n2 + " = " + (n1 < n2));
        System.out.println(n1 + "> " + n2 + " = " + (n1 > n2));
        System.out.println(n1 + ">=" + n2 + " = " + (n1 >= n2));
        System.out.println(n1 + "<=" + n2 + " = " + (n1 <= n2));
        System.out.println(n1 + "==" + n2 + " = " + (n1 == n2));
        System.out.println(n1 + "!=" + n2 + " = " + (n1 != n2));
        System.out.println();
    }

    public void Conditionaloperator() {
        int n1, n2;
        System.out.println("4] Conditional operator (&&,||)");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n1 :");
        n1 = sc.nextInt();
        System.out.print("enter n2 :");
        n2 = sc.nextInt();
        System.out.println("(n1>n2) && (n1<n2)");
        System.out.println((n1 > n2) && (n1 < n2));
        System.out.println("(n1>n2) || (n1<n2)");
        System.out.println((n1 > n2) || (n1 < n2));
        System.out.println();
    }

    public void bitwiseoperator() {
        int n1, n2;
        System.out.println("5] bitwise operator (&,|,^)");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n1 :");
        n1 = sc.nextInt();
        System.out.print("enter n2 :");
        n2 = sc.nextInt();
        System.out.println(n1 + " & " + n2 + " = " + (n1 & n2));
        System.out.println(n1 + " | " + n2 + " = " + (n1 | n2));
        System.out.println(n1 + " ^ " + n2 + " = " + (n1 ^ n2));
        System.out.println();
    }

    public void Shiftoperator() {
        int n1, n2;
        System.out.println("6] shift operator (>>,<<,)");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n1 :");
        n1 = sc.nextInt();
        System.out.print("enter n2 :");
        n2 = sc.nextInt();
        System.out.println(n1 + " >> " + n2 + " = " + (n1 >> n2));
        System.out.println(n1 + " << " + n2 + " = " + (n1 << n2));
        System.out.println();
    }

    public static void main(String[] args) {
        operators ob = new operators();
        ob.Assignment();
        ob.Arithmetic();
        ob.Relationl();
        ob.Conditionaloperator();
        ob.bitwiseoperator();
        ob.Shiftoperator();
    }
}
