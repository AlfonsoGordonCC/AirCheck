package com.sample;
//comentao
import org.kie.api.KieServices;
import org.kie.api.runtime.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
	public static void main(String[] args) {
		
		boolean shortness_breath = false,  rapid_Breathing= true,  wheezing= false,  cyanosis= false,
		 headache= false,  confusion_Disorientation= true,  irregular_heartbeat= false,  chest_pain= false,
		 fatigue_Weakness= false, dizziness= true;
		
		Disease dis1 = new Disease();
		Symptoms sym1 = new Symptoms(shortness_breath, rapid_Breathing, wheezing, cyanosis, headache, 
				confusion_Disorientation, irregular_heartbeat, chest_pain, fatigue_Weakness, dizziness);
        System.out.println(dis1);
        System.out.println(sym1);
        
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();

        KieSession ksession = kc.newKieSession("ksession-rules"); //Nombre en kmodule.xml --> rules


        // Once the session is created, the application can interact with it
        // To set up a ThreadedFileLogger, so that the audit view reflects events whilst debugging,
        // uncomment the next line
        // KieRuntimeLogger logger = ks.getLoggers().newThreadedFileLogger( ksession, "./helloworld", 1000 );
        // The application can insert facts into the session
        
        
        
        System.out.println("\n\n\n\n");


        ksession.insert(dis1);
        ksession.insert(sym1);
       
        // and fire the rules
        ksession.fireAllRules();


        // AFTER Triggering the rules, the attribute authorized of some operations have been modified
        System.out.println(dis1);
        System.out.println(sym1);

        // and then dispose the session
        ksession.dispose();
    }
}
