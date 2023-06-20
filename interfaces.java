interface Aanimal{
    int eyes = 2;
    void walk();
}
interface Herbivore{
     
}
class Horce implements Aanimal{
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
