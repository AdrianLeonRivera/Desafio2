package com.example.desafio1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.desafio1.entities.Contrato;
import com.example.desafio1.entities.ContratoDaoI;

public class ContratoServiceImpl implements ContratoService {
	
	@Autowired
	private ContratoDaoI contratoDao;
	
	@Override
	public void insertar(Contrato contrato) {
		contratoDao.insertar(contrato);
		
	}

	@Override
	public List searchAll() {
		return contratoDao.searchAll();
	}

	@Override
	public Contrato searchById(Long id) {
		return contratoDao.searchById(id);
	}

	@Override
	public void actualizar(Contrato contrato) {
		contratoDao.actualizar(contrato);
		
	}

	@Override
	public void borrar(Contrato contrato) {
		contratoDao.borrar(contrato);
		
	}

	@Override
	public void searchByIdCliente() {
		contratoDao.searchByIdCliente();
		
	}

}
