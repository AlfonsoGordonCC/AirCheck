package db.pojos;

import java.io.Serializable;
import java.util.List;


public class SymptomsPojo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name; 
	private List<DrugPojo> drugs; 
	
	
	public SymptomsPojo() {
		this.name=name;
		this.drugs=drugs;
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
		return "Symptoms [id=" + id + ",name=" + name +"]"; 
	}
}
