package day14constructors_oop;
/*
        1. Constructors are for object creation.
            If you don't have a constructor in a class,
            it is impossible to create an object.
        2. When you create a class, Java gives you a constructor automatically,
           this constructor is invisible because it comes from Parent Object Class.
           This "invisible constructor" is called "Default COnstructor".
        3. If you need, you can create multiple constructors in a class.
           But when you create a constructor in a class, java deletes the "Default Constructors"
        4. You can create constructors manually or by the help of the Intellij (recommenden)
        5. We create multiple constructors by changing the parameters
        6. Having different constructors makes the class.

        Question : What is the difference between "COnstructors" and "Methods"?
           1. "Constructors" are used to create Objects, "Methods" are used to do some actions.
           2. "Constructors" do not have return types but "Methods" have.
           3. "Constructor Names" must be  the same with the class name, but "Method Names" can be any name

 */
public class C01Students {
        public String stdName = "Tom Hanks";
        int stdAge = 13;
        private String stdId = "TH2010001";

    public void study(){
        System.out.println("Study well...");
        }
    public void doSport() {
        System.out.println("Sport is good for health...");
    }

//    create a constructor manually
    public C01Students(){

    }
    public C01Students(String stdName, int stdAge, String stdId){
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdId = stdId;
    }

//    create a constructor by the help of the Intellij

    public C01Students(String stdName, int stdAge) {
        this.stdName = stdName;
        this.stdAge = stdAge;
    }
}
