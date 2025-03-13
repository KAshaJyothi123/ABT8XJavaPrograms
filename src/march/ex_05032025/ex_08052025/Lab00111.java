package march.ex_05032025.ex_08052025;

public class Lab00111
{
    public static void main(String[] args) {
        int c=10;
        try
        {
            c=10/c;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("it will be execute");
        }

    }
}
