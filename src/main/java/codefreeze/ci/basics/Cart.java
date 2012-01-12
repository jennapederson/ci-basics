package codefreeze.ci.basics;

import java.util.HashMap;
import java.util.Map;

import com.ibm.icu.math.BigDecimal;

public class Cart {

	private Map<String, CartItem> items = new HashMap<String, CartItem>();
	
	public void addItem(String sku, int quantity, BigDecimal unitPrice) {
		items.put(sku, new CartItem(sku, quantity, unitPrice));
	}
	
	public void removeItem(String sku) {
		items.remove(sku);
	}
	
	public void updateItemQuantity(String sku, int newQuantity) {
		CartItem item = items.get(sku);
		item.setQuantity(newQuantity);
	}
	
	public int getNumberOfItems() {
		return items.size();
	}
	
	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (CartItem item : items.values()) {
			total = total.add(item.getItemTotal());
		}
		return total;
	}
	
}
