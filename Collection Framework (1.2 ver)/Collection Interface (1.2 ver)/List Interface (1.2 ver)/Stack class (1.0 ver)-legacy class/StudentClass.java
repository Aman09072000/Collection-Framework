import java.util.*;
public class StudentClass {
    public static void main(String[] args){
        Stack<Student> s = new Stack<Student>();
        s.push(new Student(1, "aman", 12.34));
        s.push(new Student(2, "ram", 123.53));
        s.push(new Student(3, "shyam", 54.34));
        s.push(new Student(4, "rohan", 76.56));

        for(Student ss : s)
            System.out.print(ss.sid+" "+ss.sname+" "+ss.smarks+"\t");  //1 aman 12.34    2 ram 123.53    3 shyam 54.34   4 rohan 76.56
        System.out.println();

        //Enumeration cursor.......................................................................................
        Enumeration<Student> e = s.elements();
        while(e.hasMoreElements()){
            Student sq =e.nextElement();
            System.out.print(sq.sid+" "+sq.sname+" "+sq.smarks+"\t"); //1 aman 12.34    2 ram 123.53    3 shyam 54.34   4 rohan 76.56
        }
        System.out.println();

        //Iterator cursor............................................................................................
        Iterator<Student> i =s.iterator();
        while(i.hasNext()){
            Student sd = i.next();
            if(sd.sid==4) i.remove();
            else System.out.print(sd.sid+" "+sd.sname+" "+sd.smarks+"\t"); //1 aman 12.34    2 ram 123.53    3 shyam 54.34
        }
        System.out.println();

        //ListIterator cursor........................................................................................
        ListIterator<Student> lt = s.listIterator();
        //forward dirrection
        while(lt.hasNext()){
            Student sd =lt.next();
            System.out.print(sd.sid+" "+sd.sname+" "+sd.smarks+"\t"); //1 aman 12.34    2 ram 123.53    3 shyam 54.34
        }
        System.out.println();
        //Backward dirrection
        while(lt.hasPrevious()){
            Student sh = lt.previous();
            System.out.print(sh.sid+" "+sh.sname+" "+sh.smarks+"\t"); //3 shyam 54.34   2 ram 123.53    1 aman 12.34
        }
    }
}
