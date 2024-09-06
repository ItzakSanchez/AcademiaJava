package com.edgaritzak.nurserySystem.service;

import java.util.List;

import com.edgaritzak.nurserySystem.entity.Tree;

public interface TreeService {
	
	Tree insert(Tree tree);
	List<Tree> selectLike(String text);
	List<Tree> selectAll();
	Tree selectById(int id);
	Tree delete(int id);
	Tree update(Tree tree);
}
