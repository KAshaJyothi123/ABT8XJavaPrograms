package febuary.ex_march03032025;

public class Lab0078
{
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            System.out.println(i);
            if(i==5)
            {
                continue;
            }
            System.out.println("After");
        }
    }
}
