package com.nadhem.produit.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nadhem.produit.entities.Marque;

@RepositoryRestResource(path = "marque")
@CrossOrigin(origins="http://localhost:4200/") //pour autoriser angular 
public interface MarqueRepository extends JpaRepository<Marque, Long> {

}
