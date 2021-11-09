package com.example.desafio1.services;

import java.util.List;

import com.example.desafio1.entities.Cliente;

	public interface ClienteService {
		
	public void insertar(Cliente cliente);
	
	public Cliente searchById(Long id);
	
	public List<Cliente> searchAll();
	
	public Cliente searchByNameLastName(String nombre, String apellido1, String apellido2);
	
	public void actualizar(Cliente cliente);
	
	public void borrar(Cliente cliente);

}
