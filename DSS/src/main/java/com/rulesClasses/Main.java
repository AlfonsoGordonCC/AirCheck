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
    }
}
