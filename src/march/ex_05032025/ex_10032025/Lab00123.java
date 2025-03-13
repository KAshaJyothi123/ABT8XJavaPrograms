package march.ex_05032025.ex_10032025;

import java.util.PriorityQueue;

public class Lab00123
{
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.offer("1");
        p.offer("2");
        p.offer("3");
        p.offer("4");
        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p);
        System.out.println(p.poll());
    }
}
