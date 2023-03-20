package com.rulesClasses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//

public class Constants {
	public static Map<Medicines, List<Symptoms>> MEDICINES_MAP = new HashMap();
	public static Medicines BETABLOCKER = new Medicines();
	public static Symptoms SOB = new Symptoms("SOB");
	public static Symptoms WH = new Symptoms("WH");
	public static Symptoms GT = new Symptoms("GT");
	public static Symptoms CONF = new Symptoms("CONF");
	public static Symptoms IRHB = new Symptoms("IRHB");
	public static List<Symptoms> BETABLOCKERSLIST = new LinkedList();
	
	static {
		BETABLOCKERSLIST.add(SOB);
		BETABLOCKERSLIST.add(WH);
		BETABLOCKERSLIST.add(GT);
		
		
		MEDICINES_MAP.put(BETABLOCKER, BETABLOCKERSLIST);
	}

}
