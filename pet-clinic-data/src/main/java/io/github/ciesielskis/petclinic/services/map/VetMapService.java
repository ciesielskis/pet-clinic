package io.github.ciesielskis.petclinic.services.map;

import io.github.ciesielskis.petclinic.model.Vet;
import io.github.ciesielskis.petclinic.services.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return save(object.getId(), object);
    }
}
