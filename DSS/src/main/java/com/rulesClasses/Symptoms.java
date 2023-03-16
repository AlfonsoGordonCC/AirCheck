package com.rulesClasses;


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
	boolean Fainting_or_loss_of_consciousness;
	boolean Excessive_daytime_sleepiness;
	boolean Difficulty_concentrating;
	boolean Irritability;
	boolean Depression;
	boolean Anxiety;
	boolean Restless_sleep;
	boolean Insomnia;
	boolean Dry_mouth_or_sore_throat;
	boolean Chest_oppression_discomfort;
	boolean Muscle_or_body_pain;
	boolean Cough;
	boolean Cough_blood;
	boolean Cough_worse_over_time;
	boolean Difficulty_physical_activities;
	boolean Loss_appetite_weight;
	boolean Hoarseness;
	boolean Trouble_swallowing;
	boolean Fever_chills;
	boolean Loss_taste_smell;
	boolean Congestion_or_running_nose;
	boolean Nausea_vomiting;
	boolean Inflammation_respiratory_tract;
	boolean Sweating;
	boolean Mucus;
	boolean Expectoration;
	boolean Stridor;
	boolean Tachycardia;
	boolean Hyperthermia;
	boolean Loss_negative_pressure;
	boolean Sneezing;
	boolean Chronic_cough;

	// deberia ser un enum
	public Symptoms(String symptom) {
		
	}
	
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

	public Symptoms(boolean shortness_breath, boolean rapid_Breathing, boolean wheezing, boolean cyanosis,
			boolean headache, boolean confusion_Disorientation, boolean irregular_heartbeat, boolean chest_pain,
			boolean fatigue_Weakness, boolean dizziness, boolean fainting_or_loss_of_consciousness,
			boolean excessive_daytime_sleepiness, boolean difficulty_concentrating, boolean irritability,
			boolean depression, boolean anxiety, boolean restless_sleep, boolean insomnia,
			boolean dry_mouth_or_sore_throat, boolean chest_oppression_discomfort, boolean muscle_or_body_pain,
			boolean cough, boolean cough_blood, boolean cough_worse_over_time, boolean difficulty_physical_activities,
			boolean loss_appetite_weight, boolean hoarseness, boolean trouble_swallowing, boolean fever_chills,
			boolean loss_taste_smell, boolean congestion_or_running_nose, boolean nausea_vomiting,
			boolean inflammation_respiratory_tract, boolean sweating, boolean mucus, boolean expectoration,
			boolean stridor, boolean tachycardia, boolean hyperthermia, boolean loss_negative_pressure,
			boolean sneezing, boolean chronic_cough) {
		super();
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
		Fainting_or_loss_of_consciousness = fainting_or_loss_of_consciousness;
		Excessive_daytime_sleepiness = excessive_daytime_sleepiness;
		Difficulty_concentrating = difficulty_concentrating;
		Irritability = irritability;
		Depression = depression;
		Anxiety = anxiety;
		Restless_sleep = restless_sleep;
		Insomnia = insomnia;
		Dry_mouth_or_sore_throat = dry_mouth_or_sore_throat;
		Chest_oppression_discomfort = chest_oppression_discomfort;
		Muscle_or_body_pain = muscle_or_body_pain;
		Cough = cough;
		Cough_blood = cough_blood;
		Cough_worse_over_time = cough_worse_over_time;
		Difficulty_physical_activities = difficulty_physical_activities;
		Loss_appetite_weight = loss_appetite_weight;
		Hoarseness = hoarseness;
		Trouble_swallowing = trouble_swallowing;
		Fever_chills = fever_chills;
		Loss_taste_smell = loss_taste_smell;
		Congestion_or_running_nose = congestion_or_running_nose;
		Nausea_vomiting = nausea_vomiting;
		Inflammation_respiratory_tract = inflammation_respiratory_tract;
		Sweating = sweating;
		Mucus = mucus;
		Expectoration = expectoration;
		Stridor = stridor;
		Tachycardia = tachycardia;
		Hyperthermia = hyperthermia;
		Loss_negative_pressure = loss_negative_pressure;
		Sneezing = sneezing;
		Chronic_cough = chronic_cough;
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

	public boolean isFainting_or_loss_of_consciousness() {
		return Fainting_or_loss_of_consciousness;
	}

	public void setFainting_or_loss_of_consciousness(boolean fainting_or_loss_of_consciousness) {
		Fainting_or_loss_of_consciousness = fainting_or_loss_of_consciousness;
	}

	public boolean isExcessive_daytime_sleepiness() {
		return Excessive_daytime_sleepiness;
	}

	public void setExcessive_daytime_sleepiness(boolean excessive_daytime_sleepiness) {
		Excessive_daytime_sleepiness = excessive_daytime_sleepiness;
	}

	public boolean isDifficulty_concentrating() {
		return Difficulty_concentrating;
	}

	public void setDifficulty_concentrating(boolean difficulty_concentrating) {
		Difficulty_concentrating = difficulty_concentrating;
	}

	public boolean isIrritability() {
		return Irritability;
	}

	public void setIrritability(boolean irritability) {
		Irritability = irritability;
	}

	public boolean isDepression() {
		return Depression;
	}

	public void setDepression(boolean depression) {
		Depression = depression;
	}

	public boolean isAnxiety() {
		return Anxiety;
	}

	public void setAnxiety(boolean anxiety) {
		Anxiety = anxiety;
	}

	public boolean isRestless_sleep() {
		return Restless_sleep;
	}

	public void setRestless_sleep(boolean restless_sleep) {
		Restless_sleep = restless_sleep;
	}

	public boolean isInsomnia() {
		return Insomnia;
	}

	public void setInsomnia(boolean insomnia) {
		Insomnia = insomnia;
	}

	public boolean isDry_mouth_or_sore_throat() {
		return Dry_mouth_or_sore_throat;
	}

	public void setDry_mouth_or_sore_throat(boolean dry_mouth_or_sore_throat) {
		Dry_mouth_or_sore_throat = dry_mouth_or_sore_throat;
	}

	public boolean isChest_oppression_discomfort() {
		return Chest_oppression_discomfort;
	}

	public void setChest_oppression_discomfort(boolean chest_oppression_discomfort) {
		Chest_oppression_discomfort = chest_oppression_discomfort;
	}

	public boolean isMuscle_or_body_pain() {
		return Muscle_or_body_pain;
	}

	public void setMuscle_or_body_pain(boolean muscle_or_body_pain) {
		Muscle_or_body_pain = muscle_or_body_pain;
	}

	public boolean isCough() {
		return Cough;
	}

	public void setCough(boolean cough) {
		Cough = cough;
	}

	public boolean isCough_blood() {
		return Cough_blood;
	}

	public void setCough_blood(boolean cough_blood) {
		Cough_blood = cough_blood;
	}

	public boolean isCough_worse_over_time() {
		return Cough_worse_over_time;
	}

	public void setCough_worse_over_time(boolean cough_worse_over_time) {
		Cough_worse_over_time = cough_worse_over_time;
	}

	public boolean isDifficulty_physical_activities() {
		return Difficulty_physical_activities;
	}

	public void setDifficulty_physical_activities(boolean difficulty_physical_activities) {
		Difficulty_physical_activities = difficulty_physical_activities;
	}

	public boolean isLoss_appetite_weight() {
		return Loss_appetite_weight;
	}

	public void setLoss_appetite_weight(boolean loss_appetite_weight) {
		Loss_appetite_weight = loss_appetite_weight;
	}

	public boolean isHoarseness() {
		return Hoarseness;
	}

	public void setHoarseness(boolean hoarseness) {
		Hoarseness = hoarseness;
	}

	public boolean isTrouble_swallowing() {
		return Trouble_swallowing;
	}

	public void setTrouble_swallowing(boolean trouble_swallowing) {
		Trouble_swallowing = trouble_swallowing;
	}

	public boolean isFever_chills() {
		return Fever_chills;
	}

	public void setFever_chills(boolean fever_chills) {
		Fever_chills = fever_chills;
	}

	public boolean isLoss_taste_smell() {
		return Loss_taste_smell;
	}

	public void setLoss_taste_smell(boolean loss_taste_smell) {
		Loss_taste_smell = loss_taste_smell;
	}

	public boolean isCongestion_or_running_nose() {
		return Congestion_or_running_nose;
	}

	public void setCongestion_or_running_nose(boolean congestion_or_running_nose) {
		Congestion_or_running_nose = congestion_or_running_nose;
	}

	public boolean isNausea_vomiting() {
		return Nausea_vomiting;
	}

	public void setNausea_vomiting(boolean nausea_vomiting) {
		Nausea_vomiting = nausea_vomiting;
	}

	public boolean isInflammation_respiratory_tract() {
		return Inflammation_respiratory_tract;
	}

	public void setInflammation_respiratory_tract(boolean inflammation_respiratory_tract) {
		Inflammation_respiratory_tract = inflammation_respiratory_tract;
	}

	public boolean isSweating() {
		return Sweating;
	}

	public void setSweating(boolean sweating) {
		Sweating = sweating;
	}

	public boolean isMucus() {
		return Mucus;
	}

	public void setMucus(boolean mucus) {
		Mucus = mucus;
	}

	public boolean isExpectoration() {
		return Expectoration;
	}

	public void setExpectoration(boolean expectoration) {
		Expectoration = expectoration;
	}

	public boolean isStridor() {
		return Stridor;
	}

	public void setStridor(boolean stridor) {
		Stridor = stridor;
	}

	public boolean isTachycardia() {
		return Tachycardia;
	}

	public void setTachycardia(boolean tachycardia) {
		Tachycardia = tachycardia;
	}

	public boolean isHyperthermia() {
		return Hyperthermia;
	}

	public void setHyperthermia(boolean hyperthermia) {
		Hyperthermia = hyperthermia;
	}

	public boolean isLoss_negative_pressure() {
		return Loss_negative_pressure;
	}

	public void setLoss_negative_pressure(boolean loss_negative_pressure) {
		Loss_negative_pressure = loss_negative_pressure;
	}

	public boolean isSneezing() {
		return Sneezing;
	}

	public void setSneezing(boolean sneezing) {
		Sneezing = sneezing;
	}

	public boolean isChronic_cough() {
		return Chronic_cough;
	}

	public void setChronic_cough(boolean chronic_cough) {
		Chronic_cough = chronic_cough;
	}
	
	
	
	
	
}
