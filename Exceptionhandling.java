public class Exceptionhandling {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            System.out.println(10/0);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("close connection");
        }
        System.out.println("ends");
    }
}
