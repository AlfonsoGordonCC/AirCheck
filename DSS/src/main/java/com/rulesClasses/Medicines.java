package com.rulesClasses;

public class Medicines {
	

	float Beta_Blockers;
	float NSAIDs;
	float Opiods;
	float Statins;
	float Bronchodilators;
	float Stimulants;
	float Antidepressants; 
	float ACE_inhibitors;
	float Antipsychotics; 
	float Chemotherapy_drugs;
	float Antibiotics;
	float Antihistamines;
	float SSRIs;
	
	
	public Medicines() {
		super();
		this.Beta_Blockers = 0;
		this.NSAIDs = 0;
		this.Opiods = 0;
		this.Statins = 0;
		this.Bronchodilators = 0;
		this.Stimulants = 0;
		this.Antidepressants = 0;
		this.ACE_inhibitors = 0;
		this.Antipsychotics = 0;
		this.Chemotherapy_drugs = 0;
	}
/* Por si hace falta en algún momento
	public Medicines(float beta_Blockers, float nSAIDs, float opiods, float statins,
			float bronchodilators, float stimulants, float antidepressants, float aCE_inhibitors,
			float antipsychotics, float chemotherapy_drugs, float antibiotics,
			float antihistamines, float sSRIs) {
		super();
		Beta_Blockers = beta_Blockers;
		NSAIDs = nSAIDs;
		Opiods = opiods;
		Statins = statins;
		Bronchodilators = bronchodilators;
		Stimulants = stimulants;
		Antidepressants = antidepressants;
		ACE_inhibitors = aCE_inhibitors;
		Antipsychotics = antipsychotics;
		Chemotherapy_drugs = chemotherapy_drugs;
		Antibiotics = antibiotics;
		Antihistamines = antihistamines;
		SSRIs = sSRIs;
	}
	*/
	@Override
	public String toString() {
		return "Medicines [Beta_Blockers=" + Beta_Blockers + ", NSAIDs=" + NSAIDs + ", Opiods=" + Opiods + ", Statins="
				+ Statins + ", Bronchodilators=" + Bronchodilators + ", Stimulants=" + Stimulants + ", Antidepressants="
				+ Antidepressants + ", ACE_inhibitors=" + ACE_inhibitors + ", Antipsychotics=" + Antipsychotics
				+ ", Chemotherapy_drugs=" + Chemotherapy_drugs + ", Antibiotics=" + Antibiotics + ", Antihistamines="
				+ Antihistamines + ", SSRIs=" + SSRIs + "]";
	}

	
	public float isBeta_Blockers() {
		return Beta_Blockers;
	}

	public void setBeta_Blockers(float beta_Blockers) {
		Beta_Blockers = beta_Blockers;
	}

	public float isNSAIDs() {
		return NSAIDs;
	}

	public void setNSAIDs(float nSAIDs) {
		NSAIDs = nSAIDs;
	}

	public float isOpiods() {
		return Opiods;
	}

	public void setOpiods(float opiods) {
		Opiods = opiods;
	}

	public float isStatins() {
		return Statins;
	}

	public void setStatins(float statins) {
		Statins = statins;
	}

	public float isBronchodilators() {
		return Bronchodilators;
	}

	public void setBronchodilators(float bronchodilators) {
		Bronchodilators = bronchodilators;
	}

	public float isStimulants() {
		return Stimulants;
	}

	public void setStimulants(float stimulants) {
		Stimulants = stimulants;
	}

	public float isAntidepressants() {
		return Antidepressants;
	}

	public void setAntidepressants(float antidepressants) {
		Antidepressants = antidepressants;
	}

	public float isACE_inhibitors() {
		return ACE_inhibitors;
	}

	public void setACE_inhibitors(float aCE_inhibitors) {
		ACE_inhibitors = aCE_inhibitors;
	}

	public float isAntipsychotics() {
		return Antipsychotics;
	}

	public void setAntipsychotics(float antipsychotics) {
		Antipsychotics = antipsychotics;
	}

	public float isChemotherapy_drugs() {
		return Chemotherapy_drugs;
	}

	public void setChemotherapy_drugs(float chemotherapy_drugs) {
		Chemotherapy_drugs = chemotherapy_drugs;
	}

	public float isAntibiotics() {
		return Antibiotics;
	}

	public void setAntibiotics(float antibiotics) {
		Antibiotics = antibiotics;
	}

	public float isAntihistamines() {
		return Antihistamines;
	}

	public void setAntihistamines(float antihistamines) {
		Antihistamines = antihistamines;
	}

	public float isSSRIs() {
		return SSRIs;
	}

	public void setSSRIs(float sSRIs) {
		SSRIs = sSRIs;
	}
}
