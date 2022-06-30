package edu.thi.java.servicetask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MahnungErhoehen implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		execution.setVariable("Mahnstufe",(Integer) execution.getVariable("Mahnstufe")+1);
		System.out.println(execution.getVariable("Mahnstufe"));
	}

}
