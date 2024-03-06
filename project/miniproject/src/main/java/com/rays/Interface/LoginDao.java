package com.rays.Interface;


public interface LoginDao {

	public boolean isAdmin(String username,String userpass );
	public boolean isEmployee(String username,String userpass);
}
