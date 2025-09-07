package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Skill;
import com.example.service.SkillService;

@RestController
public class SkillController {
	
	@Autowired
	SkillService skServe;
	
	@PostMapping("/skill/add")
	Skill addSkill(Skill skill)
	{
		return skServe.addSkill(skill);
	}
	
	@DeleteMapping("/skill/delete/{skillId}")
	void deleteSkill(@PathVariable int skillId)
	{
		skServe.deleteSkill(skillId);
	}
	
	Skill updateSkill(@RequestBody Skill skill)
	{
		return skServe.updateSkill(skill);
	}
	
	@GetMapping("/skill/getAll")
	List<Skill> getSkills()
	{
		return skServe.getSkills();
	}
	
	@GetMapping("/skill/getById/{skillId}")
	Skill getSkillById(@PathVariable int skillId)
	{
		return skServe.getSkillById(skillId);
	}
}
