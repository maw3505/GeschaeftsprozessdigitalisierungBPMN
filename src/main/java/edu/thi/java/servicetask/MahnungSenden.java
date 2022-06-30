package edu.thi.java.servicetask;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;

public class MahnungSenden implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		long rechnungsbetrag = (long) execution.getVariableLocal("Rechnungsbetrag");
		
		if((Integer) execution.getVariable("Mahnstufe")>1) {
			long mahngebuehr = rechnungsbetrag + 15;
			execution.setVariable("rechnung", mahngebuehr);
			System.out.println("Mahnstufe: " + execution.getVariable("Mahnstufe") + " deshalb Rechnungsbetrag: " +mahngebuehr);
		}
		else {
			System.out.println("Zahlungserinnerung wurde gesendet");
		}

	}


}
