package net_wei.myshoppingbackend.dao;

import java.util.List;

import net_wei.myshoppingbackend.dto.Category;

public interface CategoryDAO {
	
	Category get(int id);	
	List<Category> list();
	boolean add(Category category);
	boolean delete(Category category);
	boolean update(Category category);

}
