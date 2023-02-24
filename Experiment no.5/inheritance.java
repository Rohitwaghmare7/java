
class person {
    String name;
    int age;
    String city;

    void show() {
        System.out.println("-----------------------------");
    }
}

class student extends person {
    int rollno;
    String dept;

    void display() {
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
        System.out.println("city" + city);
        System.out.println("rollno :" + rollno);
        System.out.println("dept :" + dept);
    }
}

class teacher extends person {
    String subject;
    String branch;

    void display() {
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
        System.out.println("city :" + city);
        System.out.println("subjet :" + subject);
        System.out.println("branch :" + branch);
    }
}

class emp extends person {
    int id;
    int sal;

    void display() {
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("city :" + city);
        System.out.println("id :" + id);
        System.out.println("sal :" + sal);
    }

}

public class inheritance {

    public static void main(String[] args) {
        student p1 = new student();
        System.out.println("persone 1");
        p1.name = "rohit";
        p1.age = 20;
        p1.city = "dubai";
        p1.rollno = 213;
        p1.dept = "cse";
        p1.show();
        p1.display();

        emp e1 = new emp();
        System.out.println("emp");
        e1.name = "rafat";
        e1.age = 18;
        e1.city = "dubai";
        e1.sal = 120000;
        e1.id = 700;
        e1.show();
        e1.display();

        teacher t1 = new teacher();
        System.out.println("emp");
        t1.name = "rafat";
        t1.age = 18;
        t1.city = "england";
        t1.subject = "life";
        t1.branch = "computer science";
        t1.show();
        t1.display();
    }
}
