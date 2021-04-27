import java.util.*;
public class SortingIntro{
    //To perform a sorting Our data must satisfy the two condition-->
    // 1)--> data must be homogeneous (same type of data)
    // 2)--> the data must implements Comparable Interface.

    //(In complete java Only String class and All wrapper class like-> Integer,Float etc are implement Comparable Interface)
    // to perform a sorting operation Collections Interface will provide us sort() method.   Collections.sort(a);
    public static void main(String[] args){
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(18);
        a.add(2);
        a.add(33);
        a.add(1);
        System.out.println(a);   // 18, 2, 33, 1]
        Collections.sort(a);
        System.out.println(a);   // [1, 2, 18, 33]

        // when we perform sorting operation first  compiler is your data follow both these conditions or not.
        // Collections.sort() method internally uses compareTo() method. 
        // and basically ismay apan hr char ki ascii values ky basis per complete data ko sort krtay
        // ye basically dona character ki ascii value ko compare krta aur-->dono same ha tao return 0.
                                                                        // 1st is greater than 2nd return +ve value
                                                                        // 1st is smaller than 2nd return -ve value
        // a.add(null);.if we try to add it null value we get null pointer Exception.
        System.out.println(a);
        // Collections.sort(a);
        //System.out.println(a);


    }

}