package com.edgaritzak.springbatch.repository;

import com.edgaritzak.springbatch.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Integer> {

}
