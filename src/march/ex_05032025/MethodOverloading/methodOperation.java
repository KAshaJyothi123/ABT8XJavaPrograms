package march.ex_05032025.MethodOverloading;

public class methodOperation
{

        int add(int a,int b)
        {
            return a+b;
        }

        String add(String a, String b)
        {
                return a+b;
        }

        void add(int a, int b, int c)
        {
            System.out.println("Hello");
        }

        double add(double a, double b)
        {
            return a+b;
        }

        double add(double a, double b,float c)
        {
            return a+b+c;
        }

}
