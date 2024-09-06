package com.edgaritzak.nurserySystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgaritzak.nurserySystem.entity.Tree;
import com.edgaritzak.nurserySystem.dao.TreeDAOImpl;


@Service
public class TreeServiceImpl implements TreeService {
	
	private TreeDAOImpl treeDAOImpl;
	
	@Autowired
	public TreeServiceImpl(TreeDAOImpl treeDAOImpl) {
		this.treeDAOImpl = treeDAOImpl;
	}

	@Override
	public Tree insert(Tree tree) {
		treeDAOImpl.insert(tree);
		return tree;
	}

	@Override
	public List<Tree> selectLike(String text) {
		return treeDAOImpl.selectLike(text);
	}

	@Override
	public Tree selectById(int id) {
		Tree tree;
		Optional<Tree> container = Optional.of(treeDAOImpl.selectById(id));
		
		if(container.isPresent()) {
			tree = container.get();
		} else {
			throw new RuntimeException("Did not find tree id - " + id);
		}
		return tree;
	}

	@Override
	public Tree delete(int id) {
		Tree tree = treeDAOImpl.delete(id);
		return tree;
	}

	@Override
	public Tree update(Tree tree) {
		treeDAOImpl.update(tree);
		return tree;
	}

	@Override
	public List<Tree> selectAll() {
		List<Tree> myList = treeDAOImpl.selectAll();
		return myList;
	}

}
