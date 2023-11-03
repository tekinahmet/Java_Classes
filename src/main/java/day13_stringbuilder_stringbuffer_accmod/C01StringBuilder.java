package day13_stringbuilder_stringbuffer_accmod;

public class C01StringBuilder {
    public static void main(String[] args) {
        String s = "Java";
        String t = "Java";
        String u = "Apex";
        System.out.println("s = " + s);//Java
        
        s = s.concat("!");
        System.out.println("s.concat() = " + s);//Java!
        System.out.println("t = " + t);//Java

        String y = new String("Apex");

//        String x = new String("Tom");

        StringBuilder v = new StringBuilder("Python");
        System.out.println("v = " + v);//Python
        v.append("!");
        System.out.println("v.append() = " + v);//Python!

        StringBuilder x = new StringBuilder("Ruby");
        System.out.println(x);//Ruby

        StringBuilder sbr = new StringBuilder();
        sbr.append("Hi! ").append("Java!...");
        System.out.println("sbr = " + sbr);// Hi! Java!...
        System.out.println(sbr.capacity());//16
        System.out.println(sbr.length());//12
        
        StringBuilder stateAbbr = new StringBuilder(2);
        stateAbbr.append("FL ").append("How ").append("Jack ").append("Ahmet Tekin");
        System.out.println("stateAbbr = " + stateAbbr);//FL
        System.out.println("stateAbbr.capacity() = " + stateAbbr.capacity());//30
        System.out.println("stateAbbr.length() = " + stateAbbr.length());//23

        sbr.reverse();
        System.out.println(sbr);//...!avaJ !iH

        sbr.replace(0,4,"*");
        System.out.println("sbr.replace() = " + sbr);//*avaJ !iH
        
        sbr.insert(5,"123");
        System.out.println("sbr = " + sbr);//*avaJ123 !iH

        sbr.delete(5,8);
        System.out.println("sbr = " + sbr);//*avaJ !iH

        sbr.deleteCharAt(6);//!
        System.out.println("sbr.deleteCharAt = " + sbr);//*avaJ iH

        StringBuilder a = new StringBuilder("Nava");
        StringBuilder b = new StringBuilder("Lava");

        int r = a.compareTo(b);
        System.out.println(r);//-3

        a.setCharAt(2,'n');
        System.out.println(a);//Nana

        StringBuffer sbf = new StringBuffer("Python");
        System.out.println(sbf.subSequence(2, 4));//th
        System.out.println(sbf);//Python
    }
}
