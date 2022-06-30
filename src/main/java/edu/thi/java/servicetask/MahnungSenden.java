package edu.thi.java.servicetask;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;

public class MahnungSenden implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		long rechnungsbetrag = (long) execution.getVariableLocal("Rechnungsbetrag");
		
		long mahngebuehr = rechnungsbetrag + 15;
		
		execution.setVariable("rechnung", mahngebuehr);

		System.out.println("Mahnstufe: " + execution.getVariable("Mahnstufe") + " deshalb Rechnungsbetrag: " +mahngebuehr);

	}


}
