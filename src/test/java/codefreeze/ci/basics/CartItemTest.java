package codefreeze.ci.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ibm.icu.math.BigDecimal;


public class CartItemTest {
	
	@Test
	public void testGetItemTotalReturnsUnitPriceTimesQuantity() {
		CartItem item = new CartItem("123", 5, BigDecimal.TEN);
		assertEquals(BigDecimal.valueOf(50), item.getItemTotal());
	}
	
//	@Test(expected=IllegalArgumentException.class)
//	public void testConstructorDoesNotAllowZeroQuantity() {
//		new CartItem("123", 0, BigDecimal.TEN);
//	}
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void testConstructorDoesNotAllowNegativeQuantity() {
//		new CartItem("123", -1, BigDecimal.TEN);
//	}
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void testConstructorDoesNotAllowNegativeUnitPrice() {
//		new CartItem("123", 1, BigDecimal.valueOf(-10));
//	}

}
