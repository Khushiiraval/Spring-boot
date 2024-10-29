package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.flightModel;
import com.example.demo.repository.flightRepository;

@RestController
public class flightController {
	@Autowired
	flightRepository fr;
	
	// INSERT FLIGHT DETAIL
	@PostMapping("/add")
	public String addFlight(flightModel fm)
	{
		try
		{
			fr.save(fm);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return "Data Added.";
	}
	
	//DELETE FLIGHT DETAIL
	@PostMapping("/del")
	public String delFlight(Integer id)
	{
		try
		{
			fr.deleteById(id);
			return "Data Deleted.";
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return "Something went Wrong";
	}
	
	// DISPLAY FLIGHT DETAIL
	@GetMapping("flightModel")
	public Iterable<flightModel> getAllflightModel()
	{
		return fr.findAll();
	}
}
