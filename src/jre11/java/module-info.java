import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.globalize.cultures.GlobalizePageConfigurator;
import com.jwebmp.plugins.globalize.cultures.implementations.GlobalizeExclusionsModule;

module com.jwebmp.plugins.globalize.cultures {
	exports com.jwebmp.plugins.globalize.cultures;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with GlobalizePageConfigurator;

	provides IGuiceScanJarExclusions with GlobalizeExclusionsModule;
	provides IGuiceScanModuleExclusions with GlobalizeExclusionsModule;

	opens com.jwebmp.plugins.globalize.cultures to com.fasterxml.jackson.databind, com.jwebmp.core;
}
