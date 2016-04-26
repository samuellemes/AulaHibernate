package br.edu.univas.bd.AulaHibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO")
public class State implements Serializable {

	@Id
	private int ibge;
	
	@Column(length=2, nullable=false)
	private String sigla;
	
	private String nome;
	
	private float area;
	
	//gerar os sets e gets
}
