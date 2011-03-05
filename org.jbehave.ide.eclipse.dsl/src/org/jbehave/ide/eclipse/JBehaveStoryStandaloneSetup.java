
package org.jbehave.ide.eclipse;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JBehaveStoryStandaloneSetup extends JBehaveStoryStandaloneSetupGenerated{

	public static void doSetup() {
		new JBehaveStoryStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

