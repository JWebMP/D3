import com.jwebmp.plugins.d3.implementations.D3InclusionsModule;

module com.jwebmp.plugins.d3 {
	exports com.jwebmp.plugins.d3;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.d3.D3PageConfigurator;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with D3InclusionsModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.d3.implementations.D3ExclusionsModule;

	opens com.jwebmp.plugins.d3 to tools.jackson.databind, com.google.guice, com.jwebmp.core;
}
