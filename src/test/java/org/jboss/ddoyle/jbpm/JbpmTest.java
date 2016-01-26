package org.jboss.ddoyle.jbpm;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class JbpmTest {
	
	private static final String PROCESS_MESSAGE_VARIABLE_NAME = "processMessage";
	
	@Test
	public void testProcess() {
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		
		KieSession kieSession = kieContainer.newKieSession();
		
		//Starting the process.
		Map<String, Object> processStartParams = new HashMap<>();
		processStartParams.put(PROCESS_MESSAGE_VARIABLE_NAME, "My Cool Message");
		kieSession.startProcess("multi-signal-start-process", processStartParams);
		
		//Validate the outcome.
		//TODO: Need to actually create a proper assertion here.
	}
	

}
