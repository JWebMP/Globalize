package com.jwebmp.plugins.globalize.cultures;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Globalize page configurator — registers Globalize runtime scripts for
 * internationalization and localization support using Unicode CLDR data.
 */
@PluginInformation(pluginName = "Globalize",
                   pluginUniqueName = "globalize",
                   pluginDescription = "A JavaScript library for internationalization and localization that leverages the official Unicode CLDR JSON data.",
                   pluginVersion = "1.2.2",
                   pluginDependancyUniqueIDs = "jquery",
                   pluginCategories = "internalization, globalization, globalize",
                   pluginSubtitle = "Internationalization and localization using Unicode CLDR JSON data. Works in the browser and as a Node.js module.",
                   pluginGitUrl = "https://github.com/globalizejs/globalize",
                   pluginSourceUrl = "https://github.com/JWebMP/JWebMP",
                   pluginWikiUrl = "https://github.com/globalizejs/globalize/wiki",
                   pluginOriginalHomepage = "https://github.com/globalizejs/globalize",
                   pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/globalize",
                   pluginIconUrl = "",
                   pluginIconImageUrl = "",
                   pluginLastUpdatedDate = "2026/05/04",
                   pluginGroupId = "com.jwebmp.plugins",
                   pluginArtifactId = "globalize",
                   pluginModuleName = "com.jwebmp.plugins.globalize.cultures",
                   pluginStatus = PluginStatus.Released
)
@TsDependency(value = "globalize", version = "*")
@NgScript(value = "globalize/dist/globalize-runtime.js", sortOrder = 5)
@NgScript(value = "globalize/dist/globalize-runtime/currency.js", sortOrder = 6)
@NgScript(value = "globalize/dist/globalize-runtime/date.js", sortOrder = 7)
@NgScript(value = "globalize/dist/globalize-runtime/message.js", sortOrder = 8)
@NgScript(value = "globalize/dist/globalize-runtime/number.js", sortOrder = 9)
@NgScript(value = "globalize/dist/globalize-runtime/plural.js", sortOrder = 10)
@NgScript(value = "globalize/dist/globalize-runtime/relative-time.js", sortOrder = 11)
@NgScript(value = "globalize/dist/globalize-runtime/unit.js", sortOrder = 12)
public class GlobalizePageConfigurator
        implements IPageConfigurator<GlobalizePageConfigurator>
{
    private static boolean enabled = true;

    public static boolean isEnabled()
    {
        return GlobalizePageConfigurator.enabled;
    }

    public static void setEnabled(boolean mustEnable)
    {
        GlobalizePageConfigurator.enabled = mustEnable;
    }

    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return GlobalizePageConfigurator.enabled;
    }
}
