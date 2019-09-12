package hu.bme.aut.oogen.general;

import hu.bme.aut.oogen.OOClass;
import hu.bme.aut.oogen.OOEnumeration;

public interface OOCodeGeneratorTemplates {
	String generate(OOClass cl);
	String generate(OOEnumeration e);
}
