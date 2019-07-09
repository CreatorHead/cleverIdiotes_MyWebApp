package com.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dev.beans.User;

public class JDBCImpl implements UserDAO {

	@Override
	public Boolean createProfile(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePassword(Integer userId, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(Integer userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(Integer userId, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/cleveridiots_db";
			con = DriverManager.getConnection(dbUrl,"root","root");
			String sql = "select * from users_info "
					+ "	where user_id=? and password = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()){
				user = new User();
				user.setUserId(rs.getInt("user_id"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setPassword(rs.getString("password"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(pstmt != null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		return user;
	}

}
