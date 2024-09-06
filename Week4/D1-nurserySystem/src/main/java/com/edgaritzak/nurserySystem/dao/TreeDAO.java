package com.edgaritzak.nurserySystem.dao;

import java.util.List;

import com.edgaritzak.nurserySystem.entity.Tree;

public interface TreeDAO {
	
	Tree insert(Tree tree);
	List<Tree> selectLike(String text);
	List<Tree> selectAll();
	Tree selectById(int id);
	Tree delete(int id);
	Tree update(Tree tree);
}
