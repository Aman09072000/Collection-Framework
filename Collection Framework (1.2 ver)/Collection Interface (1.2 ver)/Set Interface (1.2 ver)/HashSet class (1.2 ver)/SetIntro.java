import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;
public class SetIntro{
    // Set is a Interface
    // it is introduce in java 1.2 version
    // and as it is implement in java 1.2 version its all methods are non-Synchronized and it is not thread safe.
    // the set interface is child interface of collection interface
    // it also store hetrogeneous data and null inertion is allowed here. 
    // it allow only one cursors only--> 1)--> Iterator cursor. beacause Enumeration cursor only allowed for legacy classes and ListIterator curor is only for List classes.
    // it has 3- inplementation classes-->1)--> HashSet class    2)--> LinkedhashSet class   3)--> TreeSet class.
    
    //The main difference between List Interface and Set Interface is that the Duplication is allowed in List Interface while duplication is not allowed in the Set Interface.
    
    // HashSet Class ---------..........................................................................>>>>

    // HashSet is introduce in java 1.2 version. 
    // hashSet has 1 child class name LinkedhashSet it is introduce in java 1.4 version.    
    // the main Difference between HashSet and LinkedhashSet class is that HashSet insertion order is not Preserved while in LinkedHashSet insertion order is Preserved/
    //in it hetrogeneous data is allowed .
    // as it is a implementation class of Set so there is also Duplication is not allowed.
    //insertion order not preserved.
    // The underline datastructure of hashset is HashTable.

    public static void main(String[] args){
    // HashSet has 4-Condtructor-->
    //1)--->Default Constructor
        //normal version.
    HashSet h = new HashSet();
    h.add("Aman");
    h.add(2442);
    h.add(23.544);
    System.out.println(h);  // [23.544, Aman, 2442]  as init insertion order is not-preserved.
        //genric version
    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(32);
    hs.add(45454);
    hs.add(2442);
    System.out.println(hs);  // [32, 2442, 45454]

    //2)--> Constructor with our own initial capacity.
    HashSet<String> hh = new HashSet<String>(3);
    hh.add("a");
    hh.add("bb");
    hh.add("cc");
    System.out.println(hh); //[bb, cc, a]
    
    //3)--> Constructor with our own initial capacity and Load factor.
    HashSet<String> hj = new HashSet<String>(3);
    hj.add("ffs");
    hj.add("wf");
    System.out.println(hj);  // [ffs, wf]

    //4)--> Collection Constructor--> it is for adding one collection data into another Collection.
    // byit we can add any collection data into another.
    LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.add(23);
    ll.add(11);
    ll.add(20);
    System.out.println(ll);  // [23, 11, 20]

    HashSet<Integer> hl = new HashSet<Integer>(ll);
    hl.add(34);
    System.out.println(hl);  // [34, 20, 23, 11]
    System.out.println(hl.isEmpty());  //false
    hl.remove(11);
    System.out.println(hl);  // [34, 20, 23]
    System.out.println(hl.contains(20));  //true


    
    }
   
    
}