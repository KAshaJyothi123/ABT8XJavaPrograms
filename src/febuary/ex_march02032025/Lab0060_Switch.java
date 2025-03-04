package febuary.ex_march02032025;

public class Lab0060_Switch
{
    public static void main(String[] args) {
        //Switch statement is multi way branch statement
        //switch statement executes one statement from multiple statement
        //in java switch statement expression are byte,short,int,long(with its wrapper type)enums and string
        //Advantage of Switch :- we can use break statement

        /*syntax of switch
        switch(condition)
        {
        case i:statement1;
        break;
        case 2:statement2;
        break;
        case 3:statement3;
        break;
        case n:statement n;
        break;
        ......
        ......
        default:statemnet;
         */

        //Week days 1 to 7 mon-1,tue-2..........sun-7
        int day =8;
        switch(day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no idea,what day its is");

        }
        System.out.println("End of the loop");
    }
}
