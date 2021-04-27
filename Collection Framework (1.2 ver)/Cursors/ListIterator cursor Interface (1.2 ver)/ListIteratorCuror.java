import java.util.*;
public class ListIteratorCuror {
    // it is introduce in java 1.2 version.
    // it is only for List classes. and it is a bi-dirrectional cursor.it is not a universal cursor
    // we will get ListIterator Object by--> ListIterator() method
    // it has 9- method--> 1)-hasNext()      2)-next()   ---> these both are for reading the data.
                        // 3)-hasPrevious()   4)- Previous() ---> to read data backward dirrction.
                        // 5)- nextIndex()   6)-PreviousIndex() --> to get a index
                        //7)- set()   8)-add()   9)- remove()
    // its cursor dirrection is forward and backward both dirrection.
    // it is Interface and it support both normal and genrics version.

    public static void main(String[] args){
        //normal version
        ArrayList a = new ArrayList();
        a.add(123);
        a.add("aman");
        a.add(23.22);

        ListIterator lt = a.listIterator();
        //forward dirrection
        while(lt.hasNext()){
            System.out.print(lt.next() +" ");   // 123 aman 23.22
        }
        //backward dirrection
        while(lt.hasPrevious()){
            System.out.print(lt.previous() +" ");   //23.22 aman 123
        }

        // genric version
        ArrayList<Integer> aa = new ArrayList<Integer>();
        aa.add(1);
        aa.add(2);
        aa.add(3);

        ListIterator<Integer> e = aa.listIterator();
        //forward dirrection
        while(e.hasNext()){
            System.out.print(e.next() + " "); //  1 2 3
        }
        //backward dirrection
        while(e.hasPrevious()){
            System.out.print(e.previous() + " "); // 3 2 1
            
        }

    }


}
