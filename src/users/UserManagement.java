package users;

public class UserManagement {

    static int counter = 0;
    static User[] users = new User[30];

    static void createUser() {

        Main.sc.nextLine();

        System.out.println("Enter new username: ");
        String name = Main.sc.nextLine();

        System.out.println("Enter new user ID: ");
        int id = Main.sc.nextInt();
        Main.sc.nextLine();

        System.out.println("Birthdate (yyyyMMdd): ");
        String birthdate = Main.sc.nextLine();

        users[counter] = new User(id, name, birthdate);
        counter++;

        if (counter >= users.length) {
            User[] users2 = new User[users.length * 2];
            for (int i = 0; i < users.length; i++) {
                users2[i] = users[i];
            }

            users = users2;
        }

        System.out.println("User registered");

    }

    static void readUserByID(int id) {
        for (int i = 0; i < counter; i++) {
            if (users[i].getId() == id) {
                System.out.println();
                System.out.println(users[i]);
                return;
            }
        }
        System.out.println("\nNo such user ID");
    }

    static void updateUser(int id) {
        for (int i = 0; i < counter; i++) {
            if (users[i].getId() == id) {
                System.out.println();
                System.out.println(users[i]);
                System.out.println("What is the new username?");
                String name = Main.sc.nextLine();
                users[i].setUsername(name);
                System.out.println("Username is updated");
                System.out.println(users[i]);
                return;

            }
        }
        System.out.println("\nNo such user ID");
    }

    public static void deleteUserById(int id) {
        for (int i = 0; i < counter; i++) {
            if ((users[i].getId()) == id) {
                System.out.println("\nUser " + users[i].getUsername() + " deleted");
                if (i == counter - 1) {
                    users[counter - 1] = null;
                    counter--;
                } else {
                    users[i] = users[counter - 1];
                    users[counter - 1] = null;
                    counter--;
                }
                return;
            }
        }
        System.out.println("\nNo such user ID");
    }

    public static void deleteUserByUsername(String username) {
        for (int i = 0; i < counter; i++) {
            if (users[i].getUsername().equalsIgnoreCase(username)) {
                System.out.println("\nUser with ID " + users[i].getId() + " deleted");
                if (i == counter - 1) {
                    users[counter - 1] = null;
                    counter--;
                } else {
                    users[i] = users[counter - 1];
                    users[counter - 1] = null;
                    counter--;
                }
                return;
            }
        }
        System.out.println("\nNo such username");
    }

}
