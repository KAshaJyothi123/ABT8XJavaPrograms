package febuary.ex_28022025_TypeCasting;

public class Lab0038 {
    public static void main(String[] args) {
        long phone_no=9663694884l;
        //short s=phone_no; //narrowing -->explicit->jvm //invalid
        short s1=(short)phone_no; //narrowing -->explicit --loss//invalid
    }
}
