/*
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.protokit


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ProtokitDSLStandaloneSetup extends ProtokitDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new ProtokitDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
