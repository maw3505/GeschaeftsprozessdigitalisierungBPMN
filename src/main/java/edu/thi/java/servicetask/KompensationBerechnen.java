package edu.thi.java.servicetask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class KompensationBerechnen implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Integer kompensation = (Integer) execution.getVariable("kompensationsergebnis");
		Long normalPreis = (Long) execution.getVariable("preis");
		String kunde = (String) execution.getVariable("Kunde");
		String kundenstatus = (String) execution.getVariable("Kundenstatus");
		Long preis = kompensation * normalPreis / 100; 
		System.out.println("Der Kunde " + kunde + " hat den Kundenstatus " + kundenstatus + " und muss deshalb "
				+ kompensation*100 +"% des Ursprungsbetrags " + normalPreis + "€ bezahlen. Der Rechnungsbetrag liegt bei: "
				+ preis + "€.");
		execution.setVariable("preis", preis);
	}

}
