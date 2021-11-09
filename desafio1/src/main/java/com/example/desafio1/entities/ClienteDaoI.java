package com.example.desafio1.entities;

import java.util.ArrayList;
import java.util.List;

public interface ClienteDaoI {
	
	public void insertar(Cliente cliente);
	
	public Cliente searchById(Long id);
	
	public List<Cliente> searchAll();
	
	public Cliente searchByNameLastName(String nombre, String apellido1, String apellido2);
	
	public void actualizar(Cliente cliente);
	
	public void borrar(Cliente cliente);

}
