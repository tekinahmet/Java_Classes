package day18oop_static_keyword;
public class C04Cat implements C01Animal, C02Mammal, C03Carnivorous{
    @Override
    public int eat() {
        return 1;
    }
    @Override
    public int eat(String foodName) {
        return 0;
    }
}
