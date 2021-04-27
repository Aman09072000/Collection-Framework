import java.util.LinkedHashSet;
import java.util.LinkedList;
public class Intro {
    // it is introduce in java 1.4 version
    // it is same as HashSet class but the only difference is that its insertion order is preservsed while HashSet class insertion order is not preserved.
    // it is a child class of HashSet class. and also a implementation class of Set Interface.
    
    public static void main(String[] args){
        //LinkedHashSet has also has a 4 constructor just like HashSet
        //1)--> Default Constructor
                //normal version
        LinkedHashSet lh = new LinkedHashSet();
        lh.add("dv");
        lh.add(323);
        lh.add(34.4);
        System.out.println(lh);  //[dv, 323, 34.4]
        
            //genric version
        LinkedHashSet<String> l = new LinkedHashSet<String>();
        l.add("aa");
        l.add("bb");
        l.add("cc");
        System.out.println(l);  // [aa, bb, cc]

        //2)---> constructor with our own initial capacity
        LinkedHashSet<Integer> ll = new LinkedHashSet<Integer>(3);
        ll.add(22);
        ll.add(12);
        ll.add(65);
        System.out.println(ll);  // [22, 12, 65]

        //3)--> constructor woth our own initial capacity ans load factor
        LinkedHashSet<String> lj = new LinkedHashSet<String>(3);
        lj.add("dg");
        lj.add("bfb");
        lj.add("vcd");
        System.out.println(lj);  // [dg, bfb, vcd]

        //4)--> Collection constructor --> this constructor is for adding one constructor data into into another.
        LinkedList<String> la = new LinkedList<String>();
        la.add("nx");
        la.add("vdvd");
        System.out.println(la);  // [nx, vdvd]

        LinkedHashSet<String> lb = new LinkedHashSet<String>(la);
        lb.add("sffs");   // [nx, vdvd, sffs]

        System.out.println(lb);

        //we will use addAll method here.
        LinkedHashSet<String> lc = new LinkedHashSet<String>();
        lc.add(" # ");
        lc.addAll(la);
        lc.add(" #1 ");
        lc.addAll(lb);
        lc.add(" #2 ");
        System.out.println(lc);  // [ # , nx, vdvd,  #1 , sffs,  #2 ]  --. few element are absent because dublication is not allowed in set.
        




    }
}
