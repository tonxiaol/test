package kidsactivitymanager;

public class Address {

	private String street;
	private String city;
	private String province;
	private String postalCode;

	
	public Address() {
	}

	public Address(String street, String city, String province, String postalCode) {
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}