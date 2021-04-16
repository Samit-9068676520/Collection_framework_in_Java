import java.util.*;
public class TestJavaCollection5{
    public static void main(String args[])
    {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Samit Verma");
        queue.add("Vijay raj");
        queue.add("Rahul jaiswal");
        queue.add("Raj");
        System.out.println("head: "+queue.element());
        System.out.println("head: "+queue.peek());
        System.out.println("Iterating the queue elements");
        Iterator itr=queue.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements");
        Iterator itr2=queue.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
    }
}