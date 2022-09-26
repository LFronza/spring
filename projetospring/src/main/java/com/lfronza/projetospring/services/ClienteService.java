package com.lfronza.projetospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfronza.projetospring.domain.Cliente;
import com.lfronza.projetospring.domain.Cliente;
import com.lfronza.projetospring.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+id + " , Tipo: " + Cliente.class.getName()));
	}
	
}
