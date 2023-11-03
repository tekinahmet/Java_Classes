package day23iterators_lambda;

import java.time.LocalDate;

/*
1. "static block" is used to initialize "static variables"
    We sometimes need to type codes to initialize a static variable.
    If you need to type to initialize a static variable, use "static block".

2. "instance block" is used when you need to execute a code in all constructors.
    "instance block" prevents repetition.


 */
public class C03StaticAndInstanceBlock {
    public  static  int price;
    public int year;

    static{
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==2){
            price=1000;
        }else {
            price=2000;
        }
    }
    public C03StaticAndInstanceBlock(){

    }
    public C03StaticAndInstanceBlock(int year){
        this.year=year;
    }

    {
        System.out.println("Hi");//instance block
    }

}
