package cheack_user_authenticated_or_not;

import java.util.Scanner;
import java.util.function.Predicate;

class UserObject extends User_Input_Constructor{

}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username: ");
        String userName=sc.next();
        System.out.println("Enter pwd: ");
        String pwd=sc.next();
        User u=new User(userName,pwd);
        Predicate<User> user= LanId->LanId.userName.equals("shafiul")&& LanId.pwd.equals("java");
        if (user.test(u)){
            System.out.println("Welcome you ar a valid");
        }
        else {
            System.out.println("Welcome you ar a invalid");

        }
    }
}
