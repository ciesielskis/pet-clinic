package io.github.ciesielskis.petclinic.bootstrap;

import io.github.ciesielskis.petclinic.model.Owner;
import io.github.ciesielskis.petclinic.model.Vet;
import io.github.ciesielskis.petclinic.services.OwnerService;
import io.github.ciesielskis.petclinic.services.VetService;
import io.github.ciesielskis.petclinic.services.map.OwnerMapService;
import io.github.ciesielskis.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        //owner1.setAddress("123 Brickerel");
        //owner1.setCity("Miami");
        //owner1.setTelephone("1231231234");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        //owner2.setAddress("123 Brickerel");
        //owner2.setCity("Miami");
        //owner2.setTelephone("1231231234");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        //vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        //vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);
    }
}