import java.util.*;
public class LLDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i=0;i<50;i++){
             list.add(i);
        }
        for (int i=0;i<50;i++){
            if(list.get(i) > 25){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
