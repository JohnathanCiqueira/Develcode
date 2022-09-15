package com.develcode.avaliacao.usuario.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column
	@NotNull
	private String nome;

	@NotNull
	@Column(name = "data_nascimento")
	private LocalDateTime dataNascimeto;

	@Lob
	private byte[] foto;

	public Usuario() {
	}

	public Usuario(Long codigo, String nome, LocalDateTime dataNascimeto, byte[] foto) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimeto = dataNascimeto;
		this.foto = foto;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataNascimeto() {
		return dataNascimeto;
	}

	public void setDataNascimeto(LocalDateTime dataNascimeto) {
		this.dataNascimeto = dataNascimeto;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
