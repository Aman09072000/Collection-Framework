import java.util.Vector;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Iterator;
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
        vv.add(3);
                                                                                // elements()
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
//...............................................................................................................
    
        // 2)- Iterator Cursor--> 
        // Iterator cursor introduce in java 1.2 ver.
        // it is a Universal cursor. so it is used for all classes.
        // we will get a Iterator object by--> iterator() method
        // iterator has 4- methods-->1)- hasNext() - it checks the data availability.
        //2)- next() - it for read the data.
        //3)- remove() - it is for removing data.
        //4)- forEachRemaining() - 

        // we will perform read and remove operation in it. and it is only read data in forward dirrection.
        //it is Interface. and support bith normal and genric form.

        // Iterator is best for ArrayList when we want to remove any item s its index value will change in every operation.
        //normal version of iterator--> all types of elements.
        ArrayList a = new ArrayList();
        a.add(120);
        a.add("aman");
        a.add(32.22);        
        Iterator i = a.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");  //  120 aman 32.22
        }
        System.out.println();
        // genric version of iteraator-->same type of data only
        ArrayList<String> as = new ArrayList<String>();
        as.add("aa");
        as.add("bb");
        as.add("cc");
        Iterator<String> ss = as.iterator();
        while(ss.hasNext()){
            String s = ss.next();
            System.out.print(s+" ");   // aa bb cc
            if(s=="bb") ss.remove();
            else System.out.print(s+" ");  // aa aa bb cc cc
        }
//.................................................................................................................

        //3)--> ListIterator Cursor ->
        //// it is introduce in java 1.2 version.
        // it is only for List classes. and it is a bi-dirrectional cursor.it is not a universal cursor
        // we will get ListIterator Object by--> ListIterator() method
        // it has 9- method--> 1)-hasNext()      2)-next()   ---> these both are for reading the data.
                            // 3)-hasPrevious()   4)- Previous() ---> to read data backward dirrction.
                            // 5)- nextIndex()   6)-PreviousIndex() --> to get a index
                            //7)- set()   8)-add()   9)- remove()
        // its cursor dirrection is forward and backward both dirrection.
        // it is Interface and it support both normal and genrics version.

        ArrayList a = new ArrayList();
        a.add(123);
        a.add("aman");
        a.add(23.22);
        ListIterator lt = a.listIterator();
        //forward dirrection
        while(lt.hasNext()){
            System.out.print(lt.next() +" ");   // 123 aman 23.22
        }
        //backward dirrection
        while(lt.hasPrevious()){
            System.out.print(lt.previous() +" ");   //23.22 aman 123
        }

        // genric version
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        ListIterator<Integer> e = aa.listIterator();
        //forward dirrection
        while(e.hasNext()){
            System.out.print(e.next() + " "); //  1 2 3
        }
        //backward dirrection
        while(e.hasPrevious()){
            System.out.print(e.previous() + " "); // 3 2 1            
        }



    }
}
