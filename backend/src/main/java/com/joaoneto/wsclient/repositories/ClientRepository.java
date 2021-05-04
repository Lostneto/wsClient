package com.joaoneto.wsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoneto.wsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
