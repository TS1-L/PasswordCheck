import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        String Username = "MyPc";
        String Password = "pass123456";
        String info1, info2;
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        info1 = input.nextLine();
        System.out.print("Password: ");
        info2 = input.nextLine();

        if (info1.equals(Username) && info2.equals(Password)) {
            System.out.println("You are logged in!");
        }
        else if (info1.equals(Username) && !info2.equals(Password)) {
            System.out.println("Password is incorrect!");
            System.out.println("Do you want to create a new password?");
            System.out.println("Press 1 to Create a new password and 2 to Exit the program");
            String userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    System.out.print("Enter your new password: ");
                    String newPass = input.nextLine();
                    while (newPass.equals(Password)) {
                        System.out.print("Operation failed! Try again:");
                        newPass = input.nextLine();
                    }
                    System.out.println("Password has been created successfully!");
                    Password = newPass;
                    System.out.println("Do you want to log in?");
                    System.out.println("Press 1 to Log in and 2 to Exit the program");
                    userInput = input.nextLine();
                    switch (userInput) {
                        case "1":
                            System.out.print("Username: ");
                            info1 = input.nextLine();
                            System.out.print("Password: ");
                            info2 = input.nextLine();
                            if (info1.equals(Username) && info2.equals(Password)) {
                                System.out.println("You are logged in!");
                            }
                            else {
                                System.out.println("Password is incorrect! Run the program again!");
                                System.exit(0);
                            }
                    }
                    break;

                case "2":
                    System.out.println("Have a nice day!");
                    System.exit(0);

            }
        }



    }
}
