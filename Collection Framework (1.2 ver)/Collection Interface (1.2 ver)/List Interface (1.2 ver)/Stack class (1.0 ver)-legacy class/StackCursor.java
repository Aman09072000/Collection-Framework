import java.util.Stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
public class StackCursor {
    public static void main(String[] args){
        Stack<String> s = new Stack<String>();
        s.push("aman");
        s.push("gupta");
        s.push("B.tech");
        s.push("cse");
        s.push("SAGE");
        System.out.println(s);  // [aman, gupta, B.tech, cse, SAGE]

        //As Stack is introduce in java 1.0 . so it will work with all Cursors - Enumeration , Iterator, ListIterator.
        
        // Enumeration cursor..................................................................................
        Enumeration<String> e = s.elements();
        while(e.hasMoreElements()){
            String ss = e.nextElement();
            System.out.print(ss + " ");   //aman gupta B.tech cse SAGE
        }
        System.out.println();

        // Iterator cursor.....................................................................................
        Iterator<String> i = s.iterator();
        while(i.hasNext()){
            String sa = i.next();
            if(sa.equals("B.tech")) i.remove();
            else System.out.print(sa + " ");   // aman gupta cse SAGE
        }
        System.out.println();

        // ListIterator cursor..................................................................................
        ListIterator<String> sw = s.listIterator();
        //forward dirrection
        while(sw.hasNext()){
            String sd = sw.next();
            if(sd.equals("cse")) sw.set("CSE");
            if(sd.equals("gupta")) sw.remove();
            System.out.print(sd +" ");   // aman gupta cse SAGE
        }
        System.out.println(s);  //[aman, CSE, SAGE]

        //backward dirrection
        while(sw.hasPrevious()){
            String se = sw.previous();
            if(se.equals("aman")) sw.set("Naman");
            System.out.print(se+" ");    // SAGE CSE aman
        }
        System.out.println(s);   // [Naman, CSE, SAGE]
    }
}
