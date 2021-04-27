import java.util.Comparator;
public class ProdComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Product p1 =(Product)o1;
        Product p2 = (Product)o2;
        //for ascending order
        // if(p1.pid==p2.pid)return 0;
        // else if(p1.pid > p2.pid) return 1;
        // else return -1;

        //for decending order
        if(p2.pid==p1.pid) return 0;
        else if(p2.pid>p1.pid) return 1;
        else return -1;
    }
}