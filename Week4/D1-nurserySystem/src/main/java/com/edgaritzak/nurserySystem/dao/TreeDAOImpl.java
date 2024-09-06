package com.edgaritzak.nurserySystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edgaritzak.nurserySystem.entity.Tree;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class TreeDAOImpl implements TreeDAO {
	
	EntityManager entityManager;
	
	@Autowired
	public TreeDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	@Override
	public Tree insert(Tree tree) {
		tree.setId(0);
		entityManager.persist(tree);
		return tree;
	}

	@Override
	public List<Tree> selectLike(String text) {
		TypedQuery<Tree> query = entityManager.createQuery("from Tree where name like ?1", Tree.class);
		query.setParameter(1, "%" + text + "%");
		return query.getResultList();
	}

	@Override
	public Tree selectById(int id) {
		return entityManager.find(Tree.class, id);
	}
	@Transactional
	@Override
	public Tree delete(int id) {
		entityManager.remove(entityManager.find(Tree.class, id));
		return entityManager.find(Tree.class, id);
	}
	@Transactional
	@Override
	public Tree update(Tree tree) {
		entityManager.merge(tree);
		return tree;
	}


	@Override
	public List<Tree> selectAll() {
		TypedQuery<Tree> query = entityManager.createQuery("from Tree", Tree.class);
		return query.getResultList();
	}

}
