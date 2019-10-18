package xv.training.SpringBootentity.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long organizationid;
	private String organizationname, organizationdesc;

	public Organization() {

	}

	public Organization(String organizationname, String organizationdesc) {
		super();
		this.organizationname = organizationname;
		this.organizationdesc = organizationdesc;
	}

	public long getOrganizationid() {
		return organizationid;
	}

	public void setOrganizationid(long organizationid) {
		this.organizationid = organizationid;
	}

	public String getOrganizationname() {
		return organizationname;
	}

	public void setOrganizationname(String organizationname) {
		this.organizationname = organizationname;
	}

	public String getOrganizationdesc() {
		return organizationdesc;
	}

	public void setOrganizationdesc(String organizationdesc) {
		this.organizationdesc = organizationdesc;
	}

}
