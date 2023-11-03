package day06string_manipulations_loops;
public class C03StringManipulations {
    public static void main(String[] args) {
     /*
    Example 4:Check if a password has the following conditions
    i)It should not be empty
    ii)It should not be just a single space
    iii)It should not have spaces at the beginning and at the end
    iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
    v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
     */


        String pwd = "A12?iKm";
        boolean firstRule =  pwd.isEmpty();
        System.out.println(firstRule);//false

        boolean secondRule = pwd.isBlank();
        System.out.println(secondRule);//false

        boolean thirdRule = pwd.trim().equals(pwd);
        System.out.println(thirdRule);//true

        boolean fourth =  pwd.indexOf('i')==4;
        System.out.println(fourth);//true

        boolean fifth = pwd.lastIndexOf("K")==5;
        System.out.println(fifth);//true

        if (!firstRule && !secondRule && thirdRule && fourth && fifth) {
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

        if (firstRule) {
            System.out.println("Empty password is not accepted");
        }if(secondRule){
            System.out.println("Password needs visible characters");
        }if(!thirdRule){
            System.out.println("Do not use space at the beginning and at the end");
        }if(!fourth){
            System.out.println("Fifth character should be i");
        }if(!fifth){
            System.out.println("Sixth character should be K");
        }//Valid
    }
}
