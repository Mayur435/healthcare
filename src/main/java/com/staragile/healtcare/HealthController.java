package com.staragile.healtcare;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HealthController {
	
	@Autowired
	HealthServices healthServices;
	
	@RequestMapping("hello")
	public String doSomething()
	{
		return "hello world";
	}
	
	@RequestMapping("health")
	public List<Health> getHealth()
	{
		return healthServices.getHealth();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "health")
	public String registerDoctor(@RequestBody Health health)
	{
		healthServices.registerDoctor(health);
		return "Value added ";
	}
	
	@RequestMapping("health/{doctorRegNo}")
	public Optional<Health> searchDoctor(@PathVariable String doctorRegNo)
	{
		System.out.println("Inside getPolicy");
		return healthServices.searchDoctor(doctorRegNo);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "health{id}")
	public String updateDoctor(@RequestBody Health health, @PathVariable String id)
	{
		healthServices.updateDoctor(id, health);
		return "Updated successfully";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "health{id}")
	public String deleteDoctor( @PathVariable String id)
	{
		healthServices.deleteDoctor(id);
		return "Delete successfully";
	}
}
