package com.example.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "subject")
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actor_id")
	private Long actor_id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "marks_obtained")
	private Double lastName;

	@Column(name = "last_update")
	private Timestamp last_update;

	@OneToMany(mappedBy = "actor	")
	private List<FilmActor> filmActors;

}
