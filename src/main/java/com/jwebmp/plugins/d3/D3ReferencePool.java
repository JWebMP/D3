package com.jwebmp.plugins.d3;

import com.jwebmp.core.base.references.JavascriptReference;

/**
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
public enum D3ReferencePool
{

	D3(new JavascriptReference("d3", 1.0, "bower_components/d3/d3.min.js")),
	D3Layout(new JavascriptReference("d3Layout", 1.0, "d3custom/d3.layout.js")),
	;

	private final JavascriptReference reference;

	D3ReferencePool(JavascriptReference reference)
	{
		this.reference = reference;

	}

	/**
	 * Returns the reference for this tree
	 * <p>
	 *
	 * @return
	 */
	public JavascriptReference getReference()
	{
		return reference;
	}

}
