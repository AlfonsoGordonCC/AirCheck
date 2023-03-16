package db.pojos;

import java.io.Serializable;
import java.util.List;
import db.pojos.*;

public class DrugPojo implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name; 
	
	private List<SymptomsPojo> symptoms ; //as there's its brother List on Worker class, this conforms a many-to-many relationship 
	private List<DrugPojo> drugs; 
	
	
	public DrugPojo() {
		this.name=name;
		this.symptoms=symptoms;
		this.drugs=drugs;
	}

	
	public List<SymptomsPojo> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<SymptomsPojo> symptoms) {
		this.symptoms = symptoms;
	}

	public List<DrugPojo> getDrugs() {
		return drugs;
	}

	public void setDrugs(List<DrugPojo> drugs) {
		this.drugs = drugs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Symptoms [id=" + id + ",name=" + name +  ",symptoms=" + symptoms +  ",drugs=" + drugs +"]"; 
	}
}
