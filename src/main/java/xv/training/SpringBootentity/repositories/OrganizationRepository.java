package xv.training.SpringBootentity.repositories;

import org.springframework.data.repository.CrudRepository;

import xv.training.SpringBootentity.entities.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, Long> {

}
