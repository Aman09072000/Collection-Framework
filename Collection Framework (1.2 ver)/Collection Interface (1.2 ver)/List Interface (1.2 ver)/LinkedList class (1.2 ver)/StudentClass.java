import java.util.*;
public class StudentClass {
    public static void main(String[] args){
        LinkedList<Student> ll = new LinkedList<Student>();
        ll.add(new Student(1, "aman", 12.34));
        ll.add(new Student(2, "ram", 124.2));
        ll.add(new Student(3, "shyam", 24.42));

        for(Student s : ll)
            System.out.print(s.sid+" "+s.sname+" "+s.smarks+"\t");
        System.out.println();

        //Iterator cursor............................................................
        Iterator<Student> is = ll.iterator();
        while(is.hasNext()){
            Student sa = is.next();
            if(sa.sid==2) is.remove();
            else System.out.print(sa.sid+" "+sa.sname+" "+sa.smarks+"\t");
        }
        System.out.println();

        //ListIterator cursor..............................................................
        ListIterator<Student> lt = ll.listIterator();
        //forward dirrection
        while(lt.hasNext()){
            Student sd = lt.next();
            System.out.println(sd.sid+" "+sd.sname+" "+sd.smarks);
        }
        //backward dirrection
        while(lt.hasPrevious()){
            Student sf = lt.previous();
            System.out.println(sf.sid+" "+sf.sname+" "+sf.smarks);
        }

    }
}
