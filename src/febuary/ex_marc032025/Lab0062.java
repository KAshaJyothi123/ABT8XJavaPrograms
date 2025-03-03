package febuary.ex_marc032025;

public class Lab0062
{
    public static void main(String[] args) {
        int itemcode=006;
        switch(itemcode)
        {
            case 001,002,005:
                System.out.println("All of them are electronics gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;


        }
    }
}
