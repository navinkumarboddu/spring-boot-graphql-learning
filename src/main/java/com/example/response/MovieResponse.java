package com.example.response;

import com.example.entity.Movie;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieResponse {
	private Long id;

	private String title;

	private Long budget;

	private String homepage;

	private String overview;

	private Double popularity;

	public MovieResponse(Movie movie) {
		this.id = movie.getId();
		this.title = movie.getTitle();
		this.budget = movie.getBudget();
		this.homepage = movie.getHomepage();
		this.overview = movie.getOverview();
		this.popularity = movie.getPopularity();
	}
}
