package com.minato.springboot.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Project {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;

	@ManyToMany(mappedBy = "projects")
	private List<Developer> developers;
	//private Set<Developer> developers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Set<Developer> getDevelopers() {
//		return developers;
//	}
//
//	public void setDevelopers(Set<Developer> developers) {
//		this.developers = developers;
//	}

	
	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

}