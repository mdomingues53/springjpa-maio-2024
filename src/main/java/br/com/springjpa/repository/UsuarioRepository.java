package br.com.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springjpa.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
