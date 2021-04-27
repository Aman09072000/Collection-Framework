import practise.ProdComparator;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
public class Main{
    public static void main(String[] args){
        LinkedList<Product> P = new LinkedList<Product>();
        P.add(new Product(4,"ddd",42.4));
        P.add(new Product(1, "ee", 43.4));
        P.add(new Product(3,"aa",34.4));
        for(Product p : P)
            System.out.print(p.pid+" "+p.pname+" "+p.pcost+"\t");  //4 ddd 42.4      1 ee 43.4       3 aa 34.4
        System.out.println();

        Collections.sort(P, new ProdComparator());
        for(Product p : P)
            System.out.print(p.pid+" "+p.pname+" "+p.pcost+"\t");  //ascending--> 1 ee 43.4       3 aa 34.4       4 ddd 42.4
                                                                //decending--> 4 ddd 42.4      3 aa 34.4       1 ee 43.4
        System.out.println();

        Collections.sort(P, new ProductComparatorPname());
        for(Product p : P)
            System.out.print(p.pid+" "+p.pname+" "+p.pcost+"\t"); //ascending--> 3 aa 34.4       4 ddd 42.4      1 ee 43.4
                                                                //descending--> 1 ee 43.4       4 ddd 42.4      3 aa 34.4
        


    }
}