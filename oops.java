import java.util.*;
import bank.*;
class Pen {
 String color;
 String type;

 public void write(){
    System.out.println("Writting Something");
 }public void printColor(){
    System.out.println(this.color);
 }
}
class Student {
    String name ;
    int age ;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
   // Non parametrized constructor  
    // Student(){
    //     System.out.println("Constructor Called");
    // }


    //Parametrized constructor 
    Student(String name , int age){
             this.name = name;
             this.age = age;
         }
}
public class oops{
     public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.color = "blue";
        // p1.type = "gel";

        // Pen p2 = new Pen();
        // p2.color = "Red";
        // p2.type = "Dot";

        // p1.printColor();
        // p2.printColor();
        // p1.write();
        bank.Account account1 = new bank.Account();
         Student s1= new Student("Aditya", 24);
         
      
        s1.printinfo();
     }
}