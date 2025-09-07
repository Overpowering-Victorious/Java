package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Skill;
import com.example.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	SkillRepository skRepo;
	
	@Override
	public Skill addSkill(Skill skill) {
		return skRepo.save(skill);
	}

	@Override
	public void deleteSkill(int skillId) {
		skRepo.deleteById(skillId);
	}

	@Override
	public Skill updateSkill(Skill skill) {
		Optional<Skill> op=skRepo.findById(skill.getSkillId());
		if(op.isPresent())
		{
			Skill sk=op.get();
			sk=skill;
			return skRepo.save(sk);
		}
		else
			return null;
	}

	@Override
	public List<Skill> getSkills() {
		return skRepo.findAll();
	}

	@Override
	public Skill getSkillById(int skillId) {
		return skRepo.findById(skillId).orElseThrow(()-> new RuntimeException("Skill not found"));
	}

}
