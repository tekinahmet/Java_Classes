package day16oop;
//Abstraction

/*
1. If a method has method body, it's called "concrete method".
   If a method doesn't have a body, it's called "abstract method".
2. To make a method abstract:
    i. remove the method body.
    ii. use "abstract" keyword between access modifier and data type
    iii. make the class abstract as well
        because abstract methods can be put into an abstract class only.
        note: Abstract class can have concrete methods
3. When you create an abstract method,
all the "concrete child classes" "must override" the method from abstract parent class.
But if parent class has "concrete method", it's not mendatory to override
 */
public abstract class C07Animal {
    public abstract void eat();{
    }
}
