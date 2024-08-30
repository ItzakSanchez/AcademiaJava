package com.edgaritzak.JPARestaurant.dao;
import java.util.List;

import com.edgaritzak.JPARestaurant.entity.MenuItem;

public interface MenuItemDAO {
	
	//Select
	List<MenuItem> selectAll();
	List<MenuItem> selectNameLike(String text);
	MenuItem selectById(int id);
	
	//Insert
	void insertIntoTable(MenuItem item);
	
	//Update
	void update(MenuItem item);
	
	//Delete
	void deleteById(int id);
	
}
