package febuary.ex_28022025_TypeCasting;

public class Lab0037 {

    public static void main(String[] args) {
        //type casting :- source and destination
        //widening :-implicit,explicit->lossless
        //narrowing:- implicit,explicit(with data type),loss

        //widening
        byte b=10;
        int  a= b;// valid implicit casting ->jvm
        int a1=(int)b; //valid Explicit casting ->jvm

        //narrowing
        int val=300;
        // byte b1=val; //invalid implicit casting -jvm
        byte b2=(byte)val; //invalid explicit casting -loss of data
    }
}
