package db.jdbc;

import java.sql.*;


import db.pojos.users.User;


public class DBManagerSQL implements db.interfaces.UserManager{

	public static Connection c;
	
	public void connect() {
		try {
			
			/*
			 * 
			Class.forName("org.sqlite.JDBC");
			String sqlURL= "jdbc:sqlite:RareDiseases.db"; // conexión base de datos
			
			 this.c=(DriverManager.getConnection(sqlURL)); //creamos la dirección de la URL de la conexión
			 this.c.createStatement().execute("PRAGMA foreign_keys=ON");//enables foreign keys
			 this.methods= new ResourcesSQL(this.c);
			 
			 Statement myStatement = this.c.createStatement();
	         ResultSet rs2;
	         */
			
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:.AirCheck.db"); // conexión base de datos
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
		
	try {
		
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
				   + " PRIMARY KEY (patient_id, disease_id) )";
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
				   + " PRIMARY KEY (symptom_id, drug_id) )";
		stmt7.executeUpdate(sql7);
		stmt7.close();
		
		
		
		
		
		Statement stmt8 = c.createStatement();
		String sql8 = "CREATE TABLE patient_symptom "
				   + "(patient_id	INTEGER	REFERENCES Patient(id), "
				   + " symptom_id	INTEGER	REFERENCES Symptoms(id), "
				   + " PRIMARY KEY (patient_id, symptom_id) )";
		stmt8.executeUpdate(sql8);
		stmt8.close();
		
		
		
		
		
		Statement stmt9 = c.createStatement();
		String sql9 = "CREATE TABLE symptom_disease "
				   + "(symptom_id	INTEGER	REFERENCES Symptoms(id), "
				   + " disease_id	INTEGER	REFERENCES Disease(id), "
				   + " PRIMARY KEY (symptom_id, disease_id) )";
		stmt9.executeUpdate(sql9);
		stmt9.close();
		
		
		
	}  catch (SQLException e) {
		if (!e.getMessage().contains("table already exists")) {
				e.printStackTrace();
			}
	}//catch
}//createTables



	
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

