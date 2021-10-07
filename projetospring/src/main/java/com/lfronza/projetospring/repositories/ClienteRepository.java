package com.lfronza.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lfronza.projetospring.domain.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
