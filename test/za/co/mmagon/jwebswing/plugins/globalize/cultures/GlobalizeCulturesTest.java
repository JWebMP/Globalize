package za.co.mmagon.jwebswing.plugins.globalize.cultures;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.Page;

public class GlobalizeCulturesTest
{
	@Test
	public void AToString()
	{
		System.out.println(GlobalizeCultures.af_ZA.toString());
	}

	@Test
	public void APage()
	{
		Page p = new Page();
		System.out.println(p.toString(0));
	}
}
