
public class arithmetic1 {
    public static void main(String[] args) {
        try {
            int num1 = 30, num2 = 0;
            int res = num1 / num2;
            System.out.println("Result : " + res);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide a number by 0"+e);
        }
    }
}
