package truckJob;

public class Company {
	private String Name;
	private String phoneNumber;
	private String address;
	public Company() {
		super();
	}
	public Company(String name, String phoneNumber, String address) {
		super();
		Name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
