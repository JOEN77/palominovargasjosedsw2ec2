package com.dsw2.ec2.model;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "bodega")
@Entity
public class Bodega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;
	private String bodega;
	private String direccion;
	
	@OneToMany
	@JoinColumn(name="id_producto", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_producto) references products (id_producto)"))
	private Productos products;

	public Integer getIdBodega() {
		return idBodega;
	}

	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Productos getProducts() {
		return products;
	}

	public void setProducts(Productos products) {
		this.products = products;
	}
	
	
}
