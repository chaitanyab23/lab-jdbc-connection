package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
	// Fill your code
		Connection con= null;
		
		con=ConnectionManager.getConnection();
		
		if (con!= null)
		{
			System.out.println("Connection Established");
		}
		else
		{
			System.out.println("Check Connection");
		}
	}
}
