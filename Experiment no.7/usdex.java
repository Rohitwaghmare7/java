class myexception extends Exception {
    String str1;

    myexception(String str2) {
        str1 = str2;
    }

    public String tostring() {
        return ("my excepton occured :" + str1);
    }
}

public class usdex {
    public static void main(String[] args) {
        try {
            System.out.println("starting of try block");
            throw new myexception("this is my error massage");
        } catch (myexception exp) {
            System.out.println(("catch block"));
            System.out.println(exp);
        }
    }
}
