import com.jwebmp.plugins.globalize.cultures.implementations.GlobalizeModuleInclusions;

module com.jwebmp.plugins.globalize.cultures {
	exports com.jwebmp.plugins.globalize.cultures;

	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.jsonrepresentation;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.globalize.cultures.GlobalizePageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with GlobalizeModuleInclusions;

	opens com.jwebmp.plugins.globalize.cultures to com.fasterxml.jackson.databind, com.jwebmp.core;
}
