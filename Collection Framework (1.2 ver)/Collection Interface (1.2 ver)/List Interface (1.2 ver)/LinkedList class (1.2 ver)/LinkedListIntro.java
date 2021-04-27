import java.util.LinkedList;
import java.util.ArrayList;
public class LinkedListIntro {
    // LinkedList introduce in java 1.2 . so it is not a legacy class and its all methods are non-synchronized .
    // LinkedList underline Datastructure is Doubly linkedlist while ArrayList & Vector underline data structure is resizable array.
    // LinkedList insertion order is preserved.
    // LinkedList allow null values, duplication.
    
    // it allows only 2-cursors --> Iterator and ListIterator cursor.
    // it has 2- Constructur--> 1)->Default constructor (java.util.LinkedList();)
                            //2)->collection constructor( java.util.LinkedList(collection);)
    // In which case we use what :-->
            // for Insertion-->LinkedList is best for Insertion operation.
            // for searching--> ArrayList is best for searching operation.
            //for data access--> ArrayList is best for Data access.
            //memory wise--> ArrayList is best for memorywise.
   public static void main(String[] args){
        // genral version
        LinkedList ll = new LinkedList();
        ll.add("aman");
        ll.add(3423);
        ll.add(123.5);
        ll.add("gupta");
        System.out.println(ll);  //[aman, 3423, 123.5, gupta]


        //genric version
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("amana");
        l1.add("gupta");
        l1.add("cse");
        l1.add("B.Tech");
        System.out.println(l1);  //[amana, gupta, cse, B.Tech]
        // if we try to add integer in it we get error
        //l1.add(1212);  // error

        //..................................................................................................
        //constrictor
        //1)- default constructor->
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        System.out.println(l2);  //[1, 2, 3, 4]

        //2)- Collection constructor--> it is basically for adding one collection data into another.
        LinkedList<Integer> l3 = new LinkedList<Integer>(l2);
        l3.add(5);
        l3.add(6);
        System.out.println(l3);  //[1, 2, 3, 4, 5, 6]

        ArrayList<Integer> aa = new ArrayList<Integer>(l3);
        System.out.println(aa);  // [1, 2, 3, 4, 5, 6]
   } 
}
