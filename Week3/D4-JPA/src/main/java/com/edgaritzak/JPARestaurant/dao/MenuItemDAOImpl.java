package com.edgaritzak.JPARestaurant.dao;

import java.util.List;
import com.edgaritzak.JPARestaurant.entity.MenuItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class MenuItemDAOImpl implements MenuItemDAO {

	private EntityManager entityMNGR;
	@Autowired
	public MenuItemDAOImpl(EntityManager entityMNGR) {
		this.entityMNGR = entityMNGR;
	}
//	
//	SELECT
//	
	@Override
	public List<MenuItem> selectAll() {
		TypedQuery<MenuItem> query = entityMNGR.createQuery("FROM MenuItem", MenuItem.class);
		return query.getResultList();
	}

	@Override
	public List<MenuItem> selectNameLike(String text) {
		TypedQuery<MenuItem> query = entityMNGR.createQuery("FROM MenuItem where name like :text",MenuItem.class);
		query.setParameter("text", "%"+text+"%");
		return query.getResultList();
	}

	@Override
	public MenuItem selectById(int id) {
		return entityMNGR.find(MenuItem.class, id);
	}
//
//	INSERT
//	
	@Transactional
	@Override
	public void insertIntoTable(MenuItem item) {
		entityMNGR.persist(item);
	}
//	
//	UPDATE
//	
	@Transactional
	@Override
	public void update(MenuItem item) {
		entityMNGR.merge(item);
	}
//	
//	DELETE
//	
	@Transactional
	@Override
	public void deleteById(int id) {
		entityMNGR.remove(entityMNGR.find(MenuItem.class, id));
	}

}
