package day17oop;

/*
1. Interfaces have "abstract methods", "abstract methods" are incomplete,
    that is why Java doesn't let us create object from interface just like abstract classes.
2. "abstract class" is a class that is why it has a constructor but
    this constructor cannot be used to create object.
    Interface on the other hand is NOT a class, so it doesn't have constructor at all.
3. All methods in an interface MUST be overridden by a concrete child class.
    That's why interfaces are called as "to-do list".
 */
public interface Engine {
    public abstract void start();//all methods in interfaces are "public" and "abstract" so we don't have to declare them
    void stop();
//    concrete methods with static
//    "static" can not be accessed.
    static void accelarate() {
        System.out.println("Increase the speed...");
    }
//    default concrete methods
    default void price() {
        System.out.println("Every engine should have a price...");
    }
//    variables in interfaces
//         1. Interfaces have "final" variables AND "final" variables must be initialised
//              "final" variables cannot be updated
//              "final" variables should be written in bold
//          2. all variables in an interface are "public", "final" and "static"
public final static String ENGINE_NAME = "Electrical engine";
//     "final", "static" and "public" are optional (by default)

}
