import java.lang.Package;

class employe {

    int id, salary;
    String name;

    employe() {
        name = "Rohit waghmare";
        id = 213;
        salary = 100000;
        System.out.println("name is :" + name);
        System.out.println("id is :" + id);
        System.out.println("salary is :" + salary);
    }

    employe(int i, int s, String n) {
        id = i;
        name = n;
        salary = s;
    }

    void disp() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class employes {

    public static void main(String args[]) {

        employe b1 = new employe();
        employe s1 = new employe(213, 100000, "Rohit");
        employe s2 = new employe(218, 100000, "Rafat");

        b1.disp();
        s1.disp();
        s2.disp();
    }
}
