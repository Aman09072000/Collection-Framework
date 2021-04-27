import java.util.*;
public class StackIntro {
    //Stack is introduce in java 1.0 version. so it is legacy class.
    //it is by-default synchronized.                                                         _             _
    // stack is child class of vector.                                                        |           |
    // Stack follow LIFO (last in first out) order.                                           |           |
    //                                                                                        |           |
    //  it has only one Constructor -> default constructor - java.util.Stack();               |           |
    // constructor used to create empty class and it has two main operation :-(inserting) 4   |           | 1  (removing)
                // 1)- push() - it is for inserting the data.                             3   |           | 2   (+searching)
                //2)- pop() - it is for removing of data.                                 2   |           | 3
    //other operation :-                                                                  1   |           | 4
            // #--> peek() -> it return us a top most element of the stack.                    -----------
            // #--> empty() -> it check if the stack is empty or not. (return type--> Boolean)
            // #--> search() -> it is uder for searching element in the stack.
    //it also follow all methods of list and collection interface.  like- clear()- for empty complete stack.      

    public static void main(String[] args){
        //genral version
        Stack s = new Stack();
        s.push("aman");
        s.push("ram");
        s.push(232);
        s.push(1.2);
        System.out.println(s);   //[aman, ram, 232, 1.2]
        System.out.println(s.pop());  // 1.2  -->in it pop() remove the top most element from the stack
        System.out.println(s.peek());  // 232 --> it returns the top most element of the stack
        System.out.println(s.search("aman")); // 3 --> it returns the index value of your particular element.
        System.out.println(s.empty()); //false  --> it checks the stack is empty or not.(return type- boolean)
        s.clear();  // it empty our complete stack.
        System.out.println(s); // [] -->  our Stack is empty.

        //....................................................................................................
        //genric version

        Stack<String> sa = new Stack<String>();
        sa.push("aman");
        sa.push("gupta");
        sa.push("b.tech");
        sa.push("cse");
        System.out.println(sa); // [aman, gupta, b.tech, cse]
        System.out.println(sa.pop());   // cse --> it remove top element of the stack
        System.out.println(sa.pop());   // b.tech-->  remove top element
        System.out.println(sa.peek());  // gupta --> it return the top most element of the stack.
        System.out.println(sa.search("aman")); // 2  -> it return the index value.
        System.out.println(sa.empty()); // false -->it check the stack is empty or not.
        sa.clear();
        System.out.println(sa); // [] --> it empty our complete stack.
        
    }
}
