package com.baidya.movie.cast.repository;

import com.baidya.movie.cast.pojo.Casting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LoadCastingData {

    private final CastRepository castRepository;

    private static  final Logger LOGGER = LoggerFactory.getLogger(LoadCastingData.class);

    public LoadCastingData(CastRepository castRepository) {
        this.castRepository = castRepository;
    }

    @Bean
    public CommandLineRunner addCastingData(){
        return args -> {
            LOGGER.info("Adding casting data: ", castRepository.save(new Casting(1, "Peter Parker")));
            LOGGER.info("Adding casting data: ", castRepository.save(new Casting(2, "Christopher Nolan")));
        };
    }
}
