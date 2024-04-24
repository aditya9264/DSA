import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Adiyta Singh");
        System.out.println(sb);
        // print character at any index

        System.out.println(sb.charAt(0));

        // set character at any index

        sb.setCharAt(0, 'U');
        System.out.println(sb);
//    int rev;
//   for (int i = sb.length()-1;i>=0;i--){
//   rev = rev+sb.charAt(i);
//   }
//   System.out.println(rev);

        // insert char at any index
        sb.insert(1, 'a');
        System.out.println(sb);

        // delete something from some index
        sb.delete(0, 1);
        System.out.println(sb);

        // append something into the string
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb + " ");
    }
}
