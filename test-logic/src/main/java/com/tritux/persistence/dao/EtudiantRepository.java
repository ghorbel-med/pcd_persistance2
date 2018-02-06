package com.tritux.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tritux.entity.Etudiant;

/*
 * repository ==> bean + role manipuler la table
 */
@Repository("etudiantRepository")
public interface EtudiantRepository extends JpaRepository<Etudiant, String> {

}
