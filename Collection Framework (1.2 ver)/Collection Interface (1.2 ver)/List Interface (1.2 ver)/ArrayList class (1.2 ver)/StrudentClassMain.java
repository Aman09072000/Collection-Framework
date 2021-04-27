import java.util.ArrayList;
public class StrudentClassMain {
    
    public static void main(String[] args){
        ArrayList aa = new ArrayList();
        aa.add(new Student(1,"aman"));
        aa.add(new Student(2,"ram"));
        aa.add(new Student(3,"shyam"));
        aa.add(120);
        aa.add("rohan");
        System.out.println(aa.toString()); //[Student@299a06ac, Student@383534aa, Student@6bc168e5, 120, rohan]
            // as Student class dont have toString() method so it print like that.
        //to println the elemnt all correctly here we use for-each loop.

        for(Object o : aa){
            if(o instanceof Student)
                System.out.println("True");
            else System.out.println("False");    
        }

        //create a genric Arraylist and print all Student class data.
        ArrayList<Student> ss = new ArrayList<Student>();
        ss.add(new Student(1,"a"));
        ss.add(new Student(2,"b"));
        ss.add(new Student(3,"c"));

        for(Student s : ss){
            System.out.println(s.sid + " " + s.sname +"\t"); //1 a     2 b     3 c
        }

        // getting the student class data .
        Student st = ss.get(1);
        System.out.println(st.sid+" "+st.sname);  // 2 b

    }
}
