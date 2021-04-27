import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetCursor {
    public static void main(String[] args){
        LinkedHashSet<Student> ll = new LinkedHashSet<Student>();
        ll.add(new Student(4,"dg",24.3));
        ll.add(new Student(8, "z",2.3));
        ll.add(new Student(7, "a", 76.5));
        for(Student ss : ll)
            System.out.print(ss.sid+" "+ss.sname+" "+ss.smarks+"\t");  // 4 dg 24.3       1 a 2.3    7 fsv 76.5
        System.out.println();

        Iterator<Student> it = ll.iterator();
        while(it.hasNext()){
            Student sd = it.next();
            if(sd.sid==4) it.remove();
            else System.out.print(sd.sid+" "+sd.sname+" "+sd.smarks+"\t"); //1 a 2.3    7 fsv 76.5
        }
        System.out.println();

      
    }
}
