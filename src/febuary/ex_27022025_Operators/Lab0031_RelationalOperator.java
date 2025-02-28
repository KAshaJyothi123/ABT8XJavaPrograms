package febuary.ex_27022025_Operators;

public class Lab0031_RelationalOperator {
    public static void main(String[] args) {
        //Relation operator
        //<,>,<=,>=,!=,!->true or false
        int a=10;
        int b= 30;
        boolean c= a>b;
        System.out.println(c);

        int age_asha=34;
        int age_jyothi=34;
        boolean result=age_asha > age_jyothi;
        boolean result1=age_asha >= age_jyothi;
        boolean result2=age_asha <= age_jyothi;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
