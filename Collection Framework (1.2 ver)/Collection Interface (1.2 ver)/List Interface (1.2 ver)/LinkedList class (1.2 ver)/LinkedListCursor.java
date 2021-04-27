import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class LinkedListCursor {
    //Linked supports only 2- cursors-->1)-->Iterator cursor
                                //2)--> ListIterator cursor
    // LinkedList not Support enumeration cursor as enumeration curor only work for legacy classes and LinkedList is not a legacty class.
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=1 ; i<=5 ; i++)
            ll.add(i);
        System.out.println(ll);  //[1, 2, 3, 4, 5]

        //Iterator cursor.....................................................................................
        Iterator<Integer> i = ll.iterator();
        while(i.hasNext()){
            Integer a = i.next();
            if(a==3)i.remove();
            else System.out.print(a+" ");  //1 2 4 5
        }

        //ListIterator cursor...................................................................................
        ListIterator<Integer> lt = ll.listIterator();
        //forward dirrection
        while(lt.hasNext()){
            Integer z = lt.next();
            if(z==2) lt.set(6);
            if(z==4) lt.remove();
        }
        System.out.println(ll);  //[1, 6, 5]

        //Backward dirrection
        while(lt.hasPrevious()){
            Integer x = lt.previous();
            System.out.print(x+" ");  //5 6 1
        }
        System.out.println(ll);  //[1, 6, 5]

    }
}
