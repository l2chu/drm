package com.drm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DRM {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String firstName;
	private String lastName;
	private String email;
	private String country;
	private String state;
	private String zip;
	private String mechAction;
	private String dosageForm;
	private String dosageStr;
	private String modeAdmin;
	private String SDA;
	private String DPQR;
	private String degAndImp;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getMechAction() {
		return mechAction;
	}

	public void setMechAction(String mechAction) {
		this.mechAction = mechAction;
	}

	public String getDosageForm() {
		return dosageForm;
	}

	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}

	public String getDosageStr() {
		return dosageStr;
	}

	public void setDosageStr(String dosageStr) {
		this.dosageStr = dosageStr;
	}

	public String getModeAdmin() {
		return modeAdmin;
	}

	public void setModeAdmin(String modeAdmin) {
		this.modeAdmin = modeAdmin;
	}

	public String getSDA() {
		return SDA;
	}

	public void setSDA(String sDA) {
		SDA = sDA;
	}

	public String getDPQR() {
		return DPQR;
	}

	public void setDPQR(String dPQR) {
		DPQR = dPQR;
	}

	public String getDegAndImp() {
		return degAndImp;
	}

	public void setDegAndImp(String degAndImp) {
		this.degAndImp = degAndImp;
	}
}
