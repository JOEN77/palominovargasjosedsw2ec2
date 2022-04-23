package com.dsw2.ec2.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsw2.ec2.dto.ProductoRequestDTO;
import com.dsw2.ec2.dto.ProductoResponseDTO;
import com.dsw2.ec2.model.Productos;
import com.dsw2.ec2.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public void guardarProducto(ProductoRequestDTO p) {
		// TODO Auto-generated method stub
		Productos producto = new Productos();
		producto.setIdProducto(p.getIdRequest());
		producto.setDescripcion(p.getDescripcionProducto());
		producto.setNombreProducto(p.getNombreProducto());
		producto.setPrecio(p.getPrecioProducto());
		producto.setStock(p.getStockProducto());
		repository.save(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void editarProducto(ProductoRequestDTO p) {
		// TODO Auto-generated method stub
		Productos producto = new Productos();
		producto.setIdProducto(p.getIdRequest());
		producto.setDescripcion(p.getDescripcionProducto());
		producto.setNombreProducto(p.getNombreProducto());
		producto.setPrecio(p.getPrecioProducto());
		producto.setStock(p.getStockProducto());
		repository.saveAndFlush(producto);
		
	}

	@Override
	public List<ProductoResponseDTO> listarProductos() {
		// TODO Auto-generated method stub
List<Productos> producto = repository.findAll();
		
		List<ProductoResponseDTO> dto = new ArrayList<ProductoResponseDTO>();
		ProductoResponseDTO productoDto = null;
		
		
		for (Productos products : producto) {
			productoDto = new ProductoResponseDTO();
			productoDto.setIdResponse(products.getIdProducto());
			productoDto.setNombreProducto(products.getNombreProducto());
			productoDto.setDescripcionProducto(products.getDescripcion());
			productoDto.setPrecioProducto(products.getPrecio());
			productoDto.setStockProducto(products.getStock());
			dto.add(productoDto);
		}
		
		return dto;
	}

	@Override
	public ProductoResponseDTO productById(Integer id) {
		// TODO Auto-generated method stub
		Productos products = repository.findById(id).orElse(null);
		ProductoResponseDTO productoDto = new ProductoResponseDTO();
		
		productoDto = new ProductoResponseDTO();
		productoDto.setIdResponse(products.getIdProducto());
		productoDto.setNombreProducto(products.getNombreProducto());
		productoDto.setDescripcionProducto(products.getDescripcion());
		productoDto.setPrecioProducto(products.getPrecio());
		productoDto.setStockProducto(products.getStock());
		
		return productoDto;
	}
}
