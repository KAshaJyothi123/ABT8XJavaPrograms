package march.ex_05032025.ex_07032025;

public class Lab00100_StringBuffer_StringBuilder
{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("Hello");
        sb1.append(" Java");
        System.out.println(sb1);


        //StrinBuilder
        StringBuilder sb2=new StringBuilder("Hello");

        //append
        sb2.append(" Java");

        System.out.println(sb2);

        //insert
        sb2.insert(5," World");
    }
}
