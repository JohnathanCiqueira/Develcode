package com.develcode.avaliacao.usuario.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1329644544802951773L;

	@NotBlank(message = "Preenchimento do campo nome é obrigatório")
	private String nome;

	@NotNull(message = "Preenchimento do data de nascimento é obrigatório")
	private LocalDateTime dataNascimeto;
	
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


}
