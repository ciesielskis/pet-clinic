package io.github.ciesielskis.petclinic.services;

import io.github.ciesielskis.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
