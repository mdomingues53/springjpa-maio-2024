package br.com.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springjpa.entity.Usuario;
import br.com.springjpa.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	public List<Usuario> findListaUsuariosByNome(String nome){		
		return usuarioRepository.findByLikeNome(nome);
	}
	
	public void gravarUsuario(Usuario usuario){		
		usuarioRepository.save(usuario);
	}

}
