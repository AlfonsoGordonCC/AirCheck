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
	private Integer userId;
	
	private List<DiseasePojo> disease ; //as there's its brother List on Worker class, this conforms a many-to-many relationship 
	private List<DrugPojo> drugs; 
    
	
	 public PatientPojo(Integer id/*, List<Drug> drugs*/) {
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.userId = userId;
			
			this.drugs = new ArrayList<DrugPojo>();
		    this.disease = new ArrayList<DiseasePojo>();
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
			return "Patient [id=" + id + ",name=" + name + ", age="
					+ age + ", userId="+ userId + ", diseases="+ disease + ", drugs="+ drugs +"]"; 
		}
	
}
