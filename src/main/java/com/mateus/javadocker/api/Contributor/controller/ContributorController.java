package com.mateus.javadocker.api.Contributor.controller;

import com.mateus.javadocker.api.Contributor.Contributor;
import com.mateus.javadocker.api.Contributor.models.ContributorDTO;
import com.mateus.javadocker.api.Contributor.service.ContributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contributors")
public class ContributorController {
    @Autowired
    private ContributorService contributorService;

    @PostMapping
    public ResponseEntity<?> registerContributor(@RequestBody ContributorDTO contributorDTO) {
        Contributor contributor = new Contributor();
        contributor.setNome(contributorDTO.getNome());
        contributor.setCpfcnpj(contributorDTO.getCpfCnpj());
        contributor.setEndereco(contributorDTO.getEndereco());

        contributorService.registerContributor(contributor);

        return ResponseEntity.ok("ok foda-se");
    }
}
