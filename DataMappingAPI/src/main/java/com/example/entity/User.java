package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	private Address addresses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddresses() {
		return addresses;
	}

	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}
}
