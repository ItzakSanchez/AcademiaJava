package com.edgaritzak.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.edgaritzak.springbatch.entity.Organization;

public class Processor implements ItemProcessor<Organization,Organization> {

    @Override
    public Organization process(Organization organization) throws Exception {
        if(organization.getIndustry().equals("Hospitality") ||
        		organization.getIndustry().equals("Hospital / Health Care")) {
            return organization;
        }else{
            return null;
        }
    }
}
