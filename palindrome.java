import java.util.*;

public class palindrome {
    static boolean isPalindrome(String str) {
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
        String str, str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two strings : ");

        str = sc.next();
        str2 = sc.next();

        System.out.println("String 1 :");

        if (isPalindrome(str)) {
            System.out.println("It is a pallindrome");
        } else {
            System.out.println("It is not a pallindrome");
        }
        System.out.println();

        System.out.println("String 2 :");

        if (isPalindrome(str2)) {
            System.out.println("It is a pallindrome");
        } else {
            System.out.println("It is not a pallindrome");
        }
    }
}