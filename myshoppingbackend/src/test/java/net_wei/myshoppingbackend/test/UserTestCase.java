package net_wei.myshoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net_wei.myshoppingbackend.dao.UserDAO;
import net_wei.myshoppingbackend.dto.Address;
import net_wei.myshoppingbackend.dto.Cart;
import net_wei.myshoppingbackend.dto.User;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Address address = null;
	private Cart cart = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net_wei.myshoppingbackend");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");
	}
	/*
	 * @Test public void testAdd() { user = new User(); user.setFirstName("Cindy");
	 * user.setLastName("Shao"); user.setEmail("cs@gmail.com");
	 * user.setContactNumber("1234512345"); user.setRole("USER");
	 * user.setPassword("123456");
	 * 
	 * assertEquals("Failed to add user!", true, userDAO.addUser(user));
	 * 
	 * address = new Address(); address.setAddressLineOne("101 St-louse");
	 * address.setAddressLineTwo("Near IGA Store"); address.setCity("Lachine");
	 * address.setState("Quebec"); address.setCountry("Canada");
	 * address.setPostalCode("h9w 2l3"); address.setBilling(true);
	 * 
	 * address.setUserId(user.getId()); assertEquals("Failed to add address!", true,
	 * userDAO.addAddress(address));
	 * 
	 * if (user.getRole().equals("USER")) { cart = new Cart(); cart.setUser(user);
	 * assertEquals("Failed to add cart!", true, userDAO.addCart(cart));
	 * 
	 * address = new Address(); address.setAddressLineOne("201 St-Marie");
	 * address.setAddressLineTwo("Near Walmart"); address.setCity("Kirkland");
	 * address.setState("Quebec"); address.setCountry("Canada");
	 * address.setPostalCode("h9j 5z6"); address.setShipping(true);
	 * 
	 * address.setUserId(user.getId());
	 * assertEquals("Failed to add shipping address!", true,
	 * userDAO.addAddress(address)); } }
	 */

	/*
	 * @Test public void testAdd() { user = new User(); user.setFirstName("Cindy");
	 * user.setLastName("Shao"); user.setEmail("cs@gmail.com");
	 * user.setContactNumber("1234512345"); user.setRole("USER");
	 * user.setPassword("123456");
	 * 
	 * if (user.getRole().equals("USER")) { cart = new Cart(); cart.setUser(user);
	 * user.setCart(cart); }
	 * 
	 * assertEquals("Failed to add user!", true, userDAO.addUser(user));
	 * 
	 * }
	 */
	/*
	 * @Test public void testUpdateCart() {
	 * 
	 * user = userDAO.getByEmail("cs@gmail.com"); 
	 * cart = user.getCart();
	 * cart.setGrandTotal(1024); cart.setCartLines(3);
	 * assertEquals("Failed to update cart!", true, userDAO.updateCart(cart)); }
	 */
/*
	@Test
	public void testAddAddress() {

		user = new User();
		user.setFirstName("Cindy");
		user.setLastName("Shao");
		user.setEmail("cs@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("123456");

		assertEquals("Failed to add user!", true, userDAO.addUser(user));

		address = new Address();
		address.setAddressLineOne("101 St-louse");
		address.setAddressLineTwo("Near IGA Store");
		address.setCity("Lachine");
		address.setState("Quebec");
		address.setCountry("Canada");
		address.setPostalCode("h9w 2l3");
		address.setBilling(true);

		address.setUser(user);
		assertEquals("Failed to add address!", true, userDAO.addAddress(address));

		address = new Address();
		address.setAddressLineOne("201 St-Marie");
		address.setAddressLineTwo("Near Walmart");
		address.setCity("Kirkland");
		address.setState("Quebec");
		address.setCountry("Canada");
		address.setPostalCode("h9j 5z6");
		address.setShipping(true);

		address.setUser(user);
		assertEquals("Failed to add shipping address!", true, userDAO.addAddress(address));

	}
*/
	
	@Test
	public void testUpdateAddress() {

		user = userDAO.getByEmail("cs@gmail.com"); 

		address = new Address();
		address.setAddressLineOne("111 St-louse");
		address.setAddressLineTwo("Near IGA Store");
		address.setCity("Beaconsfield");
		address.setState("Quebec");
		address.setCountry("Canada");
		address.setPostalCode("h9w 2l3");
		address.setBilling(true);

		address.setUser(user);
		assertEquals("Failed to add address!", true, userDAO.addAddress(address));
	}	
}