package com.io.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Partlist_Table")
public class PartList {

	@Id
	private String partNumber;

	@Column(length = 40)
	private String partName;

	@Column(length = 40)
	private String description;

	private int plantNumber;

	private String zbIndicator;

	private int supplierNumber;

	@Column(length = 40)
	private String supplierName;

	@Column(length = 20)
	private String colourIndicator;

	private String mrpControllerIndex;

	@Column(length = 40)
	private String mrpControllerName;

	@Column(length = 40)
	private String modelSeries;

	@Column(length = 40)
	private String typeVersion;

	public PartList() {
		super();
	}

	public PartList(String partNumber, String partName, String description, int plantNumber, String zbIndicator,
			int supplierNumber, String supplierName, String colourIndicator, String mrpControllerIndex,
			String mrpControllerName, String modelSeries, String typeVersion) {
		super();
		this.partNumber = partNumber;
		this.partName = partName;
		this.description = description;
		this.plantNumber = plantNumber;
		this.zbIndicator = zbIndicator;
		this.supplierNumber = supplierNumber;
		this.supplierName = supplierName;
		this.colourIndicator = colourIndicator;
		this.mrpControllerIndex = mrpControllerIndex;
		this.mrpControllerName = mrpControllerName;
		this.modelSeries = modelSeries;
		this.typeVersion = typeVersion;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPlantNumber() {
		return plantNumber;
	}

	public void setPlantNumber(int plantNumber) {
		this.plantNumber = plantNumber;
	}

	public String getZbIndicator() {
		return zbIndicator;
	}

	public void setZbIndicator(String zbIndicator) {
		this.zbIndicator = zbIndicator;
	}

	public int getSupplierNumber() {
		return supplierNumber;
	}

	public void setSupplierNumber(int supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getColourIndicator() {
		return colourIndicator;
	}

	public void setColourIndicator(String colourIndicator) {
		this.colourIndicator = colourIndicator;
	}

	public String getMrpControllerIndex() {
		return mrpControllerIndex;
	}

	public void setMrpControllerIndex(String mrpControllerIndex) {
		this.mrpControllerIndex = mrpControllerIndex;
	}

	public String getMrpControllerName() {
		return mrpControllerName;
	}

	public void setMrpControllerName(String mrpControllerName) {
		this.mrpControllerName = mrpControllerName;
	}

	public String getModelSeries() {
		return modelSeries;
	}

	public void setModelSeries(String modelSeries) {
		this.modelSeries = modelSeries;
	}

	public String getTypeVersion() {
		return typeVersion;
	}

	public void setTypeVersion(String typeVersion) {
		this.typeVersion = typeVersion;
	}

	@Override
	public String toString() {
		return "PartList [partNumber=" + partNumber + ", partName=" + partName + ", description=" + description
				+ ", plantNumber=" + plantNumber + ", zbIndicator=" + zbIndicator + ", supplierNumber=" + supplierNumber
				+ ", supplierName=" + supplierName + ", colourIndicator=" + colourIndicator + ", mrpControllerIndex="
				+ mrpControllerIndex + ", mrpControllerName=" + mrpControllerName + ", modelSeries=" + modelSeries
				+ ", typeVersion=" + typeVersion + "]";
	}

}
