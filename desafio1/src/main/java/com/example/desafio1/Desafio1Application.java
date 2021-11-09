package com.example.desafio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio1.entities.Cliente;
import com.example.desafio1.entities.Contrato;
import com.example.desafio1.services.ClienteService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	ClienteService clienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Insertar Clientes
		Cliente cliente1=new Cliente();
		Cliente cliente2=new Cliente();
		Cliente cliente3=new Cliente();
		cliente1.setNombre("Maria");
		cliente1.setApellido1("Suarez");
		cliente1.setApellido2("Martinez");
		cliente1.setDni("123456789");
		
		cliente2.setNombre("Pedro");
		cliente2.setApellido1("Suarez");
		cliente2.setApellido2("Martinez");
		cliente2.setDni("123456788");
		
		cliente3.setNombre("Juan");
		cliente3.setApellido1("Suarez");
		cliente3.setApellido2("Martinez");
		cliente3.setDni("123456787");
		
		clienteService.insertar(cliente1);
		clienteService.insertar(cliente2);
		clienteService.insertar(cliente3);
		
		//Listar todos los clientes
		List<Cliente>listaCliente=new ArrayList<>();
		listaCliente=clienteService.searchAll();
		for (int i = 0; i < listaCliente.size(); i++) {
			System.out.println(listaCliente.get(i).getNombre());
		}
		
		//Listar por Id
		Cliente clienteid=new Cliente();
		clienteid=clienteService.searchById((long) 1);
		System.out.println(clienteid.getNombre());
		
		//Listar por nombre y apellidos
		Cliente clientebusqueda=new Cliente();
		clientebusqueda=clienteService.searchByNameLastName(cliente1.getNombre(), cliente1.getApellido1(), cliente1.getApellido2());
		System.out.println(clientebusqueda.getNombre());
		
		//Actualizar cliente
		cliente1.setNombre("Paula");
		clienteService.actualizar(cliente1);
		System.out.println(cliente1.getNombre());
		
		//Borrar cliente
		//clienteService.borrar(cliente3);
		
		//Insertar Contrato
		List<Contrato>listaContrato=new ArrayList<>();
		Contrato contrato1=new Contrato();
		contrato1.setFecha_vigencia("2021/10/10");
		contrato1.setFecha_caducidad("2021/11/01");
		contrato1.setPmensual(150.75);
		listaContrato.add(contrato1);
		
		cliente1.setListaContrato(listaContrato);
		
		
		
	}

}
