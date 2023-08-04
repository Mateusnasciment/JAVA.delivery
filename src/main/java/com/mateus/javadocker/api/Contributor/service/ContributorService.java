package com.mateus.javadocker.api.Contributor.service;

import com.mateus.javadocker.api.Contributor.Contributor;
import com.mateus.javadocker.api.Contributor.repository.ContributorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContributorService {
    private final ContributorRepository contributorRepository;

     @Autowired
        public ContributorService(ContributorRepository contributorRepository) {
         this.contributorRepository = contributorRepository;

     }
     public Contributor registerContributor(Contributor contributor){
         return contributorRepository.save(contributor);
     }

}
