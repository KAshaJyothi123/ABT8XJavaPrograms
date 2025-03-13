package march.ex_05032025.ex_10032025;

import java.util.Stack;

public class Lab00119_Stack
{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("3");
        stack.add("ad123");

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());
    }
}
