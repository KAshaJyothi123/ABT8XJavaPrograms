package febuary.ex_marc032025;

public class Lab0052_QA1
{
    public static void main(String[] args) {
        int score=85;

        String grade=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":"F";
        System.out.println(grade);
    }
}
