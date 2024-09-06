package com.edgaritzak.nurserySystemDataJPA.service;

import java.util.List;

import com.edgaritzak.nurserySystemDataJPA.entity.Tree;

public interface TreeService {
	
	//SELECT
	List<Tree> findNameLike(String text);
	List<Tree> findAll();
	Tree findById(int id);
	//INSERT
	Tree save(Tree tree);
	//UPDATE
	Tree update(Tree tree);
	//DELETE
	Tree deleteById(int id);

}
