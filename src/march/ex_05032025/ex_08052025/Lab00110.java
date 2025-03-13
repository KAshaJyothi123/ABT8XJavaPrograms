package march.ex_05032025.ex_08052025;

public class Lab00110
{
    public static void main(String[] args) {
        int c=0;
        try
        {
            c=10/c;
            String s1=null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
