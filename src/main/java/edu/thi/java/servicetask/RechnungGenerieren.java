package edu.thi.java.servicetask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RechnungGenerieren implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Long rechung = (Long) execution.getVariable("rechnung");
		execution.setVariable("Mahnstufe", 0);
		System.out.println("Der Kunde muss " + rechung + "€ zahlen");
		System.out.println(execution.getVariable("Mahnstufe"));
	}

}
