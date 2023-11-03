package day06string_manipulations_loops;
public class C06StringManipulations {
    public static void main(String[] args) {
        String s = "Java is Java";

        boolean r1 = s.contains("v");
        System.out.println(r1);//true

        boolean r2 = s.contains("x");
        System.out.println(r2);//false

        boolean r3 = s.startsWith("J");
        System.out.println(r3);//true

        boolean r4 = s.startsWith("j");
        System.out.println(r4);//false

        boolean r5 = s.endsWith("a");
        System.out.println(r5);//true

        char r6 = s.charAt(2);
        System.out.println(r6);//v

        String r7 = s.repeat(3);
        System.out.println(r7);//Java is JavaJava is JavaJava is Java
    }
}
