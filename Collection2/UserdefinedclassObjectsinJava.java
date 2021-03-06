import java.util.*;
class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class UserdefinedclassObjectsinJava {
    public static void main(String args[]) {
        // Creating user-defined class objects
        Student s1 = new Student(74, "Samit", 23);
        Student s2 = new Student(75, "Rahul", 21);
        Student s3 = new Student(76, "maneesh", 25);
        // creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);// adding Student class object
        al.add(s2);
        al.add(s3);
        // Getting Iterator
        ListIterator<Student> itr=al.listIterator();
        // traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}