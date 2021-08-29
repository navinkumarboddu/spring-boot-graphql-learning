package com.example.entity;

import java.sql.Timestamp;
import java.time.Year;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "film_id")
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "release_year")
	private Year release_year;

	@Column(name = "language_id")
	private int language_id;

	@Column(name = "original_language_id")
	private int original_language_id;

	@Column(name = "rental_duration")
	private int rental_duration;

	@Column(name = "rental_duration")
	private double rental_rate;

	@Column(name = "length")
	private int length;

	@Column(name = "replacement_cost")
	private double replacement_cost;

	@Enumerated
	@Column(columnDefinition = "rating")
	private Rating rating;

	@Column(columnDefinition = "special_features")
	private Set<String> special_features;

	@Column(name = "last_update")
	private Timestamp last_update;
	
	@OneToMany(mappedBy = "film")
	private List<FilmActor> filmActors;

}
