package com.baidya.movie.cast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baidya.movie.cast.pojo.Casting;

@Repository
public interface CastRepository extends JpaRepository<Casting, Long>{

}
