package march.ex_05032025.ex_07032025;

public class Lab0098_String_Function2
{
    public static void main(String[] args) {
        String s1=" Hello ";

        //Length
        System.out.println("length:"+ s1.length());

        //substring
        System.out.println("substring:" +s1.substring(0,3));

        //trim
        System.out.println("trim:" +s1.trim());

        //convert upper case and lowercase
        System.out.println("upper case:" +s1.toUpperCase());
        System.out.println("lower case:" +s1.toLowerCase());

        //chartAt
        System.out.println("charAt:" +s1.charAt(2));

        //index of
        System.out.println("index of:" +s1.indexOf("l"));

        //contains
        System.out.println("contains:" +s1.contains("l"));

        //empty
        System.out.println("empty:" +s1.isEmpty());

        //spilt
        System.out.println("spilt:" +s1.split(" "));


        String name=" A  s  h  a";
        String name2="Asha";
        //compareTo
        System.out.println("compare to:" +name.compareTo(name2));
        System.out.println();









    }
}
