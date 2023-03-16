package db.pojos;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;



public class PatientPojo implements Serializable { //Serializable is used to have things exist outside memory (in the computer)

	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name; //for easy access when still do not have a "barcode reader"
	private Gender gender;
	private Integer age;
	private List<DiseasePojo> disease ; //as there's its brother List on Worker class, this conforms a many-to-many relationship 
	private List<DrugPojo> drugs; 
	private List<SymptomsPojo> symptoms ;
    
	

	 public PatientPojo(Integer id, String name, Gender gender, Integer age, List<DiseasePojo> disease,
			List<DrugPojo> drugs, List<SymptomsPojo> symptoms) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.disease = disease;
		this.drugs = drugs;
		this.symptoms = symptoms;
	}

	public List<SymptomsPojo> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<SymptomsPojo> symptoms) {
		this.symptoms = symptoms;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<DiseasePojo> getDisease() {
		return disease;
	}

	public void setDisease(List<DiseasePojo> disease) {
		this.disease = disease;
	}

	public List<DrugPojo> getDrugs() {
		return drugs;
	}

	public void setDrugs(List<DrugPojo> drugs) {
		this.drugs = drugs;
	}

	@Override
	public String toString() {
		return "PatientPojo [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", disease="
				+ disease + ", drugs=" + drugs + ", symptoms=" + symptoms + "]";
	}

}
