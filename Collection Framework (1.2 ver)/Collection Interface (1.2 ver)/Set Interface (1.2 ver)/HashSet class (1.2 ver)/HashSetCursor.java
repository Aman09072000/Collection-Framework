import java.util.HashSet;
import java.util.Iterator;

public class HashSetCursor {
    //Only 1 type of cursor ae allowed her ---> Iterato cursor.
    public static void main(String[] args){
        HashSet<Student> h = new HashSet<Student>();
        h.add(new Student(1, "rm", 24.4));
        h.add(new Student(4, "vv", 42.4));
        h.add(new Student(2, "gd", 65.5));
        for(Student p : h)
            System.out.print(p.sid+" "+p.sname+" "+p.smarks+"\t");  //2 gd 65.5       1 rm 24.4       4 vv 42.4
        System.out.println();

        Iterator<Student> it = h.iterator();
        while(it.hasNext()){
            Student sa = it.next();
            if(sa.sid==4) it.remove();
            else System.out.print(sa.sid+" "+sa.sname+" "+sa.smarks+"\t");  // 2 gd 65.5       1 rm 24.4
        }

        
    }
}
