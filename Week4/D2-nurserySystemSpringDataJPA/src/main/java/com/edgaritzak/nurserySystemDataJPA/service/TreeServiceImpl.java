package com.edgaritzak.nurserySystemDataJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgaritzak.nurserySystemDataJPA.dao.TreeRepository;
import com.edgaritzak.nurserySystemDataJPA.entity.Tree;


@Service
public class TreeServiceImpl implements TreeService {
	
	private TreeRepository treeDAO;
	
	@Autowired
	public TreeServiceImpl(TreeRepository treeDAO) {
		this.treeDAO = treeDAO;
	}

	//SELECT ALL
		@Override
		public List<Tree> findAll() {
			List<Tree> myList = treeDAO.findAll(); //SPRING DATA JPA METHOD
			return myList;
		}

	//SELECT LIKE 
	@Override
	public List<Tree> findNameLike(String text) {
		return treeDAO.findNameLike(text); //SPRING DATA JPA METHOD (CUSTOP QUERY)
	}

	//SELECT BY ID
	@Override
	public Tree findById(int id) {
		Tree tree;
		Optional<Tree> container = (treeDAO.findById(id)); //SPRING DATA JPA METHOD
		
		if(container.isPresent()) {
			tree = container.get();
		} else {
			throw new RuntimeException("Did not find tree id - " + id);
		}
		return tree;
	}

	//INSERT
		@Override
		public Tree save(Tree tree) {
			treeDAO.save(tree); //SPRING DATA JPA METHOD
			return tree;
		}

	//UPDATE
	@Override
	public Tree update(Tree tree) {
		Tree treeidToCompare = treeDAO.findById(tree.getId()) .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));;
		return treeDAO.save(treeidToCompare); //SPRING DATA JPA METHOD
	}

	//DELETE
	@Override
	public Tree deleteById(int id) {
		Optional<Tree> tempTree = treeDAO.findById(id); //SPRING DATA JPA METHOD
		if(tempTree.isPresent()) {
			treeDAO.deleteById(id); //SPRING DATA JPA METHOD
			return tempTree.get();
		} else {
			throw new IllegalStateException("Error - ID not found");
		}
	}
}
