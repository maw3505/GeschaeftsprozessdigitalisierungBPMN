package edu.thi.java.servicetask;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;

public class KundenListe implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//Date termin = new Date();
		//System.out.println("Termin vom " + termin + " wurde eingetragen");
		
		System.out.println("Termin wurde beim Kunden eignetragen");
	}


}
