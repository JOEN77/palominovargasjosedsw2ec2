package com.dsw2.ec2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsw2.ec2.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
	Usuario findByUsuario(String usuario);

}
