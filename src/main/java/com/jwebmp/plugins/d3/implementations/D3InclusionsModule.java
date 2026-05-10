package com.jwebmp.plugins.d3.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class D3InclusionsModule implements IGuiceScanModuleInclusions<D3InclusionsModule>
{
	@Override
	public Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.d3");
		return set;
	}
}
