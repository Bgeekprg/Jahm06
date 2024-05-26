package tns.country;

public class Country {
	private String country;
	public Country()
	{
		this.country="";
	}
	public Country(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	@Override
	public String toString() {
		return "Country [country=" + country + "]";
	}
	
}
