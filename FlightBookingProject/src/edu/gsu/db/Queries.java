package edu.gsu.db;

public class Queries {
	
	public static final String LOGIN = "SELECT count(*) as num  FROM login_credentials WHERE username = ? AND password =?";

}