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
	
	
	public static void main(String[] args) throws IOException{
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
		
		DrugPojo Betablockers = new DrugPojo("Betablockers");
		DrugPojo NSAIDs = new DrugPojo("NSAIDs");
		DrugPojo Opiods = new DrugPojo("Opiods");
		DrugPojo Statins = new DrugPojo("Statins");
		
		
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
		listaDr.add(Betablockers);
		listaDr.add(NSAIDs);
		listaDr.add(Opiods);
		listaDr.add(Statins);
		
		
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
        
        
        //TODO listas
        public SymptomsPojo Shortness_breath = new SymptomsPojo(1,"shortness_breath", 0,a,b,listaD);
    	public SymptomsPojo Rapid_Breathing = new SymptomsPojo(2,"rapid_breathing", 0,a,b,listaD);
    	public SymptomsPojo Wheezing = new SymptomsPojo(3,"wheezing", 0,a,b,listaD);
    	public SymptomsPojo Cyanosis = new SymptomsPojo(4,"cyanosis", 0,a,b,listaD);
    	public SymptomsPojo Headache = new SymptomsPojo(5,"headache", 0,a,b,listaD);
    	public SymptomsPojo Confusion_Disorientation = new SymptomsPojo(6,"confusion_disorientation", 0,a,b,listaD);
    	public SymptomsPojo Irregular_heartbeat = new SymptomsPojo(7,"irregular_heartbeat", 0,a,b,listaD);
    	public SymptomsPojo Chest_pain = new SymptomsPojo(8,"chest_pain", 0,a,b,listaD);
    	public SymptomsPojo Fatigue_Weakness = new SymptomsPojo(9,"fatigue_weakness", 0,a,b,listaD);
    	public SymptomsPojo Dizziness = new SymptomsPojo(10,"dizziness", 0,a,b,listaD);
    	public SymptomsPojo Fainting_or_loss_of_consciousness = new SymptomsPojo(11,"fainting_or_loss_of_consciousness", 0,a,b,listaD);
    	public SymptomsPojo Excessive_daytime_sleepiness = new SymptomsPojo(12,"excessive_daytime_sleepiness", 0,a,b,listaD);
    	public SymptomsPojo Difficulty_concentrating = new SymptomsPojo(13,"difficulty_concentrating", 0,a,b,listaD);
    	public SymptomsPojo Irritability = new SymptomsPojo(14,"irritability", 0,a,b,listaD);
    	public SymptomsPojo Depression = new SymptomsPojo(15,"depression", 0,a,b,listaD);
    	public SymptomsPojo Anxiety = new SymptomsPojo(16,"anxiety", 0,a,b,listaD);
    	public SymptomsPojo Restless_sleep = new SymptomsPojo(17,"restless_sleep", 0,a,b,listaD);
    	public SymptomsPojo Insomnia = new SymptomsPojo(18,"insomnia", 0,a,b,listaD);
    	public SymptomsPojo Dry_mouth_or_sore_throat = new SymptomsPojo(19,"dry_mouth_or_sore_throat", 0,a,b,listaD);
    	public SymptomsPojo listaDhest_oppression_discomfort = new SymptomsPojo(21,"listaDhest_oppression_discomfort", 0,a,b,listaD);
    	public SymptomsPojo Muscle_or_body_pain = new SymptomsPojo(22,"muscle_or_body_pain", 0,a,b,listaD);
    	public SymptomsPojo Cough = new SymptomsPojo(23,"cough", 0,a,b,listaD);
    	public SymptomsPojo Cough_blood = new SymptomsPojo(24,"cough_blood", 0,a,b,listaD);
    	public SymptomsPojo Cough_worse_over_time = new SymptomsPojo(25,"cough_worse_over_time", 0,a,b,listaD);
    	public SymptomsPojo Difficulty_physical_activities = new SymptomsPojo(26,"difficulty_physical_activities", 0,a,b,listaD);
    	public SymptomsPojo Loss_appetite_weight = new SymptomsPojo(27,"loss_appetite_weight", 0,a,b,listaD);
    	public SymptomsPojo Hoarseness = new SymptomsPojo(28,"hoarseness", 0,a,b,listaD);
    	public SymptomsPojo Trouble_swallowing = new SymptomsPojo(29,"trouble_swallowing", 0,a,b,listaD);
    	public SymptomsPojo Fever_chills = new SymptomsPojo(30,"fever_chills", 0,a,b,listaD);
    	public SymptomsPojo Loss_taste_smell = new SymptomsPojo(31,"loss_taste_smell", 0,a,b,listaD);
    	public SymptomsPojo Congestion_or_running_nose = new SymptomsPojo(32,"congestion_or_running_nose", 0,a,b,listaD);
    	public SymptomsPojo Nausea_vomiting = new SymptomsPojo(33,"nausea_vomiting", 0,a,b,listaD);
    	public SymptomsPojo Inflammation_respiratory_tract = new SymptomsPojo(34,"inflammation_respiratory_tract", 0,a,b,listaD);
    	public SymptomsPojo Sweating = new SymptomsPojo(35,"sweating", 0,a,b,listaD);
    	public SymptomsPojo Mucus = new SymptomsPojo(36,"mucus", 0,a,b,listaD);
    	public SymptomsPojo Expectoration = new SymptomsPojo(37,"expectoration", 0,a,b,listaD);
    	public SymptomsPojo Stridor = new SymptomsPojo(38,"stridor", 0,a,b,listaD);
    	public SymptomsPojo Tachycardia = new SymptomsPojo(39,"tachycardia", 0,a,b,listaD);
    	public SymptomsPojo Hyperthermia = new SymptomsPojo(40,"hyperthermia", 0,a,b,listaD);
    	public SymptomsPojo Loss_negative_pressure = new SymptomsPojo(41,"loss_negative_pressure", 0,a,b,listaD);
    	public SymptomsPojo Sneezing = new SymptomsPojo(42,"sneezing", 0,a,b,listaD);
    	public SymptomsPojo Chronic_cough = new SymptomsPojo(43,"chronic_cough", 0,a,b,listaD);

    	
    	
    	public DiseasePojo Hypoxemia = new DiseasePojo(1,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Apnea = new DiseasePojo(2,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Hyperapnea = new DiseasePojo(3,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Tachypnea = new DiseasePojo(4,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Dysnea = new DiseasePojo(5,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Respiratory_Insufficiency = new DiseasePojo(6,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Lung_cancer = new DiseasePojo(7,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo COVID = new DiseasePojo(8,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Asthma = new DiseasePojo(9,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Emphysema = new DiseasePojo(10,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Bronchitis_Chronic = new DiseasePojo(11,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Atelactasis = new DiseasePojo(12,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Pneumothorax = new DiseasePojo(13,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Pneumonia = new DiseasePojo(14,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Malignant_Pleura_Effusion = new DiseasePojo(15,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Pulmonary_Embolism = new DiseasePojo(16,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Cold = new DiseasePojo(17,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);
    	public DiseasePojo Flu = new DiseasePojo(18,"Hypoxemia","BI","Link",(float) 23,listaP,listaS);

 
    	
    	
    	DrugPojo Betablockers = new DrugPojo("Betablockers");
    	DrugPojo NSAIDs = new DrugPojo("NSAIDs");
    	DrugPojo Opiods = new DrugPojo("Opiods");
    	DrugPojo Statins = new DrugPojo("Statins");
    	
        
        
        
        
        
        
        
        
        
        
        
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
