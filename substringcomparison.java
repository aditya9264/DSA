import java.util.*;

public class substringcomparison {
    public static String getsmallestlargest(String s , int k) {
    String currstring = s.substring(0,k);
    String smallest = currstring;
    String largest = currstring;
    
    for(int i=k;i<s.length();i++){
        currstring = currstring.substring(1 , k)+s.charAt(i);

        if(largest.compareTo(currstring) < 0){
            largest = currstring;
        }
        else if(smallest.compareTo(currstring) >0){
            smallest = currstring;
        }
    }
    return smallest + "\n" + largest;


}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(getsmallestlargest(s, k));

    }
}
