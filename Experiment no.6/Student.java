
public class Student {

    String name;
    String classs;
    String division;
    int Rollno;

    Student(String n, String c, String d, int R) {
        name = n;
        classs = c;
        division = d;
        Rollno = R;
    }

    public void show() {
        System.out.println(name + " " + classs + " " + division + " " + Rollno);
    }

    public void showNextrollno() {

        Rollno = Rollno + 1;
        System.out.println("ROll no of next student is  :" + Rollno);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rohit", "2ndyear", "Syb", 213);

        s1.show();
        s1.showNextrollno();
    }

}
