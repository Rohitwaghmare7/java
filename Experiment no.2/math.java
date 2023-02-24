import java.util.Scanner; //Rohit Waghamre Roll no:213

public class math {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values for a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("root1: " + x1);
        System.out.println("root2: " + x2);

    }

}
