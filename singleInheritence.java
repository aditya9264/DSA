class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l , int h){
   System.out.println(1/2*l*h);
    }
}
public class singleInheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2,4);
    }
}
