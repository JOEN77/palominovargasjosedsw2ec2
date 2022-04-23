package com.dsw2.ec2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsw2.ec2.model.Productos;

@Repository
public interface ProductRepository extends JpaRepository<Productos, Integer>{
	
}
