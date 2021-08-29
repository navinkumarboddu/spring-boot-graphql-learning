package com.example.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movie_id")
	private Long id;

	private String title;

	private Long budget;

	private String homepage;

	private String overview;

	private Double popularity;

	@Column(name = "release_date")
	private Date releaseDate;

	private Long revenue;

	private Long runtime;

	@Column(name = "movie_status")
	private String movieStatus;

	private String tagline;

	@Column(name = "vote_average")
	private Double voteAverage;

	@Column(name = "vote_count")
	private Long voteCount;
}
