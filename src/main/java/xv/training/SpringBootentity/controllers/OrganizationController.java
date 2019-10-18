package xv.training.SpringBootentity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xv.training.SpringBootentity.entities.Organization;
import xv.training.SpringBootentity.repositories.OrganizationRepository;

@RestController
public class OrganizationController {

	@Autowired
	private OrganizationRepository organizationRepository;

	@RequestMapping("/Organization")
	public Iterable<Organization> getOrganization() {
		return organizationRepository.findAll();

	}

}
