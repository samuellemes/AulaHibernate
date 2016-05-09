package br.edu.univas.bd.AulaHibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "Departamento")
public class Departament implements Serializable {
	
	@Id
	@Column (name = "Codigo")
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "Dep_gen")	
	@SequenceGenerator ( name ="Dep_gen", sequenceName ="seq_departamento", allocationSize = 1)
	private int code;
	
	@Column (name = "Nome")
	private String name;

	public Departament() {		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
