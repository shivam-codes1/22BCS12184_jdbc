package com.capgemini.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		OperationClass object = new OperationClass();
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter 1 for insert a record:");
		System.out.println("Enter 2 for delete a record:");
		System.out.println("Enter 3 for update a record:");
		System.out.println("Enter 4 for display_one a record:");
		System.out.println("Enter 5 for display all records:");
		int reply = sc.nextInt();
		switch(reply) {
		case 1:
			object.insert_record();
			break;
		case 2:
			object.delete();
			break;
		case 3:
			object.update();
			break;
		case 4:
			object.display_one();
			break;
		case 5:
			object.display_All();
			break;
		default:
			System.out.println("Invalid Input");
		}}while(true);
		
		
	}

}