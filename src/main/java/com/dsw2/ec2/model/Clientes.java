package com.dsw2.ec2.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "clientes")
@Entity
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombreCliente;
	private String direccionCliente;
	private Integer dniCliente;
	
	@ManyToMany(mappedBy = "clients", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Productos> products = new ArrayList<>();

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public Integer getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(Integer dniCliente) {
		this.dniCliente = dniCliente;
	}

	public List<Productos> getProducts() {
		return products;
	}

	public void setProducts(List<Productos> products) {
		this.products = products;
	}
	
	
}
