package day14constructors_oop;

public class C02StudentRunner {
    public static void main(String[] args) {
        C01Students std1 = new C01Students();
        System.out.println("std1.stdAge = " + std1.stdAge);

        C01Students std2 = new C01Students("Brad Pitt", (byte) 57, "BD1967002");
        System.out.println("std2.stdName = " + std2.stdName);
        System.out.println("std2.stdAge = " + std2.stdAge);
        std2.study();
        std2.doSport();

    }
}
