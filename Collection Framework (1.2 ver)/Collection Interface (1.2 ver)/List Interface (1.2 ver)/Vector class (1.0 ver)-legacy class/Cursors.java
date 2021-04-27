import java.util.*;
public class Cursors {
    public static void main(String[] args){

        Vector<String> vv = new Vector<String>();
        vv.add("aman");
        vv.add("gupta");
        vv.add("B.Tech");
        vv.add("CSE");

        //Iterator
        //remove element of Vector using Iterator
        Iterator<String> e = vv.iterator();
        while(e.hasNext()){
            String s = e.next();
            if(s.equals("aman")){
                e.remove();
            } else{
                System.out.print(s +" "); //gupta B.Tech CSE
            }
            
        }

        //.............................................
        //ListIterator
        System.out.println();
        //changing and removing and adding element by using ListIterator cursor.
        ListIterator<String> lt = vv.listIterator();
        while(lt.hasNext()){
            String ss = lt.next();
            if(ss.equals("CSE")) lt.set("cse");
            System.out.print(ss +" ");  //gupta B.Tech CSE           
        }
        
        System.out.println(vv);   //[gupta, B.Tech, cse]
        while(lt.hasPrevious()){
            String sa =lt.previous();
            if(sa.equals("B.Tech")) lt.remove();
            else System.out.print(sa+" ");   //cse gupta
        }

        //...................................................................
        //Enumeration
        System.out.println(vv);   //  [gupta, cse]
        //print all element using Enumeration cursor (as vector is introduce in 1.0 version so it supports all 3- cursors.)
        
        Enumeration<String> ff  = vv.elements();
        while(ff.hasMoreElements()){
            String st = ff.nextElement();
            System.out.print(st +" ");   // gupta cse
        }

    }
}
