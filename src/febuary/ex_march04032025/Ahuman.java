package febuary.ex_march04032025;

public class Ahuman
{

        String eye_colour;
        String names;
        long adhar_card_number;

        //Defailt parameter
        Ahuman()
        {
            System.out.println("Hi");
        }

        //parameterized paramter
        Ahuman(String name)
        {
            System.out.println("Hi,i am parameter");
        }
        void walk()
        {
            System.out.println("RNRN");
        }

        int talk()
        {
            System.out.println("RTNA");
            return 10;

        }

        String sleep(String name)
        {
            System.out.println("sleeping");
            System.out.println("RTWA");
            return "i am sleeping";
        }
    }

