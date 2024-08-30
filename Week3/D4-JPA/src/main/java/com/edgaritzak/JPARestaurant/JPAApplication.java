package com.edgaritzak.JPARestaurant;

import com.edgaritzak.JPARestaurant.dao.MenuItemDAO;
import com.edgaritzak.JPARestaurant.entity.*;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPAApplication {

	public static void main(String[] args) {
		SpringApplication.run(JPAApplication.class, args);
		
	}
	@Bean
	public CommandLineRunner commandLineRunner(MenuItemDAO menuItemDAO){
		return runner -> {
			//Run test methods
			selectById(menuItemDAO);
			selectAll(menuItemDAO);
			selectNameLike(menuItemDAO);
			insertIntoTable(menuItemDAO);
			update(menuItemDAO);
			delete(menuItemDAO);
		};
	}
	
	//Create test methods
	//SELECT
	static void selectById(MenuItemDAO menuItemDAO) {
		MenuItem item =menuItemDAO.selectById(5);
		System.out.println(item.toString());
	}
	static void selectAll(MenuItemDAO menuItemDAO) {
		List<MenuItem> miList;
		miList =menuItemDAO.selectAll();
		miList.forEach(x-> System.out.println(x.toString()));
	}
	static void selectNameLike(MenuItemDAO menuItemDAO) {
		List<MenuItem> miList;
		miList = menuItemDAO.selectNameLike("Salad");
		System.out.println("-------------------------------PRINT SALADS-------------------------------");
		miList.forEach(x-> System.out.println(x.toString()));
	}
	//INSERT
	static void insertIntoTable(MenuItemDAO menuItemDAO) {
		MenuItem newItem = new MenuItem("Lentil Soup", "Hearty and flavorful lentil soup with carrots, celery, and spices", "Appetizer", 7.99);
		menuItemDAO.insertIntoTable(newItem);
	}
	//UPDATE
	static void update(MenuItemDAO menuItemDAO) {
		MenuItem item = menuItemDAO.selectById(1);
		item.setPrice(9.99);
		menuItemDAO.update(item);
	}
	//DELETE
	static void delete(MenuItemDAO menuItemDAO) {
		menuItemDAO.deleteById(10);
	}
}
