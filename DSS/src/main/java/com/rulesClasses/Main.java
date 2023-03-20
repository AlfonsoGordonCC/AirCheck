package com.rulesClasses;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//comentao
import org.kie.api.KieServices;
import org.kie.api.runtime.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import db.interfaces.*;
import db.jdbc.*;
import db.pojos.*;


public class Main {
	private static UserManager dbMan = new DBManagerSQL();
	//private static UserManager userMan = (UserManager) new User(); //Alfonso? Revisa esto porfi
	
	
	public static void main(String[] args) throws Exception, IOException{
	//	dbMan.connect();
	//	userMan.connect();
		
		SymptomsPojo sim1 = new SymptomsPojo("shortness_breath", 1);
		SymptomsPojo sim2 = new SymptomsPojo("rapid_Breathing", 2);
		SymptomsPojo sim3 = new SymptomsPojo("wheezing", 3);
		SymptomsPojo sim4 = new SymptomsPojo("cyanosis", 4);
		SymptomsPojo sim5 = new SymptomsPojo("shortness_breath", 5);
		
		
		DiseasePojo hypox = new DiseasePojo("Hypoxemia",(float) 23);
		DiseasePojo apnea = new DiseasePojo("Apnea",(float) 21);
		DiseasePojo hyperapnea = new DiseasePojo("Hyperapnea",(float) 16);
		DiseasePojo tachyp = new DiseasePojo("Tachypnea", (float) 23);
		DiseasePojo dys= new DiseasePojo("Dysnea", (float) 19);
		
		DrugPojo aBetablockers = new DrugPojo("Betablockers");
		DrugPojo aNSAIDs = new DrugPojo("NSAIDs");
		DrugPojo aOpiods = new DrugPojo("Opiods");
		DrugPojo aStatins = new DrugPojo("Statins");
		
		
		List<SymptomsPojo> listaS = new ArrayList<SymptomsPojo>();
		listaS.add(sim1);
		listaS.add(sim2);
		listaS.add(sim3);
		listaS.add(sim4);
		listaS.add(sim5);
		
		
		List<DiseasePojo> listaD = new ArrayList<DiseasePojo>();
		listaD.add(hypox);
		listaD.add(apnea);
		listaD.add(hyperapnea);
		listaD.add(tachyp);
		listaD.add(dys);
		
		List<DrugPojo> listaDr = new ArrayList<DrugPojo>();
		listaDr.add(aBetablockers);
		listaDr.add(aNSAIDs);
		listaDr.add(aOpiods);
		listaDr.add(aStatins);
		
		
		List<PatientPojo> listaP = new ArrayList<PatientPojo>();
		
		PatientPojo pat1= new PatientPojo("Jose Alberto",listaD,listaDr,listaS);

		
		
		/*boolean shortness_breath = false,  rapid_Breathing= true,  wheezing= false,  cyanosis= false,
		 headache= false,  confusion_Disorientation= true,  irregular_heartbeat= false,  chest_pain= false,
		 fatigue_Weakness= false, dizziness= true;
		
		Disease dis1 = new Disease();
		
		Symptoms sym1 = new Symptoms(shortness_breath, rapid_Breathing, wheezing, cyanosis, headache, 
				confusion_Disorientation, irregular_heartbeat, chest_pain, fatigue_Weakness, dizziness);
        System.out.println(dis1);
        System.out.println(sym1);
        */
        
        //Hellou
        
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();

        KieSession ksession = kc.newKieSession("ksession-rules"); //Nombre en kmodule.xml --> rules


        // Once the session is created, the application can interact with it
        // To set up a ThreadedFileLogger, so that the audit view reflects events whilst debugging,
        // uncomment the next line
        // KieRuntimeLogger logger = ks.getLoggers().newThreadedFileLogger( ksession, "./helloworld", 1000 );
        // The application can insert facts into the session
        System.out.println(pat1);
        
        
        System.out.println("\n\n\n\n");


        ksession.insert(pat1);
       
       
        // and fire the rules
        ksession.fireAllRules();
        

        // AFTER Triggering the rules, the attribute authorized of some operations have been modified
        System.out.println(pat1);
   

        // and then dispose the session
        ksession.dispose();
        
        
     
    	final SymptomsPojo Rapid_Breathing = new SymptomsPojo(2,"rapid_breathing", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Wheezing = new SymptomsPojo(3,"wheezing", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Cyanosis = new SymptomsPojo(4,"cyanosis", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Headache = new SymptomsPojo(5,"headache", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Confusion_Disorientation = new SymptomsPojo(6,"confusion_disorientation", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Irregular_heartbeat = new SymptomsPojo(7,"irregular_heartbeat", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Chest_pain = new SymptomsPojo(8,"chest_pain", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Fatigue_Weakness = new SymptomsPojo(9,"fatigue_weakness", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Dizziness = new SymptomsPojo(10,"dizziness", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Fainting_or_loss_of_consciousness = new SymptomsPojo(11,"fainting_or_loss_of_consciousness", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Excessive_daytime_sleepiness = new SymptomsPojo(12,"excessive_daytime_sleepiness", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Difficulty_concentrating = new SymptomsPojo(13,"difficulty_concentrating", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Irritability = new SymptomsPojo(14,"irritability", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Depression = new SymptomsPojo(15,"depression", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Anxiety = new SymptomsPojo(16,"anxiety", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Restless_sleep = new SymptomsPojo(17,"restless_sleep", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Insomnia = new SymptomsPojo(18,"insomnia", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Dry_mouth_or_sore_throat = new SymptomsPojo(19,"dry_mouth_or_sore_throat", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Chest_oppression_discomfort = new SymptomsPojo(20,"chest_oppression_discomfort", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Muscle_or_body_pain = new SymptomsPojo(21,"muscle_or_body_pain", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Cough = new SymptomsPojo(22,"cough", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Cough_blood = new SymptomsPojo(23,"cough_blood", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Cough_worse_over_time = new SymptomsPojo(24,"cough_worse_over_time", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Difficulty_physical_activities = new SymptomsPojo(25,"difficulty_physical_activities", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Loss_appetite_weight = new SymptomsPojo(26,"loss_appetite_weight", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Hoarseness = new SymptomsPojo(27,"hoarseness", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Trouble_swallowing = new SymptomsPojo(28,"trouble_swallowing", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Fever_chills = new SymptomsPojo(29,"fever_chills", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Loss_taste_smell = new SymptomsPojo(30,"loss_taste_smell", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Congestion_or_running_nose = new SymptomsPojo(31,"congestion_or_running_nose", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Nausea_vomiting = new SymptomsPojo(32,"nausea_vomiting", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Inflammation_respiratory_tract = new SymptomsPojo(33,"inflammation_respiratory_tract", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Sweating = new SymptomsPojo(34,"sweating", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Mucus = new SymptomsPojo(35,"mucus", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Expectoration = new SymptomsPojo(36,"expectoration", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Stridor = new SymptomsPojo(37,"stridor", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Tachycardia = new SymptomsPojo(38,"tachycardia", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Hyperthermia = new SymptomsPojo(39,"hyperthermia", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Loss_negative_pressure = new SymptomsPojo(40,"loss_negative_pressure", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Sneezing = new SymptomsPojo(41,"sneezing", 0,listaDr,listaP,listaD);
    	final SymptomsPojo Chronic_cough = new SymptomsPojo(42,"chronic_cough", 0,listaDr,listaP,listaD);

    	
    	final DiseasePojo Hypoxemia = new DiseasePojo(1,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	final DiseasePojo Apnea = new DiseasePojo(2,"Apnea","BI","Link",(float) 21,listaP,listaS);
    	final DiseasePojo Hyperapnea = new DiseasePojo(3,"Hyperapnea","BI","Link",(float) 16,listaP,listaS);
    	final DiseasePojo Tachypnea = new DiseasePojo(4,"Tachypnea","BI","Link",(float) 15,listaP,listaS);
    	final DiseasePojo Dysnea = new DiseasePojo(5,"Dysnea","BI","Link",(float) 19,listaP,listaS);
    	final DiseasePojo Respiratory_Insufficiency = new DiseasePojo(6,"Respiratory_Insufficiency","BI","Link",(float) 22,listaP,listaS);
    	final DiseasePojo Lung_Cancer = new DiseasePojo(7,"Lung_Cancer","BI","Link",(float) 29,listaP,listaS);
    	final DiseasePojo COVID = new DiseasePojo(8,"COVID","BI","Link",(float) 21,listaP,listaS);
    	final DiseasePojo Asthma = new DiseasePojo(9,"Asthma","BI","Link",(float) 10,listaP,listaS);
    	final DiseasePojo Emphysema = new DiseasePojo(10,"Emphysema","BI","Link",(float) 3,listaP,listaS);
    	final DiseasePojo Bronchitis_Chronic = new DiseasePojo(11,"Bronchitis_Chronic","BI","Link",(float) 11,listaP,listaS);
    	final DiseasePojo Atelactasis = new DiseasePojo(12,"Atelactasis","BI","Link",(float) 7,listaP,listaS);
    	final DiseasePojo Pneumothorax = new DiseasePojo(13,"Pneumothorax","BI","Link",(float) 7,listaP,listaS);
    	final DiseasePojo Pneumonia = new DiseasePojo(14,"Pneumonia","BI","Link",(float) 24,listaP,listaS);
    	final DiseasePojo Malignant_Pleura_Effusion = new DiseasePojo(15,"Malignant_Pleura_Effusion","BI","Link",(float) 5,listaP,listaS);
    	final DiseasePojo Pulmonary_Embolism = new DiseasePojo(16,"Pulmonary_Embolism","BI","Link",(float) 6,listaP,listaS);
    	final DiseasePojo Cold = new DiseasePojo(17,"Cold","BI","Link",(float) 16,listaP,listaS);
    	final DiseasePojo Flu = new DiseasePojo(18,"Flu","BI","Link",(float) 23,listaP,listaS);

    	
    	
    	final DrugPojo Betablockers = new DrugPojo(1,"Betablockers",listaS,listaP);
    	final DrugPojo NSAIDs = new DrugPojo(2,"NSAIDs",listaS,listaP);
    	final DrugPojo Opiods = new DrugPojo(3,"Opiods",listaS,listaP);
    	final DrugPojo Statins = new DrugPojo(4,"Statins",listaS,listaP);
    	final DrugPojo Bronchodilators = new DrugPojo(5,"Bronchodilators",listaS,listaP);
    	final DrugPojo Stimulants = new DrugPojo(6,"Stimulants",listaS,listaP);
    	final DrugPojo Antidepressants = new DrugPojo(7,"Antidepressants",listaS,listaP);
    	final DrugPojo ACE_Inhibitors = new DrugPojo(8,"ACE_Inhibitors",listaS,listaP);
    	final DrugPojo Antipsychotics = new DrugPojo(9,"Antipsychotics",listaS,listaP);
    	final DrugPojo Chemotherapy_drugs = new DrugPojo(10,"Chemotherapy_drugs",listaS,listaP);
    	final DrugPojo Antibiotics = new DrugPojo(11,"Antibiotics",listaS,listaP);
    	final DrugPojo Antihistamines = new DrugPojo(12,"Antihistamines",listaS,listaP);
    	final DrugPojo SSRIs = new DrugPojo(13,"SSRIs",listaS,listaP);
    	
    	
    	List<DiseasePojo> listaDS1 = new ArrayList<DiseasePojo>();
    	listaDS1.add(Hypoxemia);
    	listaDS1.add(Hyperapnea);
    	listaDS1.add(Tachypnea);
    	listaDS1.add(Dysnea);
    	listaDS1.add(Respiratory_Insufficiency);
    	listaDS1.add(Lung_Cancer);
    	listaDS1.add(Pneumothorax);
    	listaDS1.add(Pneumonia);
    	listaDS1.add(Malignant_Pleura_Effusion);
    	listaDS1.add(Pulmonary_Embolism);
    	
    	
    	List<DrugPojo> listaDrS1 = new ArrayList<DrugPojo>();
    	listaDrS1.add(Betablockers);
    	listaDrS1.add(NSAIDs);
    	listaDrS1.add(Opiods);
    	listaDrS1.add(Statins);
    	
        final SymptomsPojo Shortness_breath = new SymptomsPojo(1,"shortness_breath", 0,listaDrS1,listaP,listaDS1);

    	
    	List<DiseasePojo> listaDS2 = new ArrayList<DiseasePojo>();
    	listaDS2.add(Hypoxemia);
    	listaDS2.add(Hyperapnea);
    	listaDS2.add(Tachypnea);
    	listaDS2.add(Dysnea);

    	List<DiseasePojo> listaDS3 = new ArrayList<DiseasePojo>();  
    	listaDS3.add(Hypoxemia);
    	listaDS3.add(Tachypnea);
    	listaDS3.add(Dysnea);
    	listaDS3.add(Respiratory_Insufficiency);
    	listaDS3.add(Lung_Cancer);

    	List<DiseasePojo> listaDS4 = new ArrayList<DiseasePojo>();  
    	listaDS4.add(Hypoxemia);
    	listaDS4.add(Tachypnea);
    	listaDS4.add(Dysnea);
    	listaDS4.add(Asthma);
    	listaDS4.add(Atelactasis);

    	List<DiseasePojo> listaDS5 = new ArrayList<DiseasePojo>();  
    	listaDS5.add(Hypoxemia);
    	listaDS5.add(Apnea);
    	listaDS5.add(COVID);
    	listaDS5.add(Cold);
    	listaDS5.add(Flu);

    	List<DiseasePojo> listaDS6 = new ArrayList<DiseasePojo>(); 
    	listaDS6.add(Hypoxemia);
    	listaDS6.add(Respiratory_Insufficiency);
    	listaDS6.add(Pneumonia);

    	List<DiseasePojo> listaDS7 = new ArrayList<DiseasePojo>();
    	listaDS7.add(Hypoxemia);
    	listaDS7.add(Hyperapnea);
    	listaDS7.add(Tachypnea);
    	listaDS7.add(Dysnea);
    	listaDS7.add(Respiratory_Insufficiency);

    	List<DiseasePojo> listaDS8 = new ArrayList<DiseasePojo>();	
    	listaDS8.add(Hypoxemia);
    	listaDS8.add(Respiratory_Insufficiency);
    	listaDS8.add(Lung_Cancer);
    	listaDS8.add(Pneumothorax);
    	listaDS8.add(Pneumonia);
    	listaDS8.add(Pulmonary_Embolism);

    	List<DiseasePojo> listaDS9 = new ArrayList<DiseasePojo>();
    	listaDS9.add(Hypoxemia);
    	listaDS9.add(Apnea);
    	listaDS9.add(Hyperapnea);
    	listaDS9.add(Tachypnea);
    	listaDS9.add(Dysnea);
    	listaDS9.add(Respiratory_Insufficiency);
    	listaDS9.add(Lung_Cancer);
    	listaDS9.add(COVID);
    	listaDS9.add(Pneumonia);
    	listaDS9.add(Flu);

    	List<DiseasePojo> listaDS10 = new ArrayList<DiseasePojo>();
    	listaDS10.add(Hypoxemia); 
    	listaDS10.add(Hyperapnea);
    	listaDS10.add(Dysnea);

    	List<DiseasePojo> listaDS11 = new ArrayList<DiseasePojo>();
    	listaDS11.add(Hypoxemia);

    	List<DiseasePojo> listaDS12 = new ArrayList<DiseasePojo>();
    	listaDS12.add(Apnea);

    	List<DiseasePojo> listaDS13 = new ArrayList<DiseasePojo>();
    	listaDS13.add(Apnea);
    	listaDS13.add(Respiratory_Insufficiency);

    	List<DiseasePojo> listaDS14 = new ArrayList<DiseasePojo>();
    	listaDS14.add(Apnea);

    	List<DiseasePojo> listaDS15 = new ArrayList<DiseasePojo>();
    	listaDS15.add(Apnea);

    	List<DiseasePojo> listaDS16 = new ArrayList<DiseasePojo>();
    	listaDS16.add(Apnea);
    	listaDS16.add(Asthma);

    	List<DiseasePojo> listaDS17 = new ArrayList<DiseasePojo>();
    	listaDS17.add(Apnea);

    	List<DiseasePojo> listaDS18 = new ArrayList<DiseasePojo>();
    	listaDS18.add(Apnea);
    	listaDS18.add(Respiratory_Insufficiency);

    	List<DiseasePojo> listaDS19 = new ArrayList<DiseasePojo>();
    	listaDS19.add(Apnea);
    	listaDS19.add(COVID);
    	listaDS19.add(Cold);
    	listaDS19.add(Flu);

    	List<DiseasePojo> listaDS20 = new ArrayList<DiseasePojo>(); 
    	listaDS20.add(Hyperapnea);
    	listaDS20.add(Tachypnea);
    	listaDS20.add(Dysnea);
    	listaDS20.add(Respiratory_Insufficiency);
    	listaDS20.add(Lung_Cancer);
    	listaDS20.add(Asthma);

    	List<DiseasePojo> listaDS21 = new ArrayList<DiseasePojo>();
    	listaDS21.add(Hyperapnea);
    	listaDS21.add(COVID);
    	listaDS21.add(Flu);

    	List<DiseasePojo> listaDS22 = new ArrayList<DiseasePojo>();
    	listaDS22.add(Respiratory_Insufficiency);
    	listaDS22.add(COVID);
    	listaDS22.add(Asthma);
    	listaDS22.add(Emphysema);
    	listaDS22.add(Bronchitis_Chronic);
    	listaDS22.add(Atelactasis);
    	listaDS22.add(Pneumonia);
    	listaDS22.add(Malignant_Pleura_Effusion);
    	listaDS22.add(Cold);
    	listaDS22.add(Flu);

    	List<DiseasePojo> listaDS23 = new ArrayList<DiseasePojo>();
    	listaDS23.add(Lung_Cancer);
    	listaDS23.add(Pulmonary_Embolism);
    	listaDS23.add(Cold);
    	listaDS23.add(Flu);

    	List<DiseasePojo> listaDS24 = new ArrayList<DiseasePojo>();
    	listaDS24.add(Lung_Cancer);

    	List<DiseasePojo> listaDS25 = new ArrayList<DiseasePojo>();
    	listaDS25.add(Respiratory_Insufficiency);

    	List<DiseasePojo> listaDS26 = new ArrayList<DiseasePojo>(); 
    	listaDS26.add(Respiratory_Insufficiency);
    	listaDS26.add(Lung_Cancer);
    	listaDS26.add(Emphysema);
    	listaDS26.add(Pneumonia);

    	List<DiseasePojo> listaDS27 = new ArrayList<DiseasePojo>();
    	listaDS27.add(Lung_Cancer);

    	List<DiseasePojo> listaDS28 = new ArrayList<DiseasePojo>();
    	listaDS28.add(Lung_Cancer);

    	List<DiseasePojo> listaDS29 = new ArrayList<DiseasePojo>();
    	listaDS29.add(COVID);
    	listaDS29.add(Bronchitis_Chronic);
    	listaDS29.add(Pneumonia);
    	listaDS29.add(Flu);

    	List<DiseasePojo> listaDS30 = new ArrayList<DiseasePojo>();  
    	listaDS30.add(COVID);

    	List<DiseasePojo> listaDS31 = new ArrayList<DiseasePojo>();
    	listaDS31.add(COVID);
    	listaDS31.add(Cold);
    	listaDS31.add(Flu);

    	List<DiseasePojo> listaDS32 = new ArrayList<DiseasePojo>();
    	listaDS32.add(COVID);
    	listaDS32.add(Pneumonia);

    	List<DiseasePojo> listaDS33 = new ArrayList<DiseasePojo>();  
    	listaDS33.add(Asthma);
    	listaDS33.add(Bronchitis_Chronic);

    	List<DiseasePojo> listaDS34 = new ArrayList<DiseasePojo>();
    	listaDS34.add(Hyperapnea);
    	listaDS34.add(Dysnea);
    	listaDS34.add(Asthma);
    	listaDS34.add(Pneumonia);

    	List<DiseasePojo> listaDS35 = new ArrayList<DiseasePojo>();
    	listaDS35.add(Lung_Cancer);
    	listaDS35.add(Bronchitis_Chronic);
    	listaDS35.add(Pneumonia);
    	listaDS35.add(Cold);
    	listaDS35.add(Flu);

    	List<DiseasePojo> listaDS36 = new ArrayList<DiseasePojo>();
    	listaDS36.add(Bronchitis_Chronic);
    	listaDS36.add(Atelactasis);

    	List<DiseasePojo> listaDS37 = new ArrayList<DiseasePojo>();
    	listaDS37.add(Atelactasis);

    	List<DiseasePojo> listaDS38 = new ArrayList<DiseasePojo>();
    	listaDS38.add(Atelactasis);

    	List<DiseasePojo> listaDS39 = new ArrayList<DiseasePojo>();
    	listaDS39.add(Atelactasis);

    	List<DiseasePojo> listaDS40 = new ArrayList<DiseasePojo>();
    	listaDS40.add(Pneumothorax);

    	List<DiseasePojo> listaDS41 = new ArrayList<DiseasePojo>();
    	listaDS41.add(Cold);

    	List<DiseasePojo> listaDS42 = new ArrayList<DiseasePojo>();
    	listaDS42.add(Respiratory_Insufficiency);
    	listaDS42.add(Lung_Cancer);


         

    	
    	List<DrugPojo> listaDrS2 = new ArrayList<DrugPojo>();
    	listaDrS2.add(Bronchodilators);
    	listaDrS2.add(Stimulants);
    	listaDrS2.add(Antidepressants);

    	List<DrugPojo> listaDrS3 = new ArrayList<DrugPojo>();
    	listaDrS3.add(Betablockers);
    	listaDrS3.add(NSAIDs);
    	listaDrS3.add(Statins);
    	listaDrS3.add(ACE_Inhibitors);

    	List<DrugPojo> listaDrS4 = new ArrayList<DrugPojo>();
    	listaDrS4.add(Antidepressants);
    	listaDrS4.add(Antipsychotics);

    	List<DrugPojo> listaDrS5 = new ArrayList<DrugPojo>();
    	listaDrS5.add(Betablockers);

    	List<DrugPojo> listaDrS6 = new ArrayList<DrugPojo>();
    	listaDrS6.add(Betablockers);
    	listaDrS6.add(NSAIDs);
    	listaDrS6.add(Opiods);
    	listaDrS6.add(Statins);
    	listaDrS6.add(Antidepressants);
    	listaDrS6.add(ACE_Inhibitors);
    	listaDrS6.add(Antipsychotics);

    	List<DrugPojo> listaDrS7 = new ArrayList<DrugPojo>();
    	listaDrS7.add(Betablockers);
    	listaDrS7.add(NSAIDs);
    	listaDrS7.add(Statins);
    	listaDrS7.add(Antidepressants);
    	listaDrS7.add(Antipsychotics);
    	listaDrS7.add(Antibiotics);
    	listaDrS7.add(SSRIs);

    	List<DrugPojo> listaDrS8 = new ArrayList<DrugPojo>();
    	listaDrS8.add(Betablockers);
    	listaDrS8.add(NSAIDs);
    	listaDrS8.add(Statins);
    	listaDrS8.add(Bronchodilators);
    	listaDrS8.add(Stimulants);
    	listaDrS8.add(Antidepressants);
    	listaDrS8.add(Antipsychotics);
    	listaDrS8.add(Antibiotics);

    	List<DrugPojo> listaDrS9 = new ArrayList<DrugPojo>();
    	listaDrS9.add(Betablockers);
    	listaDrS9.add(NSAIDs);
    	listaDrS9.add(Opiods);
    	listaDrS9.add(Statins);
    	listaDrS9.add(Antidepressants);
    	listaDrS9.add(Antipsychotics);
    	listaDrS9.add(Chemotherapy_drugs);
    	listaDrS9.add(Antibiotics);
    	listaDrS9.add(SSRIs);

    	List<DrugPojo> listaDrS10 = new ArrayList<DrugPojo>();
    	listaDrS10.add(Betablockers);
    	listaDrS10.add(NSAIDs);
    	listaDrS10.add(Opiods);
    	listaDrS10.add(Statins);
    	listaDrS10.add(Antidepressants);
    	listaDrS10.add(Antipsychotics);
    	listaDrS10.add(Antibiotics);

    	List<DrugPojo> listaDrS11 = new ArrayList<DrugPojo>();
    	listaDrS11.add(Betablockers);
    	listaDrS11.add(NSAIDs);
    	listaDrS11.add(Opiods);
    	listaDrS11.add(Statins);
    	listaDrS11.add(Antidepressants);
    	listaDrS11.add(ACE_Inhibitors);
    	listaDrS11.add(Antipsychotics);
    	listaDrS11.add(Antibiotics);

    	List<DrugPojo> listaDrS12 = new ArrayList<DrugPojo>();
    	listaDrS12.add(Betablockers);
    	listaDrS12.add(NSAIDs);
    	listaDrS12.add(Antidepressants);
    	listaDrS12.add(Antipsychotics);
    	listaDrS12.add(Antihistamines);
    	listaDrS12.add(SSRIs);

    	List<DrugPojo> listaDrS13 = new ArrayList<DrugPojo>();
    	listaDrS13.add(Betablockers);
    	listaDrS13.add(NSAIDs);
    	listaDrS13.add(Statins);
    	listaDrS13.add(Stimulants);
    	listaDrS13.add(Antipsychotics);
    	listaDrS13.add(SSRIs);

    	List<DrugPojo> listaDrS14 = new ArrayList<DrugPojo>();
    	listaDrS14.add(Betablockers);
    	listaDrS14.add(NSAIDs);
    	listaDrS14.add(Stimulants);
    	listaDrS14.add(Antipsychotics);
    	listaDrS14.add(Antihistamines);
    	listaDrS14.add(SSRIs);

    	List<DrugPojo> listaDrS15 = new ArrayList<DrugPojo>();
    	listaDrS15.add(Betablockers);
    	listaDrS15.add(NSAIDs);
    	listaDrS15.add(Statins);
    	listaDrS15.add(Antipsychotics);
    	listaDrS15.add(SSRIs);

    	List<DrugPojo> listaDrS16 = new ArrayList<DrugPojo>();
    	listaDrS16.add(Betablockers);
    	listaDrS16.add(NSAIDs);
    	listaDrS16.add(Stimulants);
    	listaDrS16.add(Antipsychotics);
    	listaDrS16.add(Antihistamines);
    	listaDrS16.add(SSRIs);

    	List<DrugPojo> listaDrS17 = new ArrayList<DrugPojo>();
    	listaDrS17.add(Betablockers);
    	listaDrS17.add(NSAIDs);
    	listaDrS17.add(Stimulants);
    	listaDrS17.add(Antihistamines);
    	listaDrS17.add(SSRIs);

    	List<DrugPojo> listaDrS18 = new ArrayList<DrugPojo>();
    	listaDrS18.add(Betablockers);
    	listaDrS18.add(NSAIDs);
    	listaDrS18.add(Stimulants);
    	listaDrS18.add(Antihistamines);
    	listaDrS18.add(SSRIs);

    	List<DrugPojo> listaDrS19 = new ArrayList<DrugPojo>();
    	listaDrS19.add(Betablockers);
    	listaDrS19.add(NSAIDs);
    	listaDrS19.add(Antidepressants);
    	listaDrS19.add(Antipsychotics);
    	listaDrS19.add(Antihistamines);
    	listaDrS19.add(SSRIs);

    	List<DrugPojo> listaDrS20 = new ArrayList<DrugPojo>();
    	listaDrS20.add(Betablockers);
    	listaDrS20.add(NSAIDs);
    	listaDrS20.add(Opiods);
    	listaDrS20.add(Statins);
    	listaDrS20.add(Bronchodilators);
    	listaDrS20.add(Antidepressants);
    	listaDrS20.add(ACE_Inhibitors);
    	listaDrS20.add(SSRIs);

    	List<DrugPojo> listaDrS21 = new ArrayList<DrugPojo>();
    	listaDrS21.add(Betablockers);
    	listaDrS21.add(NSAIDs);
    	listaDrS21.add(Statins);
    	listaDrS21.add(Antidepressants);
    	listaDrS21.add(ACE_Inhibitors);
    	listaDrS21.add(Antipsychotics);
    	listaDrS21.add(Antibiotics);
    	listaDrS21.add(SSRIs);

    	List<DrugPojo> listaDrS22 = new ArrayList<DrugPojo>();
    	listaDrS22.add(Betablockers);
    	listaDrS22.add(NSAIDs);
    	listaDrS22.add(Opiods);
    	listaDrS22.add(ACE_Inhibitors);

    	List<DrugPojo> listaDrS23 = new ArrayList<DrugPojo>();
    	listaDrS23.add(NSAIDs);
    	listaDrS23.add(Chemotherapy_drugs);

    	List<DrugPojo> listaDrS24 = new ArrayList<DrugPojo>();
    	listaDrS24.add(Betablockers);
    	listaDrS24.add(NSAIDs);
    	listaDrS24.add(Statins);
    	listaDrS24.add(ACE_Inhibitors);

    	List<DrugPojo> listaDrS25 = new ArrayList<DrugPojo>();
    	List<DrugPojo> listaDrS26 = new ArrayList<DrugPojo>();
    	listaDrS26.add(Stimulants);
    	listaDrS26.add(Antidepressants);
    	listaDrS26.add(Antipsychotics);
    	listaDrS26.add(Chemotherapy_drugs);
    	listaDrS26.add(Antibiotics);

    	List<DrugPojo> listaDrS27 = new ArrayList<DrugPojo>();
    	listaDrS27.add(Betablockers);
    	listaDrS27.add(NSAIDs);
    	listaDrS27.add(Opiods);
    	listaDrS27.add(Antidepressants);
    	listaDrS27.add(ACE_Inhibitors);
    	listaDrS27.add(Antipsychotics);
    	listaDrS27.add(Antibiotics);

    	List<DrugPojo> listaDrS28 = new ArrayList<DrugPojo>();
    	listaDrS28.add(Betablockers);
    	listaDrS28.add(NSAIDs);
    	listaDrS28.add(Opiods);
    	listaDrS28.add(Antipsychotics);

    	List<DrugPojo> listaDrS29 = new ArrayList<DrugPojo>();
    	listaDrS29.add(Betablockers);
    	listaDrS29.add(NSAIDs);
    	listaDrS29.add(Antidepressants);
    	listaDrS29.add(ACE_Inhibitors);
    	listaDrS29.add(Antipsychotics);
    	listaDrS29.add(Chemotherapy_drugs);
    	listaDrS29.add(Antibiotics);
    	listaDrS29.add(Antihistamines);

    	List<DrugPojo> listaDrS30 = new ArrayList<DrugPojo>();
    	listaDrS30.add(Antidepressants);
    	listaDrS30.add(ACE_Inhibitors);
    	listaDrS30.add(Antipsychotics);
    	listaDrS30.add(Chemotherapy_drugs);
    	listaDrS30.add(Antibiotics);
    	listaDrS30.add(Antihistamines);

    	List<DrugPojo> listaDrS31 = new ArrayList<DrugPojo>();
    	listaDrS31.add(Betablockers);
    	listaDrS31.add(NSAIDs);
    	listaDrS31.add(Opiods);
    	listaDrS31.add(Statins);
    	listaDrS31.add(Antidepressants);
    	listaDrS31.add(ACE_Inhibitors);
    	listaDrS31.add(Antipsychotics);
    	listaDrS31.add(Antibiotics);
    	listaDrS31.add(Antihistamines);

    	List<DrugPojo> listaDrS32 = new ArrayList<DrugPojo>(); 
    	listaDrS32.add(Betablockers);
    	listaDrS32.add(NSAIDs);
    	listaDrS32.add(Opiods);
    	listaDrS32.add(Statins);
    	listaDrS32.add(Antidepressants);
    	listaDrS32.add(Chemotherapy_drugs);
    	listaDrS32.add(Antibiotics);

    	List<DrugPojo> listaDrS33 = new ArrayList<DrugPojo>();
    	listaDrS33.add(Betablockers);
    	listaDrS33.add(NSAIDs);
    	listaDrS33.add(Statins);
    	listaDrS33.add(Antidepressants);
    	listaDrS33.add(ACE_Inhibitors);
    	listaDrS33.add(Chemotherapy_drugs);

    	List<DrugPojo> listaDrS34 = new ArrayList<DrugPojo>();
    	listaDrS34.add(Betablockers);
    	listaDrS34.add(NSAIDs);
    	listaDrS34.add(Opiods);
    	listaDrS34.add(Antidepressants);
    	listaDrS34.add(Antipsychotics);
    	listaDrS34.add(Antihistamines);

    	List<DrugPojo> listaDrS35 = new ArrayList<DrugPojo>();
    	listaDrS35.add(Betablockers);
    	listaDrS35.add(Statins);
    	listaDrS35.add(Bronchodilators);
    	listaDrS35.add(Antidepressants);
    	listaDrS35.add(ACE_Inhibitors);

    	List<DrugPojo> listaDrS36 = new ArrayList<DrugPojo>(); 
    	listaDrS36.add(Betablockers);
    	listaDrS36.add(Statins);
    	listaDrS36.add(Bronchodilators);
    	listaDrS36.add(Antidepressants);
    	listaDrS36.add(ACE_Inhibitors);
    	listaDrS36.add(Antibiotics);

    	List<DrugPojo> listaDrS37 = new ArrayList<DrugPojo>();
    	listaDrS37.add(Betablockers);
    	listaDrS37.add(NSAIDs);
    	listaDrS37.add(Opiods);
    	listaDrS37.add(Antidepressants);
    	listaDrS37.add(ACE_Inhibitors);

    	List<DrugPojo> listaDrS38 = new ArrayList<DrugPojo>();
    	listaDrS38.add(NSAIDs);
    	listaDrS38.add(Stimulants);
    	listaDrS38.add(Antidepressants);

    	List<DrugPojo> listaDrS39 = new ArrayList<DrugPojo>();
    	listaDrS39.add(NSAIDs);
    	listaDrS39.add(Statins);
    	listaDrS39.add(Stimulants);
    	listaDrS39.add(Antidepressants);
    	listaDrS39.add(Antipsychotics);

    	List<DrugPojo> listaDrS40 = new ArrayList<DrugPojo>();
    	
    	List<DrugPojo> listaDrS41 = new ArrayList<DrugPojo>();
    	listaDrS41.add(Betablockers);
    	listaDrS41.add(Statins);
    	listaDrS41.add(Antidepressants);
    	listaDrS41.add(ACE_Inhibitors);

    	List<DrugPojo> listaDrS42 = new ArrayList<DrugPojo>();
    	listaDrS42.add(Betablockers);
    	listaDrS42.add(NSAIDs);
    	listaDrS42.add(Statins);
    	listaDrS42.add(Antidepressants);
    	listaDrS42.add(ACE_Inhibitors);


    	

    }
	
	public static List<SymptomsPojo> createlistSD(DiseasePojo dis,List<SymptomsPojo> listasymp){
		List<SymptomsPojo> listaaux = new ArrayList<SymptomsPojo>();
		for (int i=0;i<listasymp.size();i++) {
			for (int j=0;j<listasymp.get(i).getDisease().size();j++) {
				if (listasymp.get(i).getDisease().get(j)==dis) {
					listaaux.add(listasymp.get(i));
			}	
		}
	}
		return listaaux;
}
	
}
