import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {
    // Iterator cursor introduce in java 1.2 ver.
    // it is a Universal cursor. so it is used for all classes.
    // we will get a Iterator object by--> iterator() method
    // iterator has 4- methods-->1)- hasNext() - it checks the data availability.
    //2)- next() - it for read the data.
    //3)- remove() - it is for removing data.
    //4)- forEachRemaining() - 

    // we will perform read and remove operation in it. and it is only read data in forward dirrection.
    //it is Interface. and support bith normal and genric form.
    public static void main(String[] args){
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


    }
}
