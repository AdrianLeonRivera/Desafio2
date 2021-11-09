package com.example.desafio1.services;

import java.util.List;

import com.example.desafio1.entities.Contrato;

public interface ContratoService {
	
	public void insertar(Contrato contrato);
	
	public List searchAll();
	
	public Contrato searchById(Long id);
	
	public void actualizar(Contrato contrato);
	
	public void borrar(Contrato contrato);
	
	public void searchByIdCliente();

}
