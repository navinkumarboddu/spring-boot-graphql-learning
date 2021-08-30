package com.example.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.response.MovieResponse;
import com.example.service.MovieService;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	MovieService movieService;

	public MovieResponse movie(long id) {
		return new MovieResponse(movieService.getMovieById(id));
	}
}
