import java.util.LinkedList;
public class LinkedListOperations {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("aman");
        ll.add("gupta");
        ll.add("CSE");
        ll.add(null);       
        ll.add("B.tech");
        ll.add("sage");
        System.out.println(ll);  // [aman, gupta, CSE, null, B.tech, sage]

        //LinkedList has various methods-->
        //size()-> to find the size of LinkedList.
        System.out.println(ll.size());  //6

        //addFirst()--> it is for adding value in first pogition in LinkedList
        ll.addFirst("mr.");
        //addLast()--> adding a element in the last pogition of LinkedList
        ll.addLast("university");
        System.out.println(ll +"\t" + ll.size());  //[mr., aman, gupta, CSE, null, B.tech, sage, university] 8
        //add(1,"aam")--> it is for adding value in specified pogition of the LinkedList
        ll.add(0,"hyy"); // it add the value hyy in 0 index of the linkedlist.
        System.out.println(ll);  //  [hyy, mr., aman, gupta, CSE, null, B.tech, sage, university]
        //set(0,"hii")--> it changes the value 
        ll.set(0,"hii");
        System.out.println(ll);  //  [hii, mr., aman, gupta, CSE, null, B.tech, sage, university]

        //isEmpty() method--> it check if the LinkedList is empty or not. (return type :- Boolean)
        System.out.println(ll.isEmpty());  //false
        // remove() method--> for removing element in the linkedlist
        ll.remove(null);  //remove by direct value name
        ll.remove(0);       // remove by index valur also.
        System.out.println(ll);  // [mr., aman, gupta, CSE, B.tech, sage, university]

        //removeFirst() and removeLast() method --> it remove first and last element from the linkedlist.
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);  // [aman, gupta, CSE, B.tech, sage]

        
        //clear()--> it clear complete linkedlist.
        ll.clear();
        System.out.println(ll);  // []



    }
}
