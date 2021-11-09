package com.example.desafio1.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.desafio1.entities.Contrato;

@Entity
@Table(name = "CONTRATO")
public class Contrato {
	
	private Long id;
	
	private String fecha_vigencia;
	
	private String fecha_caducidad;
	
	private double pmensual;
	
	private Cliente cliente;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTRATO", precision = 15)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "FECHA_VIGENCIA")
	public String getFecha_vigencia() {
		return fecha_vigencia;
	}

	public void setFecha_vigencia(String fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}
	
	@Column(name = "FECHA_CADUCIDAD")
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	@Column(name = "PRECIO_MENSUAL")
	public double getPmensual() {
		return pmensual;
	}

	public void setPmensual(double pmensual) {
		this.pmensual = pmensual;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "contrato")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
