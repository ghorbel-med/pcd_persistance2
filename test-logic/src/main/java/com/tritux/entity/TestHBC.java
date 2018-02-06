package com.tritux.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Houcem Ben Chika
 *
 */
@Entity
@Table(name = "test_hbc")
public class TestHBC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "test_id")
	private Long id;

	@Column(name = "label", nullable = false, unique = true)
	private String label;
	
	@Column(name = "prenom", nullable = false)
	private String prenom;


	public TestHBC() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	

}
