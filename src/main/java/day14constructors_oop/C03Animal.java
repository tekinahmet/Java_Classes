package day14constructors_oop;
/*
1. We create parent class and put common method into the parent class to
        i. prevent repetition
        ii.make maintenance easy
        iii.make update easily
        iv.save time in code typing
        v.make the classes ass possible as small to make them work faster
2.To make a class use methods from another class, we should create parent-child relationship between them
  To create "parent-child relationship", we use "extends" keyword from "child class" to "parent class"
3."public" and "protected" methods can be inherited by "child classes" without any restriction.
  "default" methods can be inherited if the object and the parent class are in the same package.
  "private" methods cannot be inherited by "child classes".
4.If a child class uses class members from parent class it is called "inheritance".
5.Object-Oriented Programming Concept has 4 principals
        i.inheritance
        ii.encapsulation
        iii.polymorphism
        iv.abstraction
6.There are different types of inheritance
        i.Multiple Inheritance: Java does not support it. Java supports "Single Inheritance".
        ii.MultiLevel Inheritance: Java supports this.
        iii.Hierarchical Inheritance: It is the combination of "MultiLevel Inheritance" and "Single Inheritance"
 */

public class C03Animal {

    public int age;
    public String name;
    public void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }

}
