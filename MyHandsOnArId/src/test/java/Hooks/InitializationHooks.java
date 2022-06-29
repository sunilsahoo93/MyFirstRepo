package Hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class InitializationHooks {
	
	private static Scenario sc;
	
	@Before
	public void beforeScenario(Scenario scenario) {
		
		System.out.println("Current scenarios name is :" + scenario.getName());
	}

}
