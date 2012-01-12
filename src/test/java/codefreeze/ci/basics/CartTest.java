package codefreeze.ci.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ibm.icu.math.BigDecimal;


public class CartTest {
	
	@Test
	public void testGetCartTotalWhenEmptyIsZero() {
		Cart cart = new Cart();
		assertEquals(BigDecimal.ZERO, cart.getTotal());
	}
	
	@Test
	public void testGetNumberOfItemsWhenEmptyIsZero() {
		Cart cart = new Cart();
		assertEquals(0, cart.getNumberOfItems());
	}
	
	@Test
	public void testAddItemIncrementsNumberOfItems() {
		Cart cart = new Cart();
		assertEquals(0, cart.getNumberOfItems());
		cart.addItem("123", 1, BigDecimal.TEN);
		assertEquals(1, cart.getNumberOfItems());
	}
//	
//	@Test
//	public void testAddItemIncrementsTotal() {
//		Cart cart = new Cart();
//		assertEquals(BigDecimal.ZERO, cart.getTotal());
//		cart.addItem("123", 1, BigDecimal.TEN);
//		assertEquals(BigDecimal.TEN, cart.getTotal());
//	}
//	
//	@Test
//	public void testRemoveItemDecrementsNumberOfItems() {
//		Cart cart = new Cart();
//		cart.addItem("123", 1, BigDecimal.TEN);
//		assertEquals(1, cart.getNumberOfItems());
//		cart.removeItem("123");
//		assertEquals(0, cart.getNumberOfItems());
//	}
//	
//	@Test
//	public void testRemoveItemDecrementsTotal() {
//		Cart cart = new Cart();
//		cart.addItem("123", 1, BigDecimal.TEN);
//		assertEquals(BigDecimal.TEN, cart.getTotal());
//		cart.removeItem("123");
//		assertEquals(BigDecimal.ZERO, cart.getTotal());
//	}
//	
//	@Test
//	public void testUpdateItemQuantityImcrementsTotal() {
//		Cart cart = new Cart();
//		cart.addItem("123", 1, BigDecimal.TEN);
//		assertEquals(BigDecimal.TEN, cart.getTotal());
//		cart.updateItemQuantity("123", 5);
//		assertEquals(BigDecimal.valueOf(50), cart.getTotal());
//	}
}
