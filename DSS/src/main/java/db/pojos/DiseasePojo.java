package db.pojos;

import java.io.Serializable;
import java.util.List;
import db.pojos.*;

public class DiseasePojo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name; 
	private String basicInfo;
	private String link;
	private Integer score;
	private List<PatientPojo> patient ;//as there's its brother List on Worker class, this conforms a many-to-many relationship 
	private List<SymptomsPojo> symptoms ;
	

	public DiseasePojo(Integer id, String name, String basicInfo, String link, Integer score, List<PatientPojo> patient,
			List<SymptomsPojo> symptoms) {
		super();
		this.id = id;
		this.name = name;
		this.basicInfo = basicInfo;
		this.link = link;
		this.score = score;
		this.patient = patient;
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



	public String getBasicInfo() {
		return basicInfo;
	}



	public void setBasicInfo(String basicInfo) {
		this.basicInfo = basicInfo;
	}



	public String getLink() {
		return link;
	}



	public void setLink(String link) {
		this.link = link;
	}



	public Integer getScore() {
		return score;
	}



	public void setScore(Integer score) {
		this.score = score;
	}
	
	
	public List<PatientPojo> getPatient() {
		return patient;
	}



	public void setPatient(List<PatientPojo> patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "DiseasePojo [id=" + id + ", name=" + name + ", basicInfo=" + basicInfo + ", link=" + link + ", score="
				+ score + ", patient=" + patient + ", symptoms=" + symptoms + "]";
	}


}
