import java.util.*;

public class Task1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter your name: ");

    String name = sc.nextLine();

    String[] tasks = new String[5];
    for (int i = 0; i < 5; i++) {
        System.out.print("Task " + i + ": ");
        tasks[i] = sc.nextLine();
    }
   System.out.println(name);
   System.out.println("Task for the day-");
   Arrays.sort(tasks);

   for (int i=0 ; i<tasks.length ; i++){
    System.out.println((i+1)  +" : " + tasks[i]);
   }
   for (int i = tasks.length - 1; i >= 0; i--) {
    System.out.println((tasks.length - i) + ". " + tasks[i]);
}
boolean hasRepeatedTask = false;
for (int i = 0; i < tasks.length - 1; i++) {
    for (int j = i + 1; j < tasks.length; j++) {
        if (tasks[i].equals(tasks[j])) {
            hasRepeatedTask = true;
            break;
        }
    }
    if (hasRepeatedTask) {
        break;
    }
}
if (hasRepeatedTask) {
    System.out.println("There are repeated tasks.");
} else {
    System.out.println("There are no repeated tasks.");
}
    
    }
}
