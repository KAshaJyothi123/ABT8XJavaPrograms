package march.ex_05032025.ex_08052025;

public class Lab00109
{
    public static void main(String[] args) {
        int c=10;
        try
        {
           c=c/10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end");
    }
}
