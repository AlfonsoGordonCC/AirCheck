package com.sample;


public class Symptoms {
	boolean Shortness_breath;
	boolean Rapid_Breathing;
	boolean Wheezing;
	boolean Cyanosis;
	boolean Headache;
	boolean Confusion_Disorientation;
	boolean Irregular_heartbeat; 
	boolean Chest_pain;
	boolean Fatigue_Weakness; 
	boolean Dizziness;

	public Symptoms(boolean shortness_breath, boolean rapid_Breathing, boolean wheezing, boolean cyanosis,
			boolean headache, boolean confusion_Disorientation, boolean irregular_heartbeat, boolean chest_pain,
			boolean fatigue_Weakness, boolean dizziness) {
		Shortness_breath = shortness_breath;
		Rapid_Breathing = rapid_Breathing;
		Wheezing = wheezing;
		Cyanosis = cyanosis;
		Headache = headache;
		Confusion_Disorientation = confusion_Disorientation;
		Irregular_heartbeat = irregular_heartbeat;
		Chest_pain = chest_pain;
		Fatigue_Weakness = fatigue_Weakness;
		Dizziness = dizziness;
	}
	

	public boolean isShortness_breath() {
		return Shortness_breath;
	}

	public void setShortness_breath(boolean shortness_breath) {
		Shortness_breath = shortness_breath;
	}

	public boolean isRapid_Breathing() {
		return Rapid_Breathing;
	}

	public void setRapid_Breathing(boolean rapid_Breathing) {
		Rapid_Breathing = rapid_Breathing;
	}

	public boolean isWheezing() {
		return Wheezing;
	}

	public void setWheezing(boolean wheezing) {
		Wheezing = wheezing;
	}

	public boolean isCyanosis() {
		return Cyanosis;
	}

	public void setCyanosis(boolean cyanosis) {
		Cyanosis = cyanosis;
	}

	public boolean isHeadache() {
		return Headache;
	}


	public void setHeadache(boolean headache) {
		Headache = headache;
	}


	public boolean isConfusion_Disorientation() {
		return Confusion_Disorientation;
	}


	public void setConfusion_Disorientation(boolean confusion_Disorientation) {
		Confusion_Disorientation = confusion_Disorientation;
	}


	public boolean isIrregular_heartbeat() {
		return Irregular_heartbeat;
	}


	public void setIrregular_heartbeat(boolean irregular_heartbeat) {
		Irregular_heartbeat = irregular_heartbeat;
	}


	public boolean isChest_pain() {
		return Chest_pain;
	}


	public void setChest_pain(boolean chest_pain) {
		Chest_pain = chest_pain;
	}


	public boolean isFatigue_Weakness() {
		return Fatigue_Weakness;
	}


	public void setFatigue_Weakness(boolean fatigue_Weakness) {
		Fatigue_Weakness = fatigue_Weakness;
	}


	public boolean isDizziness() {
		return Dizziness;
	}


	public void setDizziness(boolean dizziness) {
		Dizziness = dizziness;
	}


	@Override
	public String toString() {
		return "Symptoms [Shortness_breath=" + Shortness_breath + ", Rapid_Breathing=" + Rapid_Breathing + ", Wheezing="
				+ Wheezing + ", Cyanosis=" + Cyanosis + ", Headache=" + Headache + ", Confusion_Disorientation="
				+ Confusion_Disorientation + ", Irregular_heartbeat=" + Irregular_heartbeat + ", Chest_pain="
				+ Chest_pain + ", Fatigue_Weakness=" + Fatigue_Weakness + ", Dizziness=" + Dizziness + "]";
	}
	
	
	
	
	
}
