import java.util.*;
class JavaArrayList{
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("samit");
        list.add("verma");
        list.add("samit");
        list.add("Rahul");
        list.add("Jaiswal");
        Iterator itr=list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(list);
    }
}