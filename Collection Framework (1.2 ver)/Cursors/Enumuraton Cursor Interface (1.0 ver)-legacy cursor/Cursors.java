import java.util.Vector;
import java.util.Enumeration;
public class Cursors {

    // we can read data by 3 ways =
    // 1)- by for-each loop (Iterable interface)
    //2)- by using get() method
    //3)- by using cursors --> it is also of 3 types
         // a)- Enumuration cursor
         // b)- Iterator cursor
         // c)- ListIterator cursor

    //curor is applicable for all List classes . and for both version - normal version and genric version.    
    public static void main(String[] args){
        // 1)- Enumuration cursor--> introduce in 1.0 version so  it is leagacy cursor.
        // It will only read Leagacy class data . so nota universal cursor.
        // only read operation is possible in it.here data read only in forward dirrection.
        // it has teo methods--> a)- hasMoreElements() -> it check data availability
                            //   b)- nextElement() -> it read the data.
        // we get enumuration object by using---> elements() method

        // here we use vector as it also introduce in 1.0 ver so it is legacy class.
        // vector is same as ArrayList the only difference is vector has Synchronized methods while ArrayList has non- Synchronized methods.

        Vector<Integer> vv = new Vector<Integer>();
        vv.add(1);
        vv.add(2);
        vv.add(3);                                                              // elements()
        // System.out.println(vv);  //[1, 2, 3]                                // hasMoreElements()
                                                                               // nextElement();
        // lets print the data using Enumeration cursor.
        // with genric
        Enumeration<Integer> e = vv.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement() + " ");   // 1 2 3
        }
        
        // normal verion--> taking all types of data.
        Vector v = new Vector();
        v.add(120);
        v.add("aa");
        v.add(23.133);

        Enumeration ee = v.elements();
        while(ee.hasMoreElements()){
            System.out.print(ee.nextElement() +" ");  //  120 aa 23.133
        }


    }
}
