package com.dsw2.ec2.service;
import java.util.List;

import com.dsw2.ec2.dto.ClienteRequestDTO;
import com.dsw2.ec2.dto.ClienteResponseDTO;

public interface ClientService {
	public void guardarCliente(ClienteRequestDTO p);
	public void eliminarCliente(Integer id);
	public void editarCliente(ClienteRequestDTO p);
	public List<ClienteResponseDTO> listarCliente();
	public ClienteResponseDTO clienteById(Integer id);
}
