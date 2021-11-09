package com.example.desafio1.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContratoDaoImpl implements ContratoDaoI{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Contrato contrato) {
		
		Session session=entityManager.unwrap(Session.class);
		session.save(contrato);
		session.close();
	}

	@Override
	public List searchAll() {
		
		List<Contrato>listaContrato=new ArrayList<>();
		Session session=entityManager.unwrap(Session.class);
		listaContrato=session.createQuery("FROM Contratro").getResultList();
		session.close();
		return listaContrato;
	}

	@Override
	public Contrato searchById(Long id) {
		Contrato contrato=new Contrato();
		Session session=entityManager.unwrap(Session.class);
		contrato=(Contrato)session.createQuery("FROM Contratro WHERE ID_CONTRATO="+id).uniqueResult();
		session.close();
		return contrato;
	}

	@Override
	public void actualizar(Contrato contrato) {
		Session session=entityManager.unwrap(Session.class);
		session.update(contrato);
		session.close();
	}

	@Override
	public void borrar(Contrato contrato) {
		Session session=entityManager.unwrap(Session.class);
		session.merge(contrato);
		session.close();
		
	}

	@Override
	public void searchByIdCliente() {
		// TODO Auto-generated method stub
		
	}


}
