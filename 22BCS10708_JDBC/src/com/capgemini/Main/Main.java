package com.capgemini.Main;
import java.sql.SQLException;
import java.util.Scanner;
public class MainClass {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		// Connect to Database.
//		Connection con = null;
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuims_815","root","PHW#84#jeor");
//		System.out.println("Connection Established");
//		
//		System.out.println(con.getClass().getName());
		
		Scanner sc = new Scanner(System.in); // new - dynamic memory allocator.
//		ConnectionClass object = new ConnectionClass();
		OperationClass object = new OperationClass();
		while(true) {
		
			System.out.println("Enter 1 for insert a Record");
			System.out.println("Enter 2 for delete a Record");
			System.out.println("Enter 3 for update a Record");
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
			case 6:
				break;
			default:
				System.out.println("Invalid Input");
					
			}
		}
		
		
		
	}

}
