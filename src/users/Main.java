package users;



import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {

        while (loop) {
            menu();
        }

    }

    private static void menu() {
        System.out.println("1.Create");
        System.out.println("2.Remove");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("0.Exit");

        System.out.print("Make a choice:");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                UserManagement.createUser();
                break;
            case 2:
                System.out.print("What is the id of the student to be removed?");
                int id = Main.sc.nextInt();
                sc.nextLine();
                UserManagement.removeUserById(id);
                break;
            case 3:
                System.out.print("What is the id of the student to be updated?");
                id = Main.sc.nextInt();
                sc.nextLine();
                UserManagement.updateUser(id);
                break;
            case 4:
                System.out.print("What is the id of the student to be shown?");
                id = Main.sc.nextInt();
                sc.nextLine();
                UserManagement.deleteUserByID(id);
                break;
            case 0:
                loop=false;
                break;
        }
    }

}
