import java.util.ArrayList;
public class diffOprations {
    public static void main(String[] args){
        ArrayList<String> aa = new ArrayList<String>();
        aa.add("aa");
        aa.add("bb");
        aa.add("cc");
        aa.add("dd");

        for(int i=0 ; i<aa.size() ; i++){   // aa.size() - it is for finding length of ArrayList.
            System.out.println(aa.get(i)); //  aa.get(n) is a method for taking ArrayList data index wise. its indecing start with 0.
        }

        aa.add(2,"ee");   // it is for adding a new element in specified pogition .
        System.out.println(aa); // [aa, bb, ee, cc, dd]
      //  aa.add(7,"jj"); // if user give index value more than length of Arraylist . error come (java.lang.IndexOutOfBoundsException)
        System.out.println(aa);

        aa.remove(3);  // it is for removing any value from the specified index (remove by index value) .
        System.out.println(aa);  // [aa, bb, ee, dd]
        aa.remove("bb");   // removing the data by it name. 
        System.out.println(aa);  //[aa, ee, dd]

        aa.add(3,"aa");
        System.out.println(aa);  // [aa, ee, dd, aa]
        aa.remove("aa");  // if the two values of same name is present it will remove the first value only and ifnore rest values.
        System.out.println(aa);     //[ee, dd, aa]


        aa.set(0,"aa");  // it is for replacing the data of specified pogition 
        System.out.println(aa);  //[aa, dd, aa]

        System.out.println(aa.isEmpty()); //it checks is the ArrayList is empty or not. return type- Boolean. //false

        aa.clear(); // it clear our complete ArrayList
        System.out.println(aa);  //[]

        System.out.println(aa.isEmpty()); // true
        
 
    }
}
