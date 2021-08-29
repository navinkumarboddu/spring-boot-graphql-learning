package com.example.entity;

public enum Rating {

	GENERALAUDIENCES("G"), 
	PARENTALGUIDANCESUGGESTED("PG"), 
	PARENTSSTRONGLYCAUTIONED("PG-13"), 
	RESTRICTED("R"),
	CLEARLYADULT("NC-17");

	private String rating;

	Rating(String rating) {
		this.rating = rating;
	}

	public String getRating() {
		return this.rating;
	}

}