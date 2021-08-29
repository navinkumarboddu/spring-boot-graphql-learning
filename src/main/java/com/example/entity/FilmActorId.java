package com.example.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class FilmActorId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int actor_id;

	private int film_id;

}