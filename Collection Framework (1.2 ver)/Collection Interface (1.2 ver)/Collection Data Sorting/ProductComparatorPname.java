import java.util.Comparator;
public class ProductComparatorPname implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        Product p1= (Product) o1;
        Product p2 = (Product) o2;
        
        //ascending order
        //return p1.pname.compareTo(p2.pname);

        //descending order
        return -p1.pname.compareTo(p2.pname);
    }
}
