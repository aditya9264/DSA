import java.util.Scanner;

public class updatebir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();// if operation 1 then update bit to 1 else update bit to 0
        int pos = sc.nextInt();
        int n = 5;

        int bitMask = 1 << pos;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int notbitMask = ~(bitMask);
            int newNumber = (notbitMask & n);
            System.out.println(newNumber);
        }

    }
}
