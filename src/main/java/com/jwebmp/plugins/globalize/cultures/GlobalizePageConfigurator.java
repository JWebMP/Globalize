/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.globalize.cultures;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "Globalize",
		pluginUniqueName = "globalize",
		pluginDescription = "A JavaScript library for internationalization and localization that leverages the official Unicode CLDR JSON data ",
		pluginVersion = "1.2.2",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "internalization, globalization, globalize",
		pluginSubtitle = "A JavaScript library for internationalization and localization that leverage the official Unicode CLDR JSON data. The library works both for the browser and as a Node.js module.",
		pluginGitUrl = "https://github.com/globalizejs/globalize",
		pluginSourceUrl = "https://github.com/GedMarc/JWebMP-GlobalizePlugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-GlobalizePlugin/wiki",
		pluginOriginalHomepage = "https://github.com/globalizejs/globalize",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/GlobalizePlugin.jar/download",
		pluginIconUrl = "bower_components/globalize/icon.png",
		pluginIconImageUrl = "bower_components/globalize/example.png",
		pluginLastUpdatedDate = "2017/03/04")
public class GlobalizePageConfigurator
		implements IPageConfigurator<GlobalizePageConfigurator>
{
	/**
	 * The core java script reference
	 */
	private static final JavascriptReference coreReference = new JavascriptReference("Globalize Core Reference", 1.11, "bower_components/globalize/dist/globalize.min.js", 300);
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return GlobalizePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		GlobalizePageConfigurator.enabled = mustEnable;
	}

	/**
	 * Method configure ...
	 *
	 * @param page
	 * 		of type Page
	 *
	 * @return Page
	 */
	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .addJavaScriptReference(getJavascriptReference());
		}
		return page;
	}

	/**
	 * Returns the core reference
	 *
	 * @return JavascriptReference
	 */
	public static JavascriptReference getJavascriptReference()
	{
		return coreReference;
	}

	/**
	 * If this page configurator is enabled
	 *
	 * @return if the configuration must run
	 */
	@Override
	public boolean enabled()
	{
		return GlobalizePageConfigurator.enabled;
	}

}
