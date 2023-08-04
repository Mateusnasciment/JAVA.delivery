package com.mateus.javadocker.api.Contributor.repository;

import com.mateus.javadocker.api.Contributor.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ContributorRepository extends JpaRepository<Contributor, Long>{

}

