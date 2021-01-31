package io.github.ciesielskis.petclinic.services.map;

import io.github.ciesielskis.petclinic.model.Pet;
import io.github.ciesielskis.petclinic.services.PetService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Pet save(Pet object) {
        return save(object.getId(), object);
    }
}
