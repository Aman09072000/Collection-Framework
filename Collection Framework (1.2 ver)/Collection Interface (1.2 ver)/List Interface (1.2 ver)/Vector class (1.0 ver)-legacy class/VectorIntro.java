
import java.util.*;
public class VectorIntro {
    public static void main(String[] args){
        // use default constructor
        Vector v = new Vector();
        v.add("aman");
        v.add(120);
        v.add(13.34);
        System.out.println(v);   //[aman, 120, 13.34]
        System.out.println(v.capacity());  //10


        Vector<String> vs = new Vector<String>();
        vs.add("aman");
        vs.add("ama");
        vs.add("am");
        System.out.println(vs);   //[aman, ama, am]
        System.out.println(vs.capacity());  //10

        // use our own capacity

        Vector<Integer> vi = new Vector<Integer>(5);
        vi.add(1);
        vi.add(2);
        vi.add(3);
        vi.add(4);
        System.out.println(vi);   //[1, 2, 3, 4]
        System.out.println(vi.capacity());  // 5

        //our own capacity and our own increment value
        Vector<Double> vf = new Vector<Double>(3,2);
        vf.add(1.2);
        vf.add(1.4);
        vf.add(1.6);
        System.out.println(vf + "  capacity is--"+vf.capacity());   //[1.2, 1.4, 1.6]  capacity is--3
        vf.add(1.8);
        System.out.println(vf +"   capacity is--" + vf.capacity());  // [1.2, 1.4, 1.6, 1.8]   capacity is--5


        //working with last constructor adding one collection data into another
        
        Vector<String> vv = new Vector<String>(vs);
        vv.add("last value");
        System.out.println(vv +" "+ vv.capacity());  // [aman, ama, am, last value] 6

        //...................................................
        


    }
}
