import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.globalize.cultures.GlobalizePageConfigurator;

module com.jwebmp.plugins.globalize.cultures {
	exports com.jwebmp.plugins.globalize.cultures;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with GlobalizePageConfigurator;
	opens com.jwebmp.plugins.globalize.cultures to com.fasterxml.jackson.databind,com.jwebmp.core;
}
