package OOPS_EncapSulation;

public class InternetBrowser {
	
	private String name;
	private String version;
	private String plugin;
	
	
	public InternetBrowser(String name, String version, String plugin) {
		this.name = name;
		this.version = version;
		this.plugin = plugin;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getPlugin() {
		return plugin;
	}


	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}
	
	
	
	
	
	

}
