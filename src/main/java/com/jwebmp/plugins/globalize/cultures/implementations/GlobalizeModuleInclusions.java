package com.jwebmp.plugins.globalize.cultures.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.Set;

public class GlobalizeModuleInclusions implements IGuiceScanModuleInclusions<GlobalizeModuleInclusions>
{
    @Override
    public Set<String> includeModules()
    {
        return Set.of("com.jwebmp.plugins.globalize.cultures");
    }
}
