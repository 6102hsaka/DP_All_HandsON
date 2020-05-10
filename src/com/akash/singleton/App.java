package com.akash.singleton;

public class App {

	public static void main(String[] args) {
		DBConn con = DBConn.getInstance();
		System.out.println(con);
	}

}
