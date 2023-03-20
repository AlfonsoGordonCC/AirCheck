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
			
			System.out.print("Conexion creada");
			this.createTables();
			
		} catch (SQLException sqlE) {
			sqlE.printStackTrace();
			System.out.print("Conexion NO creada");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("Conexion NO creada");
			
			
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
		String sql1 = "CREATE TABLE Patient "
					   + "(id		INTEGER		PRIMARY		KEY	AUTOINCREMENT,"
					   + " name		TEXT		NOT NULL," 
					   + " gender 	ENUM		NOT NULL,"
					   + " age		INTEGER		NOT NULL,"
					   + " userId	INTEGER		NOT NULL	UNIQUE)";
					  
			stmt1.executeUpdate(sql1);
			stmt1.close();

	
	
		Statement stmt2 = c.createStatement();
		String sql2 = "CREATE TABLE Disease "
				   + "(id			INTEGER		PRIMARY		KEY	AUTOINCREMENT,"
				   + " name			TEXT		NOT NULL," 
				   + " basicInfo	TEXT		NOT NULL," 
				   + " link			TEXT		NOT NULL," 
				   + " scoreMax		INTEGER)";
				  
		stmt2.executeUpdate(sql2);
		stmt2.close();
		
		
		
		
		Statement stmt3 = c.createStatement();
		String sql3 = "CREATE TABLE Symptoms "
				   + "(id			INTEGER		PRIMARY		KEY	AUTOINCREMENT,"
				   + " name			TEXT		NOT NULL)";
				  
		stmt3.executeUpdate(sql3);
		stmt3.close();
		
		
		
		
		
		Statement stmt4 = c.createStatement();
		String sql4 = "CREATE TABLE Drugs "
				   + "(id			INTEGER		PRIMARY		KEY	AUTOINCREMENT,"
				   + " name			TEXT		NOT NULL)";
				  
		stmt4.executeUpdate(sql4);
		stmt4.close();
		
		
		
	
		
		Statement stmt5 = c.createStatement();
		String sql5 = "CREATE TABLE patient_disease "
				   + "(patient_id	INTEGER	REFERENCES Patient(id), "
				   + " disease_id	INTEGER	REFERENCES Disease(id), "
				   + " PRIMARY KEY (patient_id, animal_id) )";
		stmt5.executeUpdate(sql5);
		stmt5.close();
		
		
		
		
		
		Statement stmt6 = c.createStatement();
		String sql6 = "CREATE TABLE patient_drug "
				   + "(patient_id	INTEGER	REFERENCES Patient(id), "
				   + " drug_id	INTEGER	REFERENCES Drugs(id), "
				   + " PRIMARY KEY (patient_id, drug_id) )";
		stmt6.executeUpdate(sql6);
		stmt6.close();
		
		
		
		
		
		Statement stmt7 = c.createStatement();
		String sql7 = "CREATE TABLE symptom_drug "
				   + "(symptom_id	INTEGER	REFERENCES Symptoms(id), "
				   + " drug_id	INTEGER	REFERENCES Drugs(id), "
				   + " PRIMARY KEY (patient_id, drug_id) )";
		stmt7.executeUpdate(sql7);
		stmt7.close();
	}



	
	
	
	
	
	
	
	
	//OTHERS
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

