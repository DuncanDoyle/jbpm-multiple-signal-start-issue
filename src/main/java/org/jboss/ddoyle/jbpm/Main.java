package org.jboss.ddoyle.jbpm;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
	
	private static final String PROCESS_MESSAGE_VARIABLE_NAME = "processMessage";
	
	
	public static void main(String[] args) {
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		
		KieSession kieSession = kieContainer.newKieSession();
		
		//Starting the process.
		Map<String, Object> processStartParams = new HashMap<>();
		processStartParams.put(PROCESS_MESSAGE_VARIABLE_NAME, "My Cool Message");
		kieSession.startProcess("multi-signal-start-process", processStartParams);
		
		//Validate the outcome.
		//TODO: Need to build a unit-test for this.
	}
	

}
