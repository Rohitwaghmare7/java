import java.util.*;

class employeey {
    int EmpID;
    String Name;
    int EmpType;
    double salary;

    public void Get_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EmpID");
        EmpID = sc.nextInt();
        System.out.println("Enter Name");
        Name = sc.next();
        System.out.println("Enter EmpType 1)labour 2)admin 3)hr");
        EmpType = sc.nextInt();
    }

    public void Display_details() {
        System.out.println("EmpID : " + EmpID);
        System.out.println("Name : " + Name);
        System.out.println("EmpType : " + EmpType);
    }

    public void Calculate_salary() {
        if (EmpType == 1) {
            salary = 10000;
            System.out.println("Salary is : " + salary);
        }
        if (EmpType == 2) {
            salary = 50000;
            System.out.println("Salary is : " + salary);
        }
        if (EmpType == 2) {
            salary = 35000;
            System.out.println("Salary is : " + salary);
        }
    }
}

public class employeee {
    public static void main(String[] args) {
        employeey e1 = new employeey();
        e1.Get_details();
        e1.Display_details();
        e1.Calculate_salary();
    }
}