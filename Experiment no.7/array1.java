
public class array1 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            System.out.println("Element 6 : " + arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred!" + e);
        }
    }
}
