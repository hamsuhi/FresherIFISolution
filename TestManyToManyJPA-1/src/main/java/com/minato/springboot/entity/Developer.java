package com.minato.springboot.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Developer {

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String name;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "developer_project", 
		joinColumns = @JoinColumn(name = "developer_id"), 
				inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Project> projects;
	//private Set<Project> projects;
	
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

//	public Set<Project> getProjects() {
//		return projects;
//	}
//
//	public void setProjects(Set<Project> projects) {
//		this.projects = projects;
//	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
