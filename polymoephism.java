class Student {
    String name ;
    int age ;
    
 public void printInfo(String name){
    System.out.println(name);
 }
 public void printInfo(int age){
    System.out.println(age);
 }

 public void printInfo(String name , int age){
    System.out.println(name + " " + age);
 }

}
   
public class polymoephism {
    public static void main(String[] args) {
        
    
    Student s3 = new Student();
    s3.name = "Aditya";
    s3.age = 24;
    s3.printInfo(s3.name , s3.age);
    }
}
