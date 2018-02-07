package com.example.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.Set;


/**
 * The persistent class for the VehicleCategory database table.
 * 
 */
@Entity
@NamedQuery(name="VehicleCategory.findAll", query="SELECT v FROM VehicleCategory v")
public class VehicleCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vehicle_category_code")
	private int vehicleCategoryCode;

	@Column(name="vehicle_category_description")
	private String vehicleCategoryDescription;

	//bi-directional many-to-one association to Vehicle
	@OneToMany(mappedBy="vehicleCategory", fetch=FetchType.EAGER)
	private Set<Vehicle> vehicles;

	public VehicleCategory() {
	}
	

	public VehicleCategory(String vehicleCategoryDescription) {
		super();
		this.vehicleCategoryDescription = vehicleCategoryDescription;
	}


	public int getVehicleCategoryCode() {
		return this.vehicleCategoryCode;
	}

	public void setVehicleCategoryCode(int vehicleCategoryCode) {
		this.vehicleCategoryCode = vehicleCategoryCode;
	}

	public String getVehicleCategoryDescription() {
		return this.vehicleCategoryDescription;
	}

	public void setVehicleCategoryDescription(String vehicleCategoryDescription) {
		this.vehicleCategoryDescription = vehicleCategoryDescription;
	}

	public Set<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public Vehicle addVehicle(Vehicle vehicle) {
		getVehicles().add(vehicle);
		vehicle.setVehicleCategory(this);

		return vehicle;
	}

	public Vehicle removeVehicle(Vehicle vehicle) {
		getVehicles().remove(vehicle);
		vehicle.setVehicleCategory(null);

		return vehicle;
	}

}