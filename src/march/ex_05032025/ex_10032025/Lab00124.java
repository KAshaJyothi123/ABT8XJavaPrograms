package march.ex_05032025.ex_10032025;

import java.util.HashMap;
import java.util.Map;

public class Lab00124
{
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put("sid","001");
        m.put("name", "sri");
        m.put("email", "XXXXXXXXXXX");
        System.out.println(m);
        System.out.println(m.size());

        m.put("sid", "002");
        m.put("name", "sri");
        m.put("email", "XXXXXXXXXXX");
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get("sid"));
        System.out.println(m.get("name"));
        System.out.println(m.get("email"));
        System.out.println(m.get("phone"));
        System.out.println(m.get("phone")==null);
        System.out.println(m.get("phone")=="null");
        System.out.println(m.get("phone")=="");
        System.out.println(m.get("phone")==" ");


    }
}
