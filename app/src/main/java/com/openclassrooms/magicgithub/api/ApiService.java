package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public interface ApiService {
    // TODO : Méthodes qui récupèrent les données?? (Notion d' API/contrat pas bien comprise)
    List<User> getUsers();
    void generateRandomUser();
    void deleteUser(User username);
}
