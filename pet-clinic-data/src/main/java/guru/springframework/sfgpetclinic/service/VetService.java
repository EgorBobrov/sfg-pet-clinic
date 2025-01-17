package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
    Vet findByLastName(String lastName);
}
