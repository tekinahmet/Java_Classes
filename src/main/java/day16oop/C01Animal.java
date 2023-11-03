package day16oop;
/*
 1.the method in child class is called overriding method.
---the method in parent class is called overridden method.
---overriding method (child classes) cannot use narrower access modifiers
than those of overridden method(parent class)
.
---overriden methods ==> default
---overriding method ==> public, default, protected

---overriden methods ==> protected
---overriding method ==> protected, public

---overriden methods ==> private
---overriding method ==> private cannot be overridden (none)
 2.polymorphism = method overloading + method overriding
    i) method overloading occurs in the same class
    while method overriding needs multiple classes
    ii)method overriding needs inheritance
    whereas method overloading does not need this.
    iii) private methods can be overloaded,
    but cannot be overridden.
    iv)in method overloading, we change the method signature,
    but we do not change method signatures in method overriding.
    v)in method overloading, access modifiers and return types have no role to play,
    but in method overriding there are some rules that shoul be followed regarding them.
    vi)in method overloading we change the parameters and make them work in different scenarios,
    but in method overriding, we make the methods more specific for the child class.
    vii)static methods can be overloaded, but cannot be overridden.
 */
public class C01Animal {
    public  void eat(){
        System.out.println("Animal eats...");
    }
}
