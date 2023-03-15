package db.jdbc;

import java.sql.*;

import db.pojos.users.User;


public class DBManagerSQL implements db.interfaces.UserManager{

	public static Connection c;
	
	public void connect() {
		try {
			
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:./db/airCheck.db"); 
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			
			this.createTables();
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

	

	@Override
	public void disconnect() {
		
		try {
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void createTables() throws SQLException {
		
		Statement stmt1 = c.createStatement();
			String sql1 = "CREATE TABLE Users "
					 //  + "(id			INTEGER	PRIMARY KEY	AUTOINCREMENT, "
					   //+ " name			TEXT	NOT NULL	UNIQUE, " 
					   //+ " email	TEXT	NOT NULL   UNIQUE, "
					  // + " passsword	TEXT	NOT NULL)";
					;
			stmt1.executeUpdate(sql1);
			stmt1.close();
	}
	
	
	/*
	 * 
	public void newUser(User u);
	public User checkPassword(String email, String password);
	public Boolean checkEmail(String email);
	public void deleteUser(String mail, String password);
	public void updateUserMail(String newMail, String oldMail, String password);
	public void updateUserPassword(String mail, String newPassword, String oldPassword);
	void updateUserMailWithoutpass(String newMail, String oldMail);
	boolean updateUserPassword(String mail, String newPassword, String oldPassword, boolean ca);
}*/
	
	
	
	
	//A PARTIR DE AQUÍ SON LOS FUNCIONES DEL USER -> NO ES MEJOR HACER OTRA CLASE??
	

	@Override
	public void newUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User checkPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String mail, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserMail(String newMail, String oldMail, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserPassword(String mail, String newPassword, String oldPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserMailWithoutpass(String newMail, String oldMail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateUserPassword(String mail, String newPassword, String oldPassword, boolean ca) {
		// TODO Auto-generated method stub
		return false;
	}
		
	
	

}//DBManager

