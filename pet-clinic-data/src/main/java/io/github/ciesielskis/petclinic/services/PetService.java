package io.github.ciesielskis.petclinic.services;

import io.github.ciesielskis.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
