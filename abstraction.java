abstract class Animal{
   abstract public void walk();
   public void eat(){
    System.out.println("animal eats");
   }
   Animal(){
System.out.println("Creating a new Constructor");//we can create a constructor of an abstract class also
   }
}
class Horse extends Animal{
      public void walk(){
        System.out.println("Walks on 4 legs");
      }
      Horse(){
        System.out.println("created a horse");
      }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        //h1.walk();
       // Animal an1 = new Animal();
       // an1.walk();
        //h1.eat();
    }
}
