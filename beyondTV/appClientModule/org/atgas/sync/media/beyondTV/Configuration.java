package org.atgas.sync.media.beyondTV;

public enum Configuration {
	USERNAME("The name of the BeyondTV user", true),
	PASSWORD("The password for the user", true),
	LICENSE("The license key of the server", true);

	public final String description;
	public final boolean required;
	public final String defaultValue;
	public final String propertyName;
	
	private Configuration(String description, boolean required) {
		this(description, required, null);
	}
	
	private Configuration(String description, boolean required, String defaultValue) {
		this.description = description;
		this.required = required;
		this.defaultValue = defaultValue;
		this.propertyName = name().toLowerCase();
	}
}
