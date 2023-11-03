package day18oop_static_keyword;
public class C05CatRunner {
    public static void main(String[] args) {
        C04Cat myCat = new C04Cat();

        System.out.println(myCat.eat());//1
        System.out.println(myCat.eat("Cheese"));//0

        System.out.println(C01Animal.NAME);//A
        System.out.println(C02Mammal.NAME);//Mammal
        System.out.println(C03Carnivorous.NAME);//Carnivorous

    }
}
