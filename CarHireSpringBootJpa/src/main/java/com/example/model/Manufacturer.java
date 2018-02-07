package com.example.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.Set;


/**
 * The persistent class for the Manufacturer database table.
 * 
 */
@Entity
@NamedQuery(name="Manufacturer.findAll", query="SELECT m FROM Manufacturer m")
public class Manufacturer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="manufacturer_code")
	private int manufacturerCode;

	@Column(name="manufacturer_name")
	private String manufacturerName;

	@Column(name="manufacurer_details")
	private String manufacurerDetails;

	//bi-directional many-to-one association to Model
	@OneToMany(mappedBy="manufacturer", fetch=FetchType.EAGER)
	private Set<Model> models;

	public Manufacturer() {
	}

	public Manufacturer(String manufacturerName, String manufacurerDetails) {
		this.manufacturerName = manufacturerName;
		this.manufacurerDetails = manufacurerDetails;
	}


	public int getManufacturerCode() {
		return this.manufacturerCode;
	}

	public void setManufacturerCode(int manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}

	public String getManufacturerName() {
		return this.manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getManufacurerDetails() {
		return this.manufacurerDetails;
	}

	public void setManufacurerDetails(String manufacurerDetails) {
		this.manufacurerDetails = manufacurerDetails;
	}

	public Set<Model> getModels() {
		return this.models;
	}

	public void setModels(Set<Model> models) {
		this.models = models;
	}

	public Model addModel(Model model) {
		getModels().add(model);
		model.setManufacturer(this);

		return model;
	}

	public Model removeModel(Model model) {
		getModels().remove(model);
		model.setManufacturer(null);

		return model;
	}

	@Override
	public String toString() {
		return "Manufacturer [manufacturerCode=" + manufacturerCode + ", manufacturerName=" + manufacturerName
				+ ", manufacurerDetails=" + manufacurerDetails ;
	}
	

}