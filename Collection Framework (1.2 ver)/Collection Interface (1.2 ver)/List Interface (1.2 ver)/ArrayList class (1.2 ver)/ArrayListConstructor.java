import java.util.*;
public class ArrayListConstructor {
    public static void main(String[] args){
        // ArrayList as 3 types of Constructor.

        //1- Default constructor.
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        System.out.println(aa + " ArrayLisr size- " +aa.size());  // [1, 2, 3] ArrayLisr size- 3

        //2- ArrayList of Specific Initial capacity
        ArrayList<String> as = new ArrayList<String>(3);
        as.add("aa");
        as.add("bb");
        as.add("cc");
        System.out.println(as + " ArrayList size- " + as.size()); // [aa, bb, cc] ArrayList size- 3

        //3- it is for adding one arraylist/list data to another arraylist/list.
        ArrayList<String> ap  = new ArrayList<String>( as );
        ap.add("zz");
        ap.add("yy");
        ap.add("xx");
        System.out.println(ap);  //  [aa, bb, cc, zz, yy, xx]

        // we will also addAll() method . to add one List intp another.
        ArrayList<String> aq =new ArrayList<String>();
        aq.add("pp");
        aq.add("qq");
        aq.add("rr");
        aq.addAll(ap);
        System.out.println(aq);   //  [pp, qq, rr, aa, bb, cc, zz, yy, xx]

        //......................................................................................

        // Lets discuss few more methods of ArrayList
    
        aq.add("ram");
        aq.addAll(as);
        System.out.println(aq);  //[pp, qq, rr, aa, bb, cc, zz, yy, xx, ram, aa, bb, cc]

        System.out.println(aq.contains("ram"));  // its return type is- boolean . it check particular element is presentin the Arraylist or not.// true
        System.out.println(aq.containsAll(as)); //return type- boolean . it check particular complete collection in another collection.// true

        aq.remove("aa"); //remove first aa from the collection and ignore all others. 
        aq.removeAll(as);  //it remove one complete collection into another. 
        System.out.println(aq);   // [pp, qq, rr, zz, yy, xx, ram]

        aq.retainAll(ap);  // it remove all other  colection element except element of ap .
        System.out.println(aq);  //[zz, yy, xx]--> thses all are ap elements.

        // few important menthods of arrayList are.
        //subList and swap method
        ArrayList<Integer> an = new ArrayList<Integer>();
        for(int i=0 ; i<=10 ; i++){
            an.add(i);
        }
        System.out.println(an); //  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //lets create a subList from 1 to 5 (including).
        ArrayList<Integer> ab = new ArrayList<Integer>(an.subList(0,6));//here 0 is included and 6 is excluded from the new list
        System.out.println(ab);  // [0, 1, 2, 3, 4, 5]

        //lets use the Collections.swap() methos and swap 0 and 5.
        Collections.swap(ab,0,5);  // ab is the list name and 0 and 5 are the index values.
        System.out.println(ab);  // [5, 1, 2, 3, 4, 0]

        //.................................................................

        // we will convert any array to collection(List) and collection(List) to array by using Arrays.toList() and a2.toArray() methods.

        //  Arrays --->(to)  Collection(List)

        Integer[] n = {1,2,3,4,5};
        ArrayList<Integer> nn1 = new ArrayList<Integer>(Arrays.asList(n));
        nn1.add(420);
        System.out.println(nn1);  // [1, 2, 3, 4, 5, 420]

        //Collection--> Array
        
        Integer[] am = new Integer[nn1.size()];
        nn1.toArray(am);  // by this collection nn1 will convert to Array am.
        for(Integer om : am){
            System.out.print(om+" ");  //  1 2 3 4 5 420
        }
        
        // lets convert any type of data into Array. 
        // as Array store one single type of data so we create a Array of Object so it will take any type of data then.
        
        ArrayList az = new ArrayList();
        az.add("aman");
        az.add(120);
        az.add(323.3123);
        System.out.println(az);  //[aman, 120, 323.3123]

        //lets know convert this ArrayList into Array
        Object[] cc = new Object[az.size()];
        az.toArray(cc);
        for(Object m : az){
            System.out.print(m + " ");   // aman 120 323.3123
        }




    }
}
