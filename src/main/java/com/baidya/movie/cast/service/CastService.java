package com.baidya.movie.cast.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidya.movie.cast.pojo.Casting;
import com.baidya.movie.cast.repository.CastRepository;

@Service
public class CastService {
	
	@Autowired
	private CastRepository castRepository;

	public Casting add(Casting cast) {
		return castRepository.save(cast);
	}

	public Casting find(long id) {
		Optional<Casting> castingOptn = castRepository.findById(id);
		return castingOptn.isPresent()?castingOptn.get():null;
	}

	
}
