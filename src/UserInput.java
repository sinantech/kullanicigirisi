import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String current_password = "patika";
        System.out.print("Welcome to Login Page Please enter a Username :  ");
        Scanner usernameinput = new Scanner(System.in);
        String username = usernameinput.next();
        System.out.print("Hi" + " " + username + " " +  "Please Enter a Password : ");
        Scanner input1 = new Scanner(System.in);
        String password = input1.next();
        if (password.equals(current_password)) {
            System.out.println("Welcome Aboard");
        }else {
            System.out.print("Password is Wrong Do Dou Set a New Password ? (Y or N)" + " ");
            Scanner input2 = new Scanner(System.in);
            String case1 = input2.next();
            switch (case1) {
                case "n" :
                    System.out.println("ITS CLOSED HAVE A NİCE DAY SİR ! ");
                    break;
                case "N" :
                    System.out.print("ITS CLOSED HAVE A NİCE DAY SİR ! ");
                    break;
                case "Y" :
                    System.out.println("The password you enter cannot be the same as the old password");
                    System.out.println("The password you enter cannot be the same as the wrong one");
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter a new password please ! : ");
                    String new_pass = input3.next();
                    if (new_pass.equals(current_password) || new_pass.equals(password)) {
                    System.out.print("New password cannot be the same the old password or the wrong password");
                    System.out.print("The password cannot be created");
                }   else {
                        System.out.println("The password created successfully ! ");
                        System.out.println("New password is : " + new_pass);
                        System.out.println("Please do not share your password with anybody ! ");
                    }
                    break;


            }
        }


    }
}
