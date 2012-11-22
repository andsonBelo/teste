/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Turista extends Pessoa {
	private String numPassaPorte;
	private Hospedagem hospedagem;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Turista() {
	}

	public Turista(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public String getNumPassaPorte() {
		return numPassaPorte;
	}

	public void setNumPassaPorte(String numPassaPorte) {
		this.numPassaPorte = numPassaPorte;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

}