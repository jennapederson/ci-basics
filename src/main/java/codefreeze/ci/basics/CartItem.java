package codefreeze.ci.basics;

import com.ibm.icu.math.BigDecimal;

public class CartItem {

	private String sku;
	private int quantity;
	private BigDecimal unitPrice;

	public CartItem(String sku, int quantity, BigDecimal unitPrice) {
		if (quantity <= 0) {
			throw new IllegalArgumentException();
		}
		if (unitPrice.signum() < 0) {
			throw new IllegalArgumentException();
		}
		this.sku = sku;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public BigDecimal getItemTotal() {
		return this.unitPrice.multiply(BigDecimal.valueOf(this.quantity));
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
