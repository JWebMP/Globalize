module com.jwebmp.plugins.globalize.cultures {
	exports com.jwebmp.plugins.globalize.cultures;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.globalize.cultures.GlobalizePageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.globalize.cultures.implementations.GlobalizeExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.globalize.cultures.implementations.GlobalizeExclusionsModule;

	opens com.jwebmp.plugins.globalize.cultures to com.fasterxml.jackson.databind, com.jwebmp.core;
}
