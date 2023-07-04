class Stdent{
    String name ;
    int age ;
   //copy constructor
    Stdent(Stdent s2){
        this.name = s2.name ;
        this.age = s2.age;
    }
    Stdent(){

    }
    public void printinformation(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class copyconstructor {
    public static void main(String[] args) {
        Stdent s1= new Stdent();
        s1.name = "Adiyta";
        s1.age = 24 ;
       
        Stdent s2 = new Stdent(s1);
        s2.printinformation();
    }
    

        
    }
    