package net_wei.myshoppingbackend.dao;

import java.util.List;

import net_wei.myshoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
