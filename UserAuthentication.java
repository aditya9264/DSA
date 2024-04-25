import java.util.Scanner;

class Task {
    private String description;
    private String assignee;

    public Task(String description, String assignee) {
        this.description = description;
        this.assignee = assignee;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}

class Client extends User {
    public Client(String username, String password) {
        super(username, password);
    }

    public void addTask(String description, String assignee) {
        System.out.println("Task added: " + description);
    }
}

class Visitor extends User {
    public Visitor(String username, String password) {
        super(username, password);
    }
}

public class UserAuthentication {
    private static final int MAX_USERS = 10;
    private static final int MAX_TASKS = 10;
    private static User[] users = new User[MAX_USERS];
    private static Task[] tasks = new Task[MAX_TASKS];
    private static int numUsers = 0;
    private static int numTasks = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register Client\n2. Register Visitor\n3. Login\n4. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    registerClient(sc);
                    break;
                case 2:
                    registerVisitor(sc);
                    break;
                case 3:
                    login(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void registerClient(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        // Register as a client
        Client client = new Client(username, password);
        users[numUsers++] = client;
        System.out.println("Client registration successful.");
    }

    private static void registerVisitor(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        // Register as a visitor
        Visitor visitor = new Visitor(username, password);
        users[numUsers++] = visitor;
        System.out.println("Visitor registration successful.");
    }

    private static void login(Scanner sc) {
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();

        User currentUser = null;
        for (int i = 0; i < numUsers; i++) {
            if (users[i].getUsername().equals(username)) {
                if (users[i].authenticate(password)) {
                    currentUser = users[i];
                    break;
                } else {
                    System.out.println("Incorrect password. Please try again.");
                    return;
                }
            }
        }

        if (currentUser == null) {
            System.out.println("User does not exist. Please register first.");
            return;
        }
        System.out.println("Login successful. Welcome, " + username + "!");
        if (currentUser instanceof Visitor) {
            // If the user is a visitor, display tasks assigned to them
            displayTasksForVisitor(username);
        } else {
            // If the user is a client, allow them to perform client-specific actions
            performClientActions((Client) currentUser, sc);
        }
    }

    private static void displayTasksForVisitor(String username) {
        System.out.println("Tasks assigned to " + username + ":");
        for (int i = 0; i < numTasks; i++) {
            if (tasks[i].getAssignee().equals(username)) {
                System.out.println(tasks[i].getDescription());
            }
        }
    }

    private static void performClientActions(Client client, Scanner sc) {
        while (true) {
            System.out.println("1. Add Task\n2. Logout");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addTask(client, sc);
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(String description, String assignee) {
      if (numTasks >= MAX_TASKS) {
        System.out.println("Maximum number of tasks reached.");
        return;
    }
        Task task = new Task(description, assignee);
        tasks[numTasks++] = task;
        System.out.println("Task added: " + description);
    }
}
