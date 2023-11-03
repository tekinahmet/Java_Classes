package day15oop;
/*
1.To have specific implementations for the child classes we use "Method Overridind."
2.In "Method Overriding", we change the method body.
  In "Method Overriding", we do not touch method name, method parameters.
  method name, method parameters are called "Method Signature", so in method overriding do not touch them.
3.In method overriding, if the return type is void do not change it
  In method overriding, if the return type is primitive do not change it
4.In method overriding, if the return types have parent child relationship between them, you can change the return types
  In method overriding, if the return types are covariant data types you can change the return types


 */
public class C07Animal {
    public void eat(){
        System.out.println("Animals eat");
    }
    public int getWeight(){
        return 12;
    }
    public C07Animal create(){
        return new C07Animal();
    }
}
