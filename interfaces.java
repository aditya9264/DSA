interface Aanimal{
    int eyes = 2;
    void walk();
}
interface Herbivore{//multiple Inheritence is not possible in Java but we
    //can do it using Interfaces by making another interface .
     
}
class Horce implements Aanimal , Herbivore{
    public void walk(){
        System.out.println("animal walks on 4 legs");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Horce horse = new Horce();
        horse.walk();
    }
}
