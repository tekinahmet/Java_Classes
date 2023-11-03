package day17oop;
public class CarRunner {
    public static void main(String[] args) {
        Honda myHonda = new Honda();
        myHonda.brake();
        myHonda.price();//price() method can be accessed through object(myHonda) because of the keyword "default"

        Engine.accelarate();// accelarate() method can be accessed directly throuh the interface because of the keyword "stati"
                            //"static" means it's like moon to earth, so we don't need to any object to reach out to moon
                            //in this case, accelarate() method.
        System.out.println(Engine.ENGINE_NAME);


    }
}