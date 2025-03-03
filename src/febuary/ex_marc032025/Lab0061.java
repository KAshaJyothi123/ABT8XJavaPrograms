package febuary.ex_marc032025;

public class Lab0061 {
    //Web Automation
    //i will ask user which browser you want me to run the code
    //chrome-execute chrome
    //firefox-execute firefox
    //edge -execute edge
    public static void main(String[] args) {


        String str = "chrome";
        switch (str) {

            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "Firefox":
                System.out.println("starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("i have not idea which browser this");
                break;


        }

    }
}