package com.api.courses.service;

import com.api.courses.model.Client;
import com.api.courses.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClientService implements ClientServiceI{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> findClientByMatricule(String matricule) {
        return clientRepository.findClientByMatricule(matricule);
    }

    @Override
    public List<Client> findClientByNom(String nom) {
        return clientRepository.findClientByNom(nom);
    }

    @Override
    public List<Client> findClientByPrenom(String prenom) {
        return clientRepository.findClientByPrenom(prenom);
    }

    @Override
    public List<Client> findClientByDate(Date dateNaissance) {
        return null;
    }
}
