package com.edgaritzak.springbatch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ORGANIZATION_DATA")
public class Organization {
	
	@Id
	@Column(name="ID")
	private int Id;
	@Column(name="ORGANIZATION_ID")
	private String OrganizationId;
	@Column(name="NAME")
	private String Name;
	@Column(name="WEBSITE")
	private String Website;
	@Column(name="COUNTRY")
	private String Country;
	@Column(name="DESCRIPTION")
	private String Description;
	@Column(name="FOUNDED")
	private int Founded;
	@Column(name="INDUSTRY")
	private String Industry;
	@Column(name="NUMBER_OF_EMPLOYEES")
	private int NumberOfEmployees;
}
