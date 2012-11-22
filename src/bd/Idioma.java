/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import javax.persistence.*;

@Entity
public class Idioma {
	private String idioma;
	
	@ManyToOne
	private GuiaTuristico guia;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setGuia(GuiaTuristico guia) {
		this.guia = guia;
	}

	public GuiaTuristico getGuia() {
		return guia;
	}

}