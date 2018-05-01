package net_wei.myshoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net_wei.myshoppingbackend.dao.CategoryDAO;
import net_wei.myshoppingbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net_wei.myshoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
//	@Test
//	public void testAddCategory() {
//		category = new Category();
//		category.setName("TV");
//		category.setDescription("This is a description of TV");
//		category.setImageURL("CAT_4.png");
//		
//		assertEquals("Operation(add into table) Successfully", true, categoryDAO.add(category));
//	}
	
//	@Test
//	public void testGetCategory() {
//		category = categoryDAO.get(1);
//		assertEquals("Operation(get element by id from table) Successfully", "Television", category.getName());
//	}
	
//	@Test
//	public void testUpdateCategory() {
//		category = categoryDAO.get(1);
//		category.setName("TV");
//		assertEquals("Operation(update element in table) Successfully", true, categoryDAO.update(category));
//	}

//	@Test
//	public void testDeleteCategory() {
//		category = categoryDAO.get(1);
//		assertEquals("Operation(delete element in table) Successfully", true, categoryDAO.delete(category));
//	}
	
//	@Test
//	public void testListCategory() {
//		assertEquals("Operation(fetch list from table) Successfully", 2, categoryDAO.list().size());
//	}

	@Test
	public void testCRUDCategory() {
		//add
		category = new Category();
		category.setName("Television");
		category.setDescription("This is a description of Television");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Operation(add into table) Successfully", true, categoryDAO.add(category));
	
		category = new Category();
		category.setName("Mobile");
		category.setDescription("This is a description of Mobile");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Operation(add into table) Successfully", true, categoryDAO.add(category));
	
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is a description of Laptop");
		category.setImageURL("CAT_3.png");
		
		assertEquals("Operation(add into table) Successfully", true, categoryDAO.add(category));
	
		category = new Category();
		category.setName("Television");
		category.setDescription("This is a description of Television");
		category.setImageURL("CAT_4.png");
		
		assertEquals("Operation(add into table) Successfully", true, categoryDAO.add(category));
		
		//update
		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Operation(update element in table) Successfully", true, categoryDAO.update(category));
	
		//delete
		assertEquals("Operation(delete element in table) Successfully", true, categoryDAO.delete(category));

		//list
		assertEquals("Operation(fetch list from table) Successfully", 3, categoryDAO.list().size());
	}
}
