package edu.thi.java.servicetask;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.MessageCorrelationResult;

public class AlternativTerminVorschlaege implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Date ursprungsTermin = (Date) execution.getVariable("Datum");
		
		List<Date> alternativTermine = new ArrayList<Date>();
		alternativTermine.add(new Date(ursprungsTermin.getYear(), ursprungsTermin.getMonth(), ursprungsTermin.getDay()+1));
		alternativTermine.add(new Date(ursprungsTermin.getYear(), ursprungsTermin.getMonth(), ursprungsTermin.getDay()+2));
		alternativTermine.add(new Date(ursprungsTermin.getYear(), ursprungsTermin.getMonth(), ursprungsTermin.getDay()+3));
		alternativTermine.add(new Date(ursprungsTermin.getYear(), ursprungsTermin.getMonth(), ursprungsTermin.getDay()+4));
		alternativTermine.add(new Date(ursprungsTermin.getYear(), ursprungsTermin.getMonth(), ursprungsTermin.getDay()+5));
		
		RuntimeService runtimeService = execution.getProcessEngineServices().getRuntimeService();
		MessageCorrelationResult mcresult = runtimeService.createMessageCorrelation("alternativTerminVorschlag")
														.setVariable("AlternativTermine", alternativTermine)
														.correlateWithResult();
	}


}
