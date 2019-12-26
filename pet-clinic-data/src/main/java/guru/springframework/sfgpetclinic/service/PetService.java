package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Collection;

public interface PetService {
    Pet findById(Long id);
    Pet findByName(String name);
    Pet save(Pet pet);
    Collection<Pet> findAll();
}
