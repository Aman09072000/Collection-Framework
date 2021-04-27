import java.util.*;
public class CursorStudentClass {
    public static void main(String[] args){
        Vector<Student> v = new Vector<Student>();
        v.add(new Student(1, "aman", 12.3));
        v.add(new Student(2, "ram", 15.3));
        v.add(new Student(3,"shyam", 3535.3));
        v.add(new Student(4, "rohan", 143.44));

       for(Student d : v)
            System.out.println(d.sid +" " + d.sname +" " + d.smarks);
        System.out.println();

            // 1 aman 12.3
            // 2 ram 15.3
            // 3 shyam 3535.3
            // 4 rohan 143.44

        // Enumeration Cursor......................................................................................
        Enumeration<Student> e = v.elements();
        while(e.hasMoreElements()){
            Student o = e.nextElement();
            System.out.println(o.sid+" "+ o.sname +" "+ o.smarks);
        }
            // 1 aman 12.3
            // 2 ram 15.3
            // 3 shyam 3535.3
            // 4 rohan 143.44


        //Iterator Cursor...........................................................................................
        Iterator<Student> t = v.iterator();
        while(t.hasNext()){
            Student ss = t.next();
            if(ss.sid==4) t.remove();
            else System.out.println(ss.sid + " " + ss.sname + " " + ss.smarks);
        }

            // 1 aman 12.3
            // 2 ram 15.3
            // 3 shyam 3535.3
        System.out.println();

        //ListIterator Cursor.......................................................................................
        
        ListIterator<Student> lt = v.listIterator();

        // forward dirrection        
        while(lt.hasNext()){
            Student sa = lt.next();
            if(sa.sname.equals("aman")) lt.remove();
            System.out.println(sa.sid+" "+ sa.sname+" " + sa.smarks);
        }  
            // 1 aman 12.3
            // 2 ram 15.3
            // 3 shyam 3535.3
        System.out.println();  
        for(Student sp : v)
            System.out.println(sp.sid+" "+ sp.sname+" " + sp.smarks);
        System.out.println();
            // 2 ram 15.3
            // 3 shyam 3535.3

        //........................................................................

        //backward dirrection
        while(lt.hasPrevious()){
            Student sd = lt.previous();
            System.out.println(sd.sid+" "+ sd.sname+" " + sd.smarks);
        }
            // 3 shyam 3535.3
            // 2 ram 15.3

    }
}
