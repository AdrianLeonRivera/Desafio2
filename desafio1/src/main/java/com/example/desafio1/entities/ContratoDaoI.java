package com.example.desafio1.entities;

import java.util.List;

public interface ContratoDaoI {
	
	public void insertar(Contrato contrato);
	
	public List searchAll();
	
	public Contrato searchById(Long id);
	
	public void actualizar(Contrato contrato);
	
	public void borrar(Contrato contrato);
	
	public void searchByIdCliente();

}
