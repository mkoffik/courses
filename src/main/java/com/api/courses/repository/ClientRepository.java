package com.api.courses.repository;

import com.api.courses.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

    @Query("SELECT c FROM client c WHERE c.matricule = ?1")
    List<Client> findClientByMatricule(String matricule);

    @Query("SELECT c FROM client c WHERE c.nom = ?1")
    List<Client> findClientByNom(String nom);

    @Query("SELECT c FROM client c WHERE c.prenom = ?1")
    List<Client> findClientByPrenom(String prenom);

    @Query("SELECT c FROM client c WHERE c.dateNaissance = ?1")
    List<Client> findClientByDate(Date dateNaissance);
}
