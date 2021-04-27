import java.util.Serialization;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Deserialization;
public class SerizableIntro {
    // Serialization--> it is the process of converting a java Object data into network supported form
    //when our project run under various versions of JVM instances. then we go with Serialization and deseerialization.
    //the process of writing/saveing object data into file is called serialization.
    // and the process of reading the object is called Deserialization.

    //intially no class will implement Serialization interface. so we must implement the Serialization, Deserialization Interface to read and write in the data.
    // For Doing complete this process we used both-->serialization-->for writing the data.
                                                    //deserialization-->for reading the data.

    //In serialization we required two classes to write the object-->
    //1)--> FileOutputStream      2)--> ObjectOutputStream

    //In Deserialization we required two classes toRead the Object data-->
    //1)--> FileInputStream       2)--> OnjectInputStream

    void serializationDemo(){
        Emp e = new emp(11,"aman");
        FileOutputStream FOS = new FileOutputStream("abc.txt");
        ObjectOutputStream OOS = new ObjectOutputStream(FOS);
        OOS.writeObject(e);
        OOS.close();
        System.out.println("Serialization process complete !!");
    }

    void deserializationdemo(){
        FileInputStream FIS = new FileInputStream("abc.txt");
        ObjectInputStream OIS = new objectInputStream(FIS);
        Emp e= (Emp)OIS.readObject();
        System.out.println(e.eid+" "+e.ename);
        OIS.close();
    }
    public static void main(String[] args){
        SerizableIntro t = new SerizableIntro();
        t.serializationDemo();
        t.deserializationdemo();
    }
    
    /////////......................Concept NOT Clear..........................////////////
}
