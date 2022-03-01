package curs2;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		String username = "test";
		String password = "123";
	
		
		System.out.println("Introdu username :");
		Scanner obiectscan = new Scanner(System.in);
		String user = obiectscan.next();
		System.out.println("Introdu Parola :");
		String pass = obiectscan.next();
	
		if (username.equals(user) && password.equals(pass) ) {
			System.out.println("Login Sucsessfull");
		}else {
			System.out.println("Usernam or password is wrong!");
		}
	}
	}

