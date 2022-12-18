package Class12_String;

import java.util.Scanner;

public class Task1Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        String confirmedPassword = "Hello123";
        System.out.println("Please enter the username?");
        String username = input.next();
        System.out.println("Please enter the password?");
        String password = input.next();

        if(username.isEmpty() || password.isEmpty()){
            System.out.println("Username can't be empty");
        }else{
            if(password.length()<8){
                System.out.println("Password is too short");

            }else {
                if (password.contains(username)) {
                    System.out.println("Password cannot contain username");
                } else {
                    if (password.equals(confirmedPassword)) {
                        System.out.println("Passwords do not match");
                    } else {
                        System.out.println("Your username and password has been created");
                    }
                }
            }}}}
        
