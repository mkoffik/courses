package com.api.courses.service;

import com.api.courses.model.Client;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ClientServiceI {

    List<Client> findAllClients();
    List<Client> findClientByMatricule(String matricule);

    List<Client> findClientByNom(String nom);

    List<Client> findClientByPrenom(String prenom);

    List<Client> findClientByDate(Date dateNaissance);
}
