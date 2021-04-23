package com.drm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DRM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	// MOA
	private boolean DCDI;
	private boolean ADCC;
	private boolean ADCP;

	// DFORM
	private boolean sterile;
	private boolean PFLI;

	// DSTRENGTH
	private boolean mg_1000;
	private boolean ml_40_at_25mg;

	// MOADMIN
	private boolean INTRA;
	private boolean DIS;
	private boolean max_1000;

	// SDA
	private boolean stable_solution;

	// DPQR
	private boolean parental_dosage_form;

	// DEGIMP
	private boolean process_related;
	private boolean product_related;
	
	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

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

	public boolean isDCDI() {
		return DCDI;
	}

	public void setDCDI(boolean dCDI) {
		DCDI = dCDI;
	}

	public boolean isADCC() {
		return ADCC;
	}

	public void setADCC(boolean aDCC) {
		ADCC = aDCC;
	}

	public boolean isADCP() {
		return ADCP;
	}

	public void setADCP(boolean aDCP) {
		ADCP = aDCP;
	}

	public boolean isSterile() {
		return sterile;
	}

	public void setSterile(boolean sterile) {
		this.sterile = sterile;
	}

	public boolean isPFLI() {
		return PFLI;
	}

	public void setPFLI(boolean pFLI) {
		PFLI = pFLI;
	}

	public boolean isMg_1000() {
		return mg_1000;
	}

	public void setMg_1000(boolean mg_1000) {
		this.mg_1000 = mg_1000;
	}

	public boolean isMl_40_at_25mg() {
		return ml_40_at_25mg;
	}

	public void setMl_40_at_25mg(boolean ml_40_at_25mg) {
		this.ml_40_at_25mg = ml_40_at_25mg;
	}

	public boolean isINTRA() {
		return INTRA;
	}

	public void setINTRA(boolean iNTRA) {
		INTRA = iNTRA;
	}

	public boolean isDIS() {
		return DIS;
	}

	public void setDIS(boolean dIS) {
		DIS = dIS;
	}

	public boolean isMax_1000() {
		return max_1000;
	}

	public void setMax_1000(boolean max_1000) {
		this.max_1000 = max_1000;
	}

	public boolean isStable_solution() {
		return stable_solution;
	}

	public void setStable_solution(boolean stable_solution) {
		this.stable_solution = stable_solution;
	}

	public boolean isParental_dosage_form() {
		return parental_dosage_form;
	}

	public void setParental_dosage_form(boolean parental_dosage_form) {
		this.parental_dosage_form = parental_dosage_form;
	}

	public boolean isProcess_related() {
		return process_related;
	}

	public void setProcess_related(boolean process_related) {
		this.process_related = process_related;
	}

	public boolean isProduct_related() {
		return product_related;
	}

	public void setProduct_related(boolean product_related) {
		this.product_related = product_related;
	}

}
