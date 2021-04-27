import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProduct {
    public static void main(String[] args){
        TreeSet<Product> t = new TreeSet<Product>(new ProductComparator());
        t.add(new Product(3,"bb", 2.4));
        t.add(new Product(1, "cc", 24.3));
        t.add(new Product(2,"aa",43.42));
        for(Product p : t)
            System.out.print(p.pid+" "+p.pname+" "+p.pcost+"\t");  // 3 bb 2.4        2 aa 43.42      1 cc 24.3       
        System.out.println();
        
        Iterator<Product> pq = t.iterator();
        while(pq.hasNext()){
            Product p1 = pq.next();
            if(p1.pname.equals("cc")) pq.remove();
            else System.out.print(p1.pid+" "+p1.pname+" "+p1.pcost+"\t");  // 3 bb 2.4        2 aa 43.42      
        }
    }
}
