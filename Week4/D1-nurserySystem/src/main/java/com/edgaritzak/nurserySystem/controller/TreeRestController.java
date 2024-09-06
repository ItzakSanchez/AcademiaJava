package com.edgaritzak.nurserySystem.controller;

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
import com.edgaritzak.nurserySystem.entity.Tree;
import com.edgaritzak.nurserySystem.service.TreeServiceImpl;

@RestController
@RequestMapping("/api")
public class TreeRestController {
	
	TreeServiceImpl tService;
	
	@Autowired
	public TreeRestController(TreeServiceImpl tService) {
		super();
		this.tService = tService;
	}
	
	@PostMapping("/addtree")
	public Tree insert(@RequestBody Tree tree) {
		tService.insert(tree);
		return tree;
	}
	
	
	@GetMapping("/treelist")
	public List<Tree> selectAll(){
		List<Tree> list = tService.selectAll();
		return list;
	}
	
	@GetMapping("/treelist/{treename}")
	public List<Tree> selectLike(@PathVariable("treename") String text){
		List<Tree> list = tService.selectLike(text);
		return list;
	}
	
	@GetMapping("/tree/{id}")
	public Tree selectById(@PathVariable("id") int id) {
		return tService.selectById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Tree delete(@PathVariable("id") int id) {
		Tree tree =tService.delete(id);
		return tree;
	}
	
	@PutMapping("/update")
	public Tree update(@RequestBody Tree tree) {
		Tree updatedTree = tService.update(tree);
		return updatedTree;
	}
}
