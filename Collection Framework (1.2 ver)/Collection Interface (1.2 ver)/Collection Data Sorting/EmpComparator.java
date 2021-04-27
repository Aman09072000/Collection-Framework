// it become our Comparator class here we can write our sorting logic.
import java.util.Comparator;
public class EmpComparator implements Comparator{
    
    //it is when you sort data according to eid
    // @Override
    // public int compare(Object o1, Object o2){
    //     Emp e1 =(Emp)o1;
    //     Emp e2 = (Emp) o2;
    //     if(e1.eid==e2.eid)return 0;
    //     else if(e1.eid > e2.eid) return 1;
    //     else return -1;
    // }

    //when you sort data according to ename 
    @Override
    public int compare(Object o1, Object o2){
        Emp e1 =(Emp)o1;
        Emp e2 = (Emp)o2;
        return e1.ename.compareTo(e2.ename);
    }

}
