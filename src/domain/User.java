package domain;

import java.sql.Date;

public class User {
	private int userId;
	private String userType;
	private String userName;
	private String password;
	private Date birthDate;
	private String gender;
	private String email;
	private String contact;
	private String address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User() {

	}
	
	

	public User(int userId, String userType, String userName, String password, Date birthDate, String gender,
			String email, String contact, String address) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.userName = userName;
		this.password = password;
		this.birthDate = birthDate;
		this.gender = gender;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", password=" + password
				+ ", birthDate=" + birthDate + ", gender=" + gender + ", email=" + email + ", contact=" + contact
				+ ", address=" + address + "]";
	}

}
