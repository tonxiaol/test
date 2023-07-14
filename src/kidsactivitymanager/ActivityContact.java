package kidsactivitymanager;

public class ActivityContact {

	private String name;
	private String phoneNumber;
	private String email;
        
	public ActivityContact() {
	}

	public ActivityContact(String name) {
            this.name = name;
	}
        
        public ActivityContact(String email, String name) {
            this.email = email;
            this.name = name;
	}
         
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		// TODO - implement ActivityContact.toString
		throw new UnsupportedOperationException();
	}

}