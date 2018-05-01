package net_wei.myshoppingbackend.dao;

import java.util.List;

import net_wei.myshoppingbackend.dto.Product;

public interface ProductDAO {
	Product get(int id);	
	List<Product> list();
	boolean add(Product product);
	boolean delete(Product product);
	boolean update(Product product);

	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);

}
