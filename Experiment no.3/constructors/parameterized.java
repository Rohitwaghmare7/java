public class parameterized { // Rohit waghmare Roll no 213

        int id;
        String name;

        parameterized(int i, String n) {
                id = i;
                name = n;
        }

        void display() {
                System.out.println(id + " " + name);
        }

        public static void main(String args[]) {

                parameterized s1 = new parameterized(213, "Rohit");
                parameterized s2 = new parameterized(218, "Rafat");

                s1.display();
                s2.display();
        }
}
