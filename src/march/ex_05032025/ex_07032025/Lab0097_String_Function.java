package march.ex_05032025.ex_07032025;

public class Lab0097_String_Function
{
    public static void main(String[] args) {
        String s1="Hello";
        String s2= new String("Hello");
        String s3=new String("Hello");
        String s4="Hello";
        String s5="hello";

        // == methods
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5); //because its case sensitive

        //equals method
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5)); //because its case sensitive

    }
}
