package br.com.santander.colaboradores.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.santander.colaboradores.modelo.Colaborador;

/*
 * Padrão DTO para mapeamento de entidade
 */
public class ColaboradorDto {

	private Long id;
	private String nome;
	private String sobreNome;
	private String cargo;
	private String dataNascimento;
	private String endereco;
	
	public ColaboradorDto(Colaborador colaborador) {
		this.id = colaborador.getId();
		this.nome = colaborador.getNome();
		this.sobreNome = colaborador.getSobreNome();
		this.cargo = colaborador.getCargo();
		this.dataNascimento = colaborador.getDataNascimento();
		this.endereco = colaborador.getEndereco();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public String getCargo() {
		return cargo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}

	public static List<ColaboradorDto> converter(List<Colaborador> colaboradores) {
		// TODO Auto-generated method stub
		
		//Stream do java para conversao, ao inves de utilizar um for para cada item da lista.
		return colaboradores.stream().map(ColaboradorDto::new).collect(Collectors.toList());
	}
	
	
}
