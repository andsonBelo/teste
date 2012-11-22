/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Lugar {
	private String nome;
	private double precoBilhete;
	private Endereco endereco;
	private Cidade cidade;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public Cidade getNomeCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBilhete() {
		return precoBilhete;
	}

	public void setPrecoBilhete(double precoBilhete) {
		this.precoBilhete = precoBilhete;
	}

}   