package com.staragile.healtcare;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HealthServices {
	
	@Autowired
	HealthDAORepository healthDAORepository; 
	
	public List<Health> getHealth()
	{
		List<Health> healthList = new ArrayList<Health>();
		healthDAORepository.findAll().forEach(healthList::add);
		return healthList;
	}
	
	public void registerDoctor(Health health)
	{
		healthDAORepository.save(health);
	}
	
	public Optional<Health> searchDoctor(String doctorRegNo)
	{
		return healthDAORepository.findById(doctorRegNo);
	}
	
	public void updateDoctor(String id, Health health)
	{
		healthDAORepository.save(health);
	}
	
	public void deleteDoctor(String id)
	{
		healthDAORepository.deleteById(id);
	}
}
