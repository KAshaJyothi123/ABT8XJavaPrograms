package febuary.ex_march04032025;

public class Lab0086
{
    public static void main(String[] args) {
        //without parameter and no return type
        function_Type1();

        //without parameter and with return type
        int age=function_Type2();
        System.out.println(age);

        //with parameter and no return type
        function_Type3( 89, "Asha");

        //with parameter and with return type
        int age3=function_Type4(10, 20);


    }
    public static void function_Type1()
    {
        System.out.println("without parameter and no return type");
    }

    public static int function_Type2()
    {
        System.out.println("without parameter and with return type\n");
        return 100;
    }

    public static void function_Type3(int age2,String name)
    {
        System.out.println("with parameter and no return type");
        System.out.println("you have shared:" +name);
    }

    public static int function_Type4(int a,int b)
    {
        System.out.println("with parameter and with return type");
        return a+b;
    }
}
