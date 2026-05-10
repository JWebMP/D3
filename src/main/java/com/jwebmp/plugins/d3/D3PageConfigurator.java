package com.jwebmp.plugins.d3;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for D3.js — data-driven document manipulation library.
 */
@PluginInformation(pluginName = "D3 Graphing",
		pluginUniqueName = "d3",
		pluginDescription = "D3.js is a JavaScript library for manipulating documents based on data. D3 helps you bring data to life using HTML, SVG, and CSS.",
		pluginVersion = "7.9.0",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "d3, graphing, reports, graphs, svg",
		pluginSubtitle = "Create stunning graphs using the D3 toolkit.",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "https://github.com/d3/d3",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "https://d3js.org/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/d3",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "d3",
		pluginModuleName = "com.jwebmp.plugins.d3",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "d3", version = "^7.9.0")
@NgScript("node_modules/d3/dist/d3.min.js")
public class D3PageConfigurator
		implements IPageConfigurator<D3PageConfigurator>
{
	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
