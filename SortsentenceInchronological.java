import java.util.*;
public class SortsentenceInchronological {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
        String rev = " ";

        String s[] = str.split(" ");
        for(int i=0;i<s.length;i++){
            rev = s[i]+ " "+rev;
        }
        System.out.println(rev);
    }
}
