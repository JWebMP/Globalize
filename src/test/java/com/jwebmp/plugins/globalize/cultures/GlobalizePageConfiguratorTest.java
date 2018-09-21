package com.jwebmp.plugins.globalize.cultures;

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

public class GlobalizePageConfiguratorTest
{

	@Test
	public void enabled()
	{
		Page p = new Page();
		GlobalizePageConfigurator.setEnabled(true);


	}
}