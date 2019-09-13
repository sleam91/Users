package users;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {

        System.out.println("CRUD with arrays");

        while (loop) {
            menu();
        }

    }

    private static void menu() {
        System.out.println("\n1.Create User");
        System.out.println("2.Read User");
        System.out.println("3.Update User");
        System.out.println("4.Delete by ID");
        System.out.println("5.Delete by Username");
        System.out.println("0.Exit");

        System.out.print("Make a choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                UserManagement.createUser();
                break;
            case 2:
                System.out.print("What is the ID of the user to be shown? ");
                int id = Main.sc.nextInt();
                sc.nextLine();
                UserManagement.readUserByID(id);
                break;

            case 3:
                System.out.print("What is the ID of the user to be updated? ");
                id = Main.sc.nextInt();
                sc.nextLine();
                UserManagement.updateUser(id);
                break;
            case 4:
                System.out.print("What is the ID of the user to be removed? ");
                id = Main.sc.nextInt();
                sc.nextLine();
                UserManagement.deleteUserById(id);
                break;
            case 5:
                System.out.print("What is the username to be removed? ");
                sc.nextLine();
                String username = Main.sc.nextLine().trim();
                UserManagement.deleteUserByUsername(username);
                break;
            case 0:
                loop = false;
                break;
        }
    }

}
