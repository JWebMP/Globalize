import com.guicedee.client.services.config.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.globalize.cultures.GlobalizePageConfigurator;
import com.jwebmp.plugins.globalize.cultures.implementations.GlobalizeModuleInclusions;

module com.jwebmp.plugins.globalize.cultures {
    exports com.jwebmp.plugins.globalize.cultures;

    requires transitive com.jwebmp.core.base.angular.client;
    requires com.jwebmp.client;
    requires com.guicedee.jsonrepresentation;

    provides IPageConfigurator with GlobalizePageConfigurator;
    provides IGuiceScanModuleInclusions with GlobalizeModuleInclusions;

    opens com.jwebmp.plugins.globalize.cultures to com.fasterxml.jackson.databind, com.jwebmp.core, com.google.guice, com.jwebmp.core.angular;
    opens com.jwebmp.plugins.globalize.cultures.implementations to com.google.guice;
}
