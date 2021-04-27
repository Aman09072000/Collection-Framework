import java.util.*;
import java.util.Collections;
public class Comparable {
    //To perform a sorting Our data must satisfy the two condition-->
    // 1)--> data must be homogeneous (same type of data)
    // 2)--> the data must implement Comparable Interface.

    //(In complete java Only String class and All wrapper class like-> Integer,Float etc are implement Comparable Interface)
    // to perform a sorting operation Collections Interface will provide us sort() method.   Collections.sort(a);

    public static void main(String[] args){
        ArrayList<Student> ll = new ArrayList<Student>();
        ll.add(new Student(8,"c",33.54));
        ll.add(new Student(1,"a",100.3));
        ll.add(new Student(3,"b",873.43));
        Collections.sort(ll);
        for(Student aa : ll)
            System.out.print(aa.sid+" "+aa.sname+" "+aa.smarks+"\t");  //1 Ram 100.3     3 shyam 873.43  8 aman 33.54

    // there are two problem we face in Comparable 
     //1)-->  mixing of sorting and normal logic in same class.
     //2)--> and only one property of Sorting is allowed here. 
     
     // So to resolve all these problem we use the Comparator Object.

    }
}
