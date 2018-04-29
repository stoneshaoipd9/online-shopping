package net_wei.myshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net_wei.myshoppingbackend.dao.CategoryDAO;
import net_wei.myshoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	static private List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();	
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is a description of TV");
		category.setImageURL("CAT_1.png");		
		categories.add(category);

	    category = new Category();	
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a description of mobile");
		category.setImageURL("CAT_2.png");		
		categories.add(category);

		category = new Category();	
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a description of laptop");
		category.setImageURL("CAT_3.png");		
		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories) {
			if(category.getId() == id)	return category;
		}
		return null;
	}

}
