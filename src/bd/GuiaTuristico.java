/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.*;

import javax.persistence.*;

@Entity
public class GuiaTuristico extends Pessoa {

	public GuiaTuristico(String nome, String cpf) {
		super(nome, cpf);
	}

	public GuiaTuristico() {
	}

	private double preco;
	@OneToMany(mappedBy = "guia")
	private ArrayList<Idioma> linguasFaladas;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Idioma> getLinguasFaladas() {
		return linguasFaladas;
	}

	public void setLinguasFaladas(ArrayList<Idioma> linguasFaladas) {
		this.linguasFaladas = linguasFaladas;
	}

}