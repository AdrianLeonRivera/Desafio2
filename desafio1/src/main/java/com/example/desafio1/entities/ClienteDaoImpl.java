package com.example.desafio1.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDaoImpl implements ClienteDaoI{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		Session session=entityManager.unwrap(Session.class);
		
		session.save(cliente);
		
		session.close();
	}

	@Override
	public Cliente searchById(Long id) {
		Session session=entityManager.unwrap(Session.class);
		Cliente cliente=(Cliente)session.createQuery("FROM Cliente WHERE ID_CLIENTE="+id).uniqueResult();
		session.close();
		return cliente;
	}

	@Override
	public List searchAll() {
		List<Cliente>cli=new ArrayList<>();
		Session session=entityManager.unwrap(Session.class);
		cli=(List<Cliente>) session.createQuery("FROM Cliente").getResultList();
		session.close();
		return cli;
	}

	@Override
	public Cliente searchByNameLastName(String nombre, String apellido1, String apellido2) {
		Session session=entityManager.unwrap(Session.class);
		Cliente cliente=(Cliente)session.createQuery("FROM Cliente WHERE NOMBRE='"+nombre+"' AND APELLIDO1='"+apellido1+"'AND APELLIDO2='"+apellido2+"'").uniqueResult();
		return cliente;
	}

	@Override
	public void actualizar(Cliente cliente) {
		Session session=entityManager.unwrap(Session.class);
		
		session.update(cliente);
		
		session.close();
		
	}

	@Override
	public void borrar(Cliente cliente) {
		Session session=entityManager.unwrap(Session.class);
		
		entityManager.remove(entityManager.merge(cliente));
		
		session.close();
		
	}

}
