import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Username");
        username = inp.nextLine();
        System.out.print("Password");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java")) {
            System.out.print("welcome aboard");
        } else {
            System.out.print("reset password*");

            String changedPassword;

            Scanner inp2 = new Scanner(System.in);
            changedPassword = inp2.nextLine();

            if (changedPassword.equals("no")) {

                System.out.println("goodday");
                return;
            } else if (!changedPassword.equals("yes")) {
                System.out.println("yanlış girdiniz");
                return;

            }
            System.out.println("enter new password");
            String pass;
            Scanner inp3 = new Scanner(System.in);
            pass = inp3.nextLine();

            if (pass.equals("java")) {
                System.out.println("passwords cannot be the same with old password");
            } else {
                System.out.println("password changed");
            }


        }
    }

}
