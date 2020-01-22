package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    // this method is run after everything is initialized by Spring container
    @Override
    public void run(String... args) {
        ownerService.save(createOwner(1L, "Michael", "Veston"));
        ownerService.save(createOwner(2L, "Fiona", "Gleanne"));
        System.out.println("Loaded Owners...");

        vetService.save(createVet(1L, "Sam", "Axe"));
        vetService.save(createVet(2L, "Sara", "Axe"));
        System.out.println("Loaded Vets...");
        

    }

    private Owner createOwner(Long id, String firstName, String lastName) {
        Owner person = new Owner();
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }

    private Vet createVet(Long id, String firstName, String lastName) {
        Vet person = new Vet();
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        return person;
    }

}
