import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args){
        //creating ArrayList

        //ArrayList contains multiple objects. this become problem so to resove this issue we used the concept of genrics and Auto-boxing.
        // problem create is due to this that - it is not typesafe so the problem come in type checking and type casting. 
        ArrayList a = new ArrayList();
        a.add("welcome");
        a.add(2021);
        a.add("welcome");
        a.add(null); // null is allowed
        a.add(1.445);
        System.out.println(a);   //[welcome, 2021, welcome, null, 1.445]

        for(Object aa : a){
            System.out.println(aa);   //welcome 2021 welcome            
        }

        //creating ArrayList by using genrics and Auto-boxing concept.
        //Arraylist which can take only string .
        ArrayList<String> as = new ArrayList<String>();
        as.add("aman");
        as.add("ram");
        as.add("shyam");
        System.out.println(as.toString());  //[aman, ram, shyam]

        //ArrayList which take int and Atring element.
        ArrayList<Integer> ad = new ArrayList<Integer>();
        ad.add(1);
        ad.add(2);
        ad.add(3);
        System.out.println(ad);   //[1, 2, 3]     



    }
}
