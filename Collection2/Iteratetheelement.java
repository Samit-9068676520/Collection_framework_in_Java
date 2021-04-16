import java.util.ArrayList;
import java.util.ListIterator;
// class Student{
//     int rollno;
//     String name;
//     int age;
//     Student(int rollno,String name,int age)
//     {
//         this.rollno=rollno;
//         this.name=name;
//         this.age=age;
//     }
// }

public class Iteratetheelement {
    public static void main(String args[])
    {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("Ravi");
        list1.add("Vijay");
        list1.add("Ravi");
        list1.add("Ajay");
        System.out.println("Traversing list through List Iterator");
        ListIterator<String> itr1=list1.listIterator(list1.size());
        while (itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }
        System.out.println("Traversing Through Loop:");
        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }
    }    
}
