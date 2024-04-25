import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

    //Functional Interface -- an interface with just one Abstract method.
    interface Itr{
        int add(int a, int b);
    }
    public static void main(String[] args) {
        Itr i = (a,b) -> a+b;
        System.out.println((i.add(10, 20)));


        Predicate<String> p = (s)->s.length()>5;
        System.out.println(p.test("Aditya Singh"));
    }

    Function<String, Integer> f = (s)-> s.length();
    System.out.println(f.apply("Aditya"));

}
