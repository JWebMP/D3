package com.jwebmp.plugins.d3.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.HashSet;
import java.util.Set;

public class D3ExclusionsModule
		implements IGuiceScanModuleExclusions<D3ExclusionsModule>
{
	@Override
	public Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.d3");
		return strings;
	}
}
