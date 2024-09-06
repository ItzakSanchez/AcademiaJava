package com.edgaritzak.nurserySystemDataJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.edgaritzak.nurserySystemDataJPA.entity.Tree;

public interface TreeRepository extends JpaRepository<Tree,Integer>{
	
	// CUSTOM METHOD SELECT LIKE();
	 @Query("Select t from Tree t where t.name like :name")
     List<Tree> findNameLike(@Param("name")String name);
}
