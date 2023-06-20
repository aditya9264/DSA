import java.util.*;

public class Vote {
    public static void validToVote(int age) {
        if (age >= 18) {
            System.out.println("You are older than 18 You age is Valid to vote");
        } 
        else {
            System.out.println("Your age is less than 18 you are not elgible to cast your vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
          validToVote(age);
    }
}
