package io.github.ciesielskis.petclinic.services.map;

import io.github.ciesielskis.petclinic.model.PetType;
import io.github.ciesielskis.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PerTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
