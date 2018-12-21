package com.example.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmail(String email);
}
