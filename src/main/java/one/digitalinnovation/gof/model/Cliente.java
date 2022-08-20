package one.digitalinnovation.gof.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;

	@OneToMany(mappedBy = "placa", cascade = CascadeType.REMOVE , fetch = FetchType.EAGER)
	private List<Veiculo> veiculos = new ArrayList<>();
	//@JsonIgnore


	public Cliente(Long id, String nome, Endereco endereco, List<Veiculo> veiculos) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.veiculos = veiculos;
	}

	public Cliente(){}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
