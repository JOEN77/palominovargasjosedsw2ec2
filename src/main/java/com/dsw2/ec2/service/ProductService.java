package com.dsw2.ec2.service;

import java.util.List;

import com.dsw2.ec2.dto.ProductoRequestDTO;
import com.dsw2.ec2.dto.ProductoResponseDTO;

public interface ProductService {
	public void guardarProducto(ProductoRequestDTO p);
	public void eliminarProducto(Integer id);
	public void editarProducto(ProductoRequestDTO p);
	public List<ProductoResponseDTO> listarProductos();
	public ProductoResponseDTO productById(Integer id);
}
