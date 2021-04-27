// comaparator is belong to java.util package while comparable belong to java.lang package.
import java.util.Comparator;
import java.util.*;
import java.util.LinkedList; 
public class Comparator {
    // here we can write the bussiness/normal logic and sorting logic in different classes.
    // and here multiple property of sorting is allowed.

    // in comparable we use Collections.sort(ar) while in Comparator we use Collections.sort(ar, new comparator())
    // the comparable is implemented by predefined classes.(String and Wrapper classes) while Comparator is used for customization purpose.

    public static void main(String[] args){
        ArrayList<Emp> e = new ArrayList<Emp>();
        e.add(new Emp(4, "b", 12.3));
        e.add(new Emp(1,"z",42.3));
        e.add(new Emp(3,"a",43.4));

        for(Emp ee:e)
            System.out.print(ee.eid+" "+ee.ename+" "+ee.emarks+"\t");  //4 b 12.3        1 z 42.3        3 a 43.4
        System.out.println();

        Collections.sort(e, new EmpComparator());
        for(Emp ee:e)
            System.out.print(ee.eid+" "+ee.ename+" "+ee.emarks+"\t");
            // when sort data according to ename-->    3 a 43.4        4 b 12.3        1 z 42.3
            // when sort data according ti eid -->    1 z 42.3        3 a 43.4        4 b 12.3




    }
}
