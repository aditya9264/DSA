class Shape{
    String color;
}
class Triangle extends Shape{ 
     public void area (int l , int h)//Single Inheritence because it is derived From Base class

     System.out.println(1/2*l*h);
}
class EquilateralTriangle extends Triangle{
    public void area(int l , int h){//Multilevel Inheritence because it is derived for a derived class. 
        System.out.println(1/2*l*h);
    } 

}
class circle extends Shape {
    print void area(int r){
        System.out.println( (3.14)*r*r);//Hierarchial Inheritence because it is same base class as triangle was. 
    }
}

public class inheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red" ;
    }
}
