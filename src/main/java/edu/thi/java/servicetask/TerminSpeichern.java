package edu.thi.java.servicetask;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;

public class TerminSpeichern implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//ArrayList<String[]> kundenListe = new ArrayList<String[]>();
		//kundenListe.add("Gold");
		
		
		HashMap<String, String> kunde = new HashMap<>();
		kunde.put("Bob", "Gold");
		kunde.put("Alice", "Silber");
		kunde.put("Peter", "Bronze");
		kunde.put("Leon", "Neu");
		kunde.put("Leonhard", "Gold");
		
		System.out.println("Termin wurde beim Kunden eignetragen");
	}


}
