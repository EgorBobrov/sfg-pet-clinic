package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Collection;

public interface VetService {
    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Vet vet);
    Collection<Vet> findAll();

}
