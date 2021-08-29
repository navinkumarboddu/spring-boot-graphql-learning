package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "filmActor")
public class FilmActor {

	@EmbeddedId
	private FilmActorId filmActorId;

	@Column(name = "last_update")
	private Timestamp last_update;

	@ManyToOne
	@JoinColumn(name = "actor_id")
	private Actor actor;

	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film;

}
