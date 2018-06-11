package net_wei.myshoppingbackend.dao;

import java.util.List;

import net_wei.myshoppingbackend.dto.Address;
import net_wei.myshoppingbackend.dto.Cart;
import net_wei.myshoppingbackend.dto.User;

public interface UserDAO {
	
	boolean addUser(User user);
	boolean addAddress(Address address);
	Address getBillingAddress(User user);
	List<Address> listShippingAddress(User user);
	boolean updateCart(Cart cart);
	User getByEmail(String email);
}
