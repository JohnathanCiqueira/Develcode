package com.develcode.avaliacao.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.develcode.avaliacao.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
