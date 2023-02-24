import java.util.Scanner; //Rohit waghmare Roll no :213

public class palindeome1 {
    static boolean pal(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("enetr a string");   
        str = sc.nextLine();

        if (pal(str)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palondrome");
        }
    }
}
