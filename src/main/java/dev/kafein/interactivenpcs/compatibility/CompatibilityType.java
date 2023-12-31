package dev.kafein.interactivenpcs.compatibility;

public enum CompatibilityType {
    VAULT("Vault"),
    PLACEHOLDER_API("PlaceholderAPI"),
    CITIZENS("Citizens");

    private final String pluginName;

    CompatibilityType(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getPluginName() {
        return this.pluginName;
    }
}
