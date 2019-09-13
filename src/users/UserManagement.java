package users;

public class UserManagement {

    static int counter = 0;
    static User[] users = new User[30];

    static void createUser() {
        System.out.println("User ID: ");
        int id = Main.sc.nextInt();
        Main.sc.nextLine();

        System.out.println("Username: ");
        String name = Main.sc.nextLine();

        System.out.println("Birthdate (dd-MM-yyyy): ");
        String birthday = Main.sc.nextLine();

        User s = new User(id, name, birthday);
        s.toString();

        users[counter] = new User(id, name, birthday);
        counter++;

        if (counter >= users.length) {
            User[] users2 = new User[users.length * 2];
            for (int i = 0; i < users.length; i++) {
                users2[i] = users[i];
            }

            users = users2;
        }

    }

    static void readUserByID(int id) {
        for (int i = 0; i < counter; i++) {
            if (users[i].getId() == id) {
                System.out.println(users[i]);
                return;
            }
        }
        System.out.println("No such user ID");
    }

    static void updateUser(int id) {
        for (int i = 0; i < counter; i++) {
            if (users[i].getId() == id) {
                System.out.println(users[i]);
                System.out.println("What is the new username?");
                String name = Main.sc.nextLine();
                users[i].setUsername(name);
                System.out.println("Username is updated");
                System.out.println(users[i]);
                return;

            }
        }
        System.out.println("No such user ID");
    }

    public static void deleteUserById(int id) {
        for (int i = 0; i < counter; i++) {
            if ((users[i].getId()) == id) {
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
        System.out.println("No such user ID");
    }

}
