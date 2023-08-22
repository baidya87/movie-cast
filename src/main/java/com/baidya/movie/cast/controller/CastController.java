package com.baidya.movie.cast.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidya.movie.cast.pojo.Casting;
import com.baidya.movie.cast.service.CastService;

@RestController
@RequestMapping("/cast")
public class CastController {
	
	private static final Logger log = LoggerFactory.getLogger(CastController.class);

	@Autowired
	private CastService castService;
	
	@Autowired
	Environment environment;
	
	@PostMapping
	public Casting add(@RequestBody Casting cast) {
		log.info("Owner of the app firstName: "+environment.getProperty("name.first") + " lastName: "+environment.getProperty("name.last"));
		return castService.add(cast);
	}
	
	@GetMapping("/{id}")
	public Casting find(@PathVariable long id) {
		return castService.find(id);
	}
}
