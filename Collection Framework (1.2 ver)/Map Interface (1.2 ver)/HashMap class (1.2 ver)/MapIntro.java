
import java.util.*;
import java.util.Map.Entry;
public class MapIntro {
    //The root interface of map interface is map.
  // Map interface is introduce in java 1.2 version.
  // collection and map Interface both are totally different.
  // In Collection Interface we can store only one Object at a time But in Map we can Store Two Object at a time. 
  // In map Interface we can Store two onject at a time in the form of key value pair.
  // in it data is also stored in the form of key-value pair.
  
  // Map Interface has 3 implementaton classes---> 1)- HashMap   2)- LinkedHashMap   3)-TreeMap
  //the Map hierarchy is same as Set hierarchy.
  
  // as in Map data stored in key-Values pair format here the Key must be unique and Values can be duplicated.
  // In map null is allowed and as it is not a legacy class and all methods of map interface is non-synchronized.
  // In Map interface to get only Keys data we use keySet() method. and to get only Values we use values() method.
  // and to get both entry we use entrySet() method. 
  //return type of keySet() is Set and Values() are Collection. ans emtrySet() method is Collection.we have seprate Entry interface for this also.

  // HashMap........................................................................................

  //the HashMap introduce in java 1.2 version.\
  // HashMap and LinkedHashMap both are same but the only difference is that HashMap introduce in java 1.2 version while
  // LinkedHashMap introduce in 1.4 version. and in HashMap insertion order is not-preserved while in LinkedhashMap insertion order 
  // is preserved.
  // as HashMap is introduce in java 1.2 verion its all methods are non-synchronized and it is not legacy class/
  // it store hetrogeneous data.

  // The underline data structure of HashMap is HashTable.
  // in it cursors are not allowed.
  // to insert aa data in it we use put() method.
  public static void main(String[] args){
    //it has 4 constructors-->
    //1)- Default Constructor--> 
    HashMap<Integer, String> hm = new HashMap<Integer, String>();
    hm.put(2,"dvdv");
    hm.put(8, "gdg");
    hm.put(1, "vdd");
    System.out.println(hm);  // {1=vdd, 2=dvdv, 8=gdg}
    Set<Integer> KK = hm.keySet();
    System.out.println(KK);   //[1, 2, 8]
    Collection<String> vv= hm.values();
    System.out.println(vv);   // [vdd, dvdv, gdg]
    Collection<Entry<Integer, String>> s1 = hm.entrySet();
    for(Entry<Integer, String> e : s1)
      System.out.print(e.getKey()+" "+e.getValue() + "\t");  // 1 vdd   2 dvdv  8 gdg
    System.out.println();
   // 2)- Constructor in which we put our owm initialcapacity.
   // 3)- Constructor in which we can put our owm initial capacity and Loadcapacity.
   // 4)- Map Constructor--> in this Constructor we can any map data into another map data.

   HashMap<Integer, String> hl = new HashMap<Integer, String>(hm);
   Collection<Entry<Integer, String>> aa = hl.entrySet();
   for(Entry<Integer, String> e : aa)
        System.out.print(e.getKey()+" "+e.getValue() + "\t"); 

    }
  
   

  

  
}
