package com.example.movieandtvrecommender.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TmdbApiConfig {
    @Value("${tmdb.api.url}")
    String apiUrl;

    @Value("${tmdb.api.key}")
    String apiKey;
}
