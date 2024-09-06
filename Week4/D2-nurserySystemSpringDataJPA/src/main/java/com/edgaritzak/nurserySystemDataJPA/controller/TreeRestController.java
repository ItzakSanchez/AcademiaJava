package com.edgaritzak.nurserySystemDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgaritzak.nurserySystemDataJPA.entity.Tree;
import com.edgaritzak.nurserySystemDataJPA.service.TreeServiceImpl;

@RestController
@RequestMapping("/api")
public class TreeRestController {
	
	TreeServiceImpl treeService;
	
	@Autowired
	public TreeRestController(TreeServiceImpl treeService) {
		super();
		this.treeService = treeService;
	}
	
	
	//SELECT 
	@GetMapping("/treelist")
	public List<Tree> selectAll(){
		List<Tree> list = treeService.findAll();
		return list;
	}
	//SELECT 
	@GetMapping("/treelist/{treename}")
	public List<Tree> selectLike(@PathVariable("treename") String text){
		List<Tree> list = treeService.findNameLike(text);
		return list;
	}
	//SELECT 
	@GetMapping("/tree/{id}")
	public Tree selectById(@PathVariable("id") int id) {
		return treeService.findById(id);
	}
	
	//INSERT
	@PostMapping("/addtree")
	public Tree insert(@RequestBody Tree tree) {
		treeService.save(tree); 
		return tree;
	}
	
	//UPDATE
	@PutMapping("/update")
	public Tree update(@RequestBody Tree tree) {
		Tree updatedTree = treeService.update(tree);
		return updatedTree;
	}
	
	//DELETE
	@DeleteMapping("/delete/{id}")
	public Tree delete(@PathVariable("id") int id) {
		return treeService.deleteById(id);
	}
}
