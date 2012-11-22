package bd;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Cidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private ArrayList<Lugar> pontosTuristicos = new ArrayList<Lugar>();
	@OneToOne
	private Endereco endereco;
	@ManyToOne
	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Lugar> getPontosTuristicos() {
		return pontosTuristicos;
	}

	public void setPontosTuristicos(ArrayList<Lugar> pontosTuristicos) {
		this.pontosTuristicos = pontosTuristicos;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}