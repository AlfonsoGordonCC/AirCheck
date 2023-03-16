package db.pojos;

import java.io.Serializable;
import java.util.List;


public class SymptomsPojo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name; 
	private List<DrugPojo> drugs; 
	private List<PatientPojo> patients;
	private List<DiseasePojo> disease ;
	
	

	public SymptomsPojo(Integer id, String name, List<DrugPojo> drugs, List<PatientPojo> patients,
			List<DiseasePojo> disease) {
		super();
		this.id = id;
		this.name = name;
		this.drugs = drugs;
		this.patients = patients;
		this.disease = disease;
	}

	public List<PatientPojo> getPatients() {
		return patients;
	}

	public void setPatients(List<PatientPojo> patients) {
		this.patients = patients;
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
		return "SymptomsPojo [id=" + id + ", name=" + name + ", drugs=" + drugs + ", patients=" + patients
				+ ", disease=" + disease + "]";
	}

}
