package db.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.pojos.*;

public class SymptomsSQL {

	public void addSymptom(SymptomsPojo symptom) {
	
		
		try {

			String sql = "INSERT INTO Symptoms (id, name)";
			sql+= " VALUES (?,?)";
			PreparedStatement pstmt = DBManagerSQL.c.prepareStatement(sql); 
			
			pstmt.setInt(1, symptom.getId());
			pstmt.setString(2,symptom.getName().toString());
			
			
			pstmt.executeUpdate();
			pstmt.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}//addPatient
	
	
	public List<SymptomsPojo> listSymptoms() { //we show all the animals in the database
		List<SymptomsPojo> theSymptoms = new ArrayList<SymptomsPojo>();
		
		try {	
			
			String sql = "SELECT * FROM Symptoms "; 			
			PreparedStatement prep = DBManagerSQL.c.prepareStatement(sql);	
			ResultSet rs = prep.executeQuery();
		
		while (rs.next()) { 
			int id = rs.getInt("id");	
			String name = rs.getString("name");
			
			SymptomsPojo unSymptom = new SymptomsPojo(name, id);
			
			theSymptoms.addSymptom(unSymptom); //no entiendo esto
			
			
			}

		prep.close();
		rs.close();
		
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		return theSymptoms	;
	}//listSymptoms
	
}
