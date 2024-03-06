package com.rays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rays.Interface.LoginDao;
import com.rays.utility.DBConnection;


public class LoginDaoImpl  implements LoginDao{
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int result;
	@Override
	public boolean isAdmin(String username, String userpass) {
		// TODO Auto-generated method stub
		try {
			conn=DBConnection.getConnection();
			sql="select adminemailid,adminpassword from admin where adminemailid=? and adminpassword=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, userpass);
			rs=ps.executeQuery();
			if(rs.next())
				return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean isEmployee(String username, String userpass) {
		// TODO Auto-generated method stub
		try {
			conn=DBConnection.getConnection();
			sql="select empemail,emppass from Employee where empemail=? and emppass=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, userpass);
			rs=ps.executeQuery();
			if(rs.next())
				return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
