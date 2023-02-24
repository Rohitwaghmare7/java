import java.util.*;

public class comparearrey {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 6 };

        System.out.println((array1 == array2));

        System.out.println("origional arrey");
        for(int i=0;i<array1.length;i++)
        {
            System.out.println(array1[i]+" ");
        }
        System.out.println();

        System.out.println("array im reverse order ");

        for(int i = array1.length-1;i>=0;i--)
        {
            System.out.println(array1[i]);
        }
    }
}
