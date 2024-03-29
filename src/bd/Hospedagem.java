/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import javax.persistence.*;

@Entity
public class Hospedagem {
	private double valorDiaria;
	private double valorOrcamento;
	private int qteQuartos;
	private int qteSuite;
	private String descricao, nome;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public double getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(double valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public int getQteQuartos() {
		return qteQuartos;
	}

	public void setQteQuartos(int qteQuartos) {
		this.qteQuartos = qteQuartos;
	}

	public int getQteSuite() {
		return qteSuite;
	}

	public void setQteSuite(int qteSuite) {
		this.qteSuite = qteSuite;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}