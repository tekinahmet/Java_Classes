package day17oop;

public abstract class C07Object extends C01Animal{
    @Override
    public void eat() {
        System.out.println("Every object needs something");
    }
    public void drink(){
        System.out.println("Every living object needs to drink...");
    }
    public final void makeNoise(){
        System.out.println("Animals make noise");
    }
}
