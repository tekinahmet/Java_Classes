package day15oop;
public class C03Dog extends C02Mammal{
    public double price;
    public int weight=8;

    public C03Dog(){
        System.out.println(this.weight);//8
        System.out.println(super.weight);//10
        System.out.println("No parameter");
    }
    public C03Dog(double price){
        super("Puppy", 2);
        System.out.println("Price parameter");
    }
    public void eat(){
        System.out.println("Dogs eat");
    }
}