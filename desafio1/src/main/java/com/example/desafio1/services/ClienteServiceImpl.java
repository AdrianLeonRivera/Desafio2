package com.example.desafio1.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio1.entities.Cliente;
import com.example.desafio1.entities.ClienteDaoI;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDaoI clienteDao;
	
	@Override
	public void insertar(Cliente cliente) {
		clienteDao.insertar(cliente);
	}

	@Override
	public Cliente searchById(Long id) {
		
		return clienteDao.searchById(id);
	}

	@Override
	public List searchAll() {
		
		return clienteDao.searchAll();
	}

	@Override
	public Cliente searchByNameLastName(String nombre, String apellido1, String apellido2) {
		return clienteDao.searchByNameLastName(nombre, apellido1, apellido2);
	}

	@Override
	public void actualizar(Cliente cliente) {
		clienteDao.actualizar(cliente);
		
	}

	@Override
	public void borrar(Cliente cliente) {
		clienteDao.borrar(cliente);
	}

}
