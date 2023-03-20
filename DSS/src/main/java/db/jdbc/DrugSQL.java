package db.jdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import db.pojos.DiseasePojo;
import db.pojos.DrugPojo;
import db.pojos.SymptomsPojo;

public class DrugSQL {

	public void addDrug(DrugPojo drug) {
		try {

			String sql = "INSERT INTO Drugs (id, name)";
			sql+= " VALUES (?,?)";
			PreparedStatement pstmt = DBManagerSQL.c.prepareStatement(sql); 
			
			pstmt.setInt(1, drug.getId());
			pstmt.setString(2,drug.getName().toString());
			
			
			
			pstmt.executeUpdate();
			pstmt.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}//addDrug
	
	
	
	public List<DrugPojo> listDiseases(){
		
		List<DrugPojo> theDrugs = new ArrayList<DrugPojo>();
		
		try {	
					
				String sql = "SELECT * FROM Drugs "; 			
				PreparedStatement prep = DBManagerSQL.c.prepareStatement(sql);	
				ResultSet rs = prep.executeQuery();
				
			while (rs.next()) { 
				int id = rs.getInt("id");	
				String name = rs.getString("name");
		
				DrugPojo unDrug = new DrugPojo(id, name);
				
				theDrugs.addSymptom(unDrug);  //no entiendo
					
				}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		return theDrugs	;
		}//listSymptoms
		
		}
