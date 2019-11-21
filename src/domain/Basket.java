package domain;

public class Basket {
	private int basketId;
	private int userId;
	private int productId;
	private int numbers;
	private int validiry;

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
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

	public int getValidiry() {
		return validiry;
	}

	public void setValidiry(int validiry) {
		this.validiry = validiry;
	}

	public Basket(int basketId, int userId, int productId, int numbers, int validiry) {
		super();
		this.basketId = basketId;
		this.userId = userId;
		this.productId = productId;
		this.numbers = numbers;
		this.validiry = validiry;
	}

	public Basket() {

	}

	@Override
	public String toString() {
		return "Basket [basketId=" + basketId + ", userId=" + userId + ", productId=" + productId + ", numbers="
				+ numbers + ", validiry=" + validiry + "]";
	}

}
