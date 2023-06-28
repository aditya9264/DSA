import java.util.*;
public class LLP {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.addFirst(1);
        num.add(5);
        num.add(7);
        num.add(3);
        num.add(8);
        num.add(2);
        num.add(3);
        System.out.println(num);
        System.out.println(num.size());
        for(int i=0;i<num.size();i++){
            if(num.get(i) == 4){
                System.out.println("7 is found at  index " + i );
            }
            else if(num.get(i) == num.size()){
                System.out.println("Value is not present in the list");
            }
        }

    }
}
