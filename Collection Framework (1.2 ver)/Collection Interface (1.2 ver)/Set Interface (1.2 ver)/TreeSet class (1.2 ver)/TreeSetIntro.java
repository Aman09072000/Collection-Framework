import java.util.TreeSet;
import java.util.LinkedList;
import java.util.SortedSet;

public class TreeSetIntro {
    // TreeSet introduce in java 1.2 version
    // TreeSet underline datastructure is BalanceTree
    // it is all element are arranged in sorted order (ascending default)
    // In TreeSet null value are not allowed as in TreeSet all values are arranged in dorted order and for sorting order 
    // two condition must satisfy 1)- that the data must be homogeneous and 2)- data must implemnt Comparable interface.
    // so there is not any normal version of TreeSet Class it has only genric version as data must be Homogeneous for sorting purpose.
    // and as it also a implementation class Set Interface here duplication is not allowed.
    // it implements SortedSet Interface . due to this it has capability of sorting.

    public static void main(String[] args){
        //TreeSet has 4-Constructors
        //1)- default Constructor-->
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(2);
        t.add(4);
        t.add(1);
        System.out.println(t);  // [1, 2, 4, 5] -->as in it element s arranged in sortedorder

        // 2)-> Colection Constructor--> it is for adding one collection data int another.
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(3);
        ll.add(2);
        ll.add(67);
        TreeSet<Integer> tt = new TreeSet<Integer>(ll);
        tt.add(4);
        System.out.println(tt);  //[2, 3, 4, 67]

        //3)--> Comparator constructor--> in it we create a constructor and sorted elements according to our need.
        TreeSet<Integer> tt1 = new TreeSet<Integer>(new TreeSetComparator());
        tt1.addAll(tt);
        System.out.println(tt1);  // [67, 4, 3, 2]

        //4)--> SortedSet Constructor--> in it we create a new treeSset from the old one of the elements we want.
        TreeSet<Integer> to = new TreeSet<Integer>();
        for(int i=1; i<=10 ; i++)
            to.add(i);
        System.out.println(to);  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        SortedSet<Integer> s1 = to.subSet(2,8);
        System.out.println(s1);   // [2, 3, 4, 5, 6, 7]
        TreeSet<Integer> t3 = new TreeSet<Integer>(s1);
        System.out.println(t3);   // [2, 3, 4, 5, 6, 7]

    }
}
