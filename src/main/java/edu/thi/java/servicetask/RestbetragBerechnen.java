package edu.thi.java.servicetask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RestbetragBerechnen implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Long gezahlt = (Long) execution.getVariable("zahlungOutput");
		Long rechnung = (Long) execution.getVariable("rechnung");
		Long restbetrag = rechnung - gezahlt;
		if(restbetrag == 0) {
			System.out.println("Die Rechnung wurde vollständig beglichen");
		}
		else {
			System.out.println("Es muss noch " + restbetrag + "€ gezahlt werden");
		}
		execution.setVariable("rechnung", restbetrag);
	}

}
