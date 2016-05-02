package br.edu.univas.bd.AulaHibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="cidade")
public class City implements Serializable {
	
	@Id
	@Column (name = "ibge")
	private Long id;

	private String nome;

	private Float area	;
	
	private State estado;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

}
