package org.atgas.sync.media.beyondtv;

public enum Configuration {
	COMMAND("The command to execute", true),
	USERNAME("The name of the beyondtv user", true),
	PASSWORD("The password for the user", true),
	LICENSE("The license key of the server", true),
	FIELD_SEPERATOR("The string used to seperate field in a report", false, "@%!%@"),
	WATCHED_STATUS_FILE("The file that the watched status is stored in", false,"watched.csv");

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
