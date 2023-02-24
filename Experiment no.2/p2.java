public class p2 {
    public static void main(String[] args) {
        String s1 = "Rohit";
        String s2 = "Waghmare";
        System.out.println("s1 =" + s1);
        System.out.println("s2=" + s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s1.charAt(2));
        System.out.println(s2.charAt(2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s2.concat(s1));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1, 3));
        System.out.println(s1.indexOf('h'));
    }
}
