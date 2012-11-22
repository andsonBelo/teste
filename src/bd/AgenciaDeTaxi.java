/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import javax.persistence.*;

@Entity
public class AgenciaDeTaxi {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer id;
	private String nome;
	private String cnpj;
	private Endereco endereco;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}

