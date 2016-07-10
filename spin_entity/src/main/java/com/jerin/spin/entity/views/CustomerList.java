package com.jerin.spin.entity.views;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_list database table.
 * 
 */
@Entity
@Table(name="customer_list")
@NamedQuery(name="CustomerList.findAll", query="SELECT c FROM CustomerList c")
public class CustomerList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false, length=50)
	private String address;

	@Column(nullable=false, length=50)
	private String city;

	@Column(nullable=false, length=50)
	private String country;

	@Id //temporary fix
	@Column(nullable=false)
	private int id;

	@Column(length=91)
	private String name;

	@Column(nullable=false, length=6)
	private String notes;

	@Column(nullable=false, length=20)
	private String phone;

	@Column(nullable=false)
	private byte sid;

	@Column(name="`zip code`", length=10)
	private String zip_code;

	public CustomerList() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte getSid() {
		return this.sid;
	}

	public void setSid(byte sid) {
		this.sid = sid;
	}

	public String getZip_code() {
		return this.zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

}