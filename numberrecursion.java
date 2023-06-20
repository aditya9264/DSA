import java.util.*;
public class numberrecursion {

    static void print(int n){
        //base Condition
        if(n==5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
     //Recursive Call

     //if you are calling a function again and again , you can treat is as seperate call in stack

     //it is called  tail recursion
    //because this is the last function call
        print(n+1);
    }
    public static void main(String[] args) {

        print(1);
    }
        
    
}
