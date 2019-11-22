package domain;

public class Payment {
	private int paymentId;
	private int userId;
	private int productId;
	private int numbers;
	private String address;
	private String contact;
	private String creditcardnumber;
	private String creditcardpassword;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreditcardnumber() {
		return creditcardnumber;
	}

	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	public String getCreditcardpassword() {
		return creditcardpassword;
	}

	public void setCreditcardpassword(String creditcardpassword) {
		this.creditcardpassword = creditcardpassword;
	}

	public Payment(int paymentId, int userId, int productId, int numbers, String address, String contact,
			String creditcardnumber, String creditcardpassword) {
		super();
		this.paymentId = paymentId;
		this.userId = userId;
		this.productId = productId;
		this.numbers = numbers;
		this.address = address;
		this.contact = contact;
		this.creditcardnumber = creditcardnumber;
		this.creditcardpassword = creditcardpassword;
	}

	public Payment() {

	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", userId=" + userId + ", productId=" + productId + ", numbers="
				+ numbers + ", address=" + address + ", contact=" + contact + ", creditcardnumber=" + creditcardnumber
				+ ", creditcardpassword=" + creditcardpassword + "]";
	}

}
