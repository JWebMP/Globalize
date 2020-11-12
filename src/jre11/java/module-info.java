module com.jwebmp.plugins.globalize.cultures {
	exports com.jwebmp.plugins.globalize.cultures;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.globalize.cultures.GlobalizePageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.globalize.cultures.implementations.GlobalizeExclusionsModule;

	opens com.jwebmp.plugins.globalize.cultures to com.fasterxml.jackson.databind, com.jwebmp.core;
}
