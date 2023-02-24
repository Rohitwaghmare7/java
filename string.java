import java.util.*;

class rohit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("eneter a two strings :");

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(s1.toUpperCase());
        System.out.println();

        s1 = s1.concat(s2);
        System.out.println(s1);
        System.out.println();

        System.out.println(s1.toUpperCase());

    }
}