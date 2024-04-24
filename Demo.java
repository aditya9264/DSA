public class Demo {
    public static void main(String[] args) {
        System.out.println("hello" +"world");
        System.out.println(10+20+"hello");
        System.out.println("hello"+10+20); // the compiler read the line from left to right and hence first one
        //is string then it treadted everything like a string and concatenate them
    }

}
