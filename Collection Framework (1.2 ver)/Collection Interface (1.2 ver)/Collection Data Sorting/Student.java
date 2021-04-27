//as it is our student class. and we will sort it according sid. 
// so bydefault only String class and all Wrapper class only implement Comparable interface and so sorting is possible in it. 
// so, first we implement Comparable interface in our Student class.
import java.lang.Comparable;
public class Student implements Comparable{
    int sid;
    String sname;
    double smarks;
    public Student(int sid , String sname , double smarks){
        super();
        this.sid = sid;
        this.sname =sname;
        this.smarks = smarks;
    }
//when we sort data according to sid
    @Override
    public int compareTo(Object o){
        Student s = (Student)o;
        if(sid == s.sid) return 0;
        else if(sid > s.sid) return 1;
        else return-1;
    }
  

}
