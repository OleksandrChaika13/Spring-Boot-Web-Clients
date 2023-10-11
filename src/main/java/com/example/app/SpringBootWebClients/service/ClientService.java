package com.example.app.SpringBootWebClients.service;

import com.example.app.SpringBootWebClients.entity.Client;
import com.example.app.SpringBootWebClients.repository.ClientRepository;
import com.example.app.SpringBootWebClients.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public List<Client> getClients() {

        List<Client> clients = repository.findAll().stream()
                .map(client -> new Client(client.getId(),
                        Constants.URL_IMAGE + client.getImg(),
                        client.getFirstName(), client.getLastName(), client.getPhone()))
                .toList();

        return new ArrayList<>(clients);
    }
}