package march.ex_05032025.ex_10032025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab00121
{
    public static void main(String[] args) {
        Set s1= new TreeSet();

        Set s2=new HashSet();
        Set s3=new LinkedHashSet();
        Set s4=new TreeSet();

        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("A"); //Duplicate its not allowed.
        s1.add("null");
        System.out.println(s1);
    }
}
