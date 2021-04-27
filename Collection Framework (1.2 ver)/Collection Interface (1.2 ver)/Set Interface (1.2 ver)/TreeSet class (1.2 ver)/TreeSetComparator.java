import java.util.Comparator;
public class TreeSetComparator implements Comparator {
    @Override
    public int compare(Object o1 , Object o2){
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        if(i2==i1)return 0;
        else if(i2>i1)return 1;
        else return -1;
    }
    
}
