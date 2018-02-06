package com.tritux.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Houcem Ben Chika
 *
 */
@Entity
@Table(name = "Etudiant")
public class Etudiant {

	@Id
	@Column(name = "etudiant_id")
	private String id;

	@Column(name = "label", nullable = false, unique = true)
	private String label;

	@Column(name = "prenom", nullable = false)
	private String prenom;

	public Etudiant() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
