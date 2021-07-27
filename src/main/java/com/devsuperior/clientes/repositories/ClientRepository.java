package com.devsuperior.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.clientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {

}
