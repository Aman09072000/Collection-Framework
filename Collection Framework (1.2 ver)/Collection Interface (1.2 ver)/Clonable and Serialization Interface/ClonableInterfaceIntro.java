import java.lang.Cloneable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public class ClonableInterfaceIntro implements Cloneable {
    // to support cloneing and serialization every class will implements Clonable and Seriazable Interface
    
    //Cloneing process--> the process of creating exactly a duplicate copy of object is called cloneing.
    //serialization--> it is the process of converting Object data into Network supported form is called serialization.
    
    // we use clone() method for cloneing purpose.
    //Initially our class will not implement clonable interface. we can implement cloneable interface to do cloneing process.
    
    // Cloneable Interface belong to java.lang package.
    // A Cloneable interface is a mark interface --> means it is an empty interface with no methods. 
    //By implementing Cloneable interface our class get capability of cloneing . this is called marker interface capabilities.
    
    
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("Aman");
        a.add("ram");
        a.add("shaym");
        System.out.println(a);  // [Aman, ram, shaym]

        ArrayList<String> Acopy = (ArrayList<String>)a.clone(); // here we convert clone object to arrayList of String. 
        System.out.println(Acopy);  //[Aman, ram, shaym]

        // We can implement Cloneable Interface in any of our class. 


        LinkedHashSet<Integer> aa = new LinkedHashSet<Integer>();
        aa.add(42);
        aa.add(55);
        aa.add(1212);
        System.out.println(aa); //[42, 55, 1212]

        LinkedHashSet<Integer> ab = (LinkedHashSet<Integer>)aa.clone();
        ab.add(765);
        System.out.println(ab);  // [42, 55, 1212, 765]

        ArrayList<Integer> as = new ArrayList<Integer>(ab);
        as.add(123);
        System.out.println(as);  // [42, 55, 1212, 765, 123]

        
    }
}
