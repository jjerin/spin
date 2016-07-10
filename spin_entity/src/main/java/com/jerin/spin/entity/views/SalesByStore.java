package com.jerin.spin.entity.views;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sales_by_store database table.
 * 
 */
@Entity
@Table(name="sales_by_store")
@NamedQuery(name="SalesByStore.findAll", query="SELECT s FROM SalesByStore s")
public class SalesByStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id //temporary fix
	@Column(length=91)
	private String manager;

	@Column(length=101)
	private String store;

	@Column(name="total_sales", precision=10, scale=2)
	private BigDecimal totalSales;

	public SalesByStore() {
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getStore() {
		return this.store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public BigDecimal getTotalSales() {
		return this.totalSales;
	}

	public void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}

}