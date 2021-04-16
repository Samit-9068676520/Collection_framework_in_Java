import java.util.*;
class TestJavaCollection2{
    public static void main(String args[])
    {
        Stack<String> stack= new Stack<String>();
        stack.push("Ayush");
        stack.push("Samit");
        stack.push("Anurag");
        stack.push("Ashutosh");
        stack.push("Ankur");
        stack.push("Rishu");
        System.out.println(stack.pop());
        Iterator itr=stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}