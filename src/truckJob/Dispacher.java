package truckJob;

public class Dispacher {
	private String name;
	private String surName;
	private String phone;
	private String mail;
	public Dispacher() {
		super();
	}
	public Dispacher(String name, String surName, String phone, String mail) {
		super();
		this.name = name;
		this.surName = surName;
		this.phone = phone;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
