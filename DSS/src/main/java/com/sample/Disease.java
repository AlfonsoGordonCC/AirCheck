package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Disease {
		
		int Hypoxemia;
		int Apnea;
		int Hyperapnea;
		int Tachypnea;
		int Dysnea;
		int Respiratory_Insufficiency;	
		int Lung_cancer;
		int COVID;
		int Asthma;
		int Emphysema;
		int Bronchitis_Chronic;
		int Atelactasis;
		int Pneumothorax;
		int Pneumonia;
		int Malignant_Pleura_Effusion;
		int Pulmonary_Embolism;
		int Cold;
		int Flu;
		boolean working = true;
		
		public Disease() {
			super();
			this.Hypoxemia = 0;
			this.Apnea = 0;
			this.Hyperapnea = 0;
			this.Tachypnea = 0;
			this.Dysnea = 0;
			this.Respiratory_Insufficiency = 0;
			this.Lung_cancer = 0;
			this.COVID = 0;
			this.Asthma = 0;
			this.Emphysema = 0;
			this.Bronchitis_Chronic = 0;
			this.Atelactasis = 0;
			this.Pneumothorax = 0;
			this.Pneumonia = 0;
			this.Malignant_Pleura_Effusion = 0;
			this.Pulmonary_Embolism = 0;
			this.Cold = 0;
			this.Flu = 0;
		}

	

		public int getHypoxemia() {
			return Hypoxemia;
		}

		public void setHypoxemia(int hypoxemia) {
			Hypoxemia = hypoxemia;
		}

		public int getApnea() {
			return Apnea;
		}

		public void setApnea(int apnea) {
			Apnea = apnea;
		}

		public int getHyperapnea() {
			return Hyperapnea;
		}

		public void setHyperapnea(int hyperapnea) {
			Hyperapnea = hyperapnea;
		}

		public int getTachypnea() {
			return Tachypnea;
		}

		public void setTachypnea(int tachypnea) {
			Tachypnea = tachypnea;
		}

		public int getDysnea() {
			return Dysnea;
		}

		public void setDysnea(int dysnea) {
			Dysnea = dysnea;
		}

		public int getRespiratory_Insufficiency() {
			return Respiratory_Insufficiency;
		}

		public void setRespiratory_Insufficiency(int respiratory_Insufficiency) {
			Respiratory_Insufficiency = respiratory_Insufficiency;
		}

		public int getLung_cancer() {
			return Lung_cancer;
		}

		public void setLung_cancer(int lung_cancer) {
			Lung_cancer = lung_cancer;
		}

		public int getCOVID() {
			return COVID;
		}

		public void setCOVID(int cOVID) {
			COVID = cOVID;
		}

		public int getAsthma() {
			return Asthma;
		}

		public void setAsthma(int asthma) {
			Asthma = asthma;
		}

		public int getEmphysema() {
			return Emphysema;
		}

		public void setEmphysema(int emphysema) {
			Emphysema = emphysema;
		}

		public int getBronchitis_Chronic() {
			return Bronchitis_Chronic;
		}

		public void setBronchitis_Chronic(int bronchitis_Chronic) {
			Bronchitis_Chronic = bronchitis_Chronic;
		}

		public int getAtelactasis() {
			return Atelactasis;
		}

		public void setAtelactasis(int atelactasis) {
			Atelactasis = atelactasis;
		}

		public int getPneumothorax() {
			return Pneumothorax;
		}

		public void setPneumothorax(int pneumothorax) {
			Pneumothorax = pneumothorax;
		}

		public int getPneumonia() {
			return Pneumonia;
		}

		public void setPneumonia(int pneumonia) {
			Pneumonia = pneumonia;
		}

		public int getMalignant_Pleura_Effusion() {
			return Malignant_Pleura_Effusion;
		}

		public void setMalignant_Pleura_Effusion(int malignant_Pleura_Effusion) {
			Malignant_Pleura_Effusion = malignant_Pleura_Effusion;
		}

		public int getPulmonary_Embolism() {
			return Pulmonary_Embolism;
		}

		public void setPulmonary_Embolism(int pulmonary_Embolism) {
			Pulmonary_Embolism = pulmonary_Embolism;
		}

		public int getCold() {
			return Cold;
		}

		public void setCold(int cold) {
			Cold = cold;
		}

		public int getFlu() {
			return Flu;
		}

		public void setFlu(int flu) {
			Flu = flu;
		}


		@Override
		public String toString() {
			return "Disease [Hypoxemia=" + Hypoxemia + ", Apnea=" + Apnea + ", Hyperapnea=" + Hyperapnea
					+ ", Tachypnea=" + Tachypnea + ", Dysnea=" + Dysnea + ", Respiratory_Insufficiency="
					+ Respiratory_Insufficiency + ", Lung_cancer=" + Lung_cancer + ", COVID=" + COVID + ", Asthma="
					+ Asthma + ", Emphysema=" + Emphysema + ", Bronchitis_Chronic=" + Bronchitis_Chronic
					+ ", Atelactasis=" + Atelactasis + ", Pneumothorax=" + Pneumothorax + ", Pneumonia=" + Pneumonia
					+ ", Malignant_Pleura_Effusion=" + Malignant_Pleura_Effusion + ", Pulmonary_Embolism="
					+ Pulmonary_Embolism + ", Cold=" + Cold + ", Flu=" + Flu + "]";
		}
		
		
		
	}
	

