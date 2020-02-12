package com.io.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DefectList")
@SequenceGenerator(name="defect", sequenceName="defect_seq" ,initialValue=5236)
public class DefectList {
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="defect")
	@Column(length = 20,name="dftNum")
	private int defectNumber;

	@Column(length = 20,name="plntNum")
	private int plantNumber;

	@Column(length = 20,name="prtNum")
	private String partNumber;

	@Column(length = 20,name="status")
	private String overAllStatus;

	@Column(length = 20,name="dptName")
	private String departmentName;

	@Column(length = 20,name="techName")
	private String technicianName;

	@Column(length = 20,name="decision")
	private String decision;
	
	public DefectList() {
	}

	public DefectList(int defectNumber, int plantNumber, String partNumber, String overAllStatus, String departmentName,
			String technicianName, String decision) {
		super();
		this.defectNumber = defectNumber;
		this.plantNumber = plantNumber;
		this.partNumber = partNumber;
		this.overAllStatus = overAllStatus;
		this.departmentName = departmentName;
		this.technicianName = technicianName;
		this.decision = decision;
	}

	public int getDefectNumber() {
		return defectNumber;
	}

	public void setDefectNumber(int defectNumber) {
		this.defectNumber = defectNumber;
	}

	public int getPlantNumber() {
		return plantNumber;
	}

	public void setPlantNumber(int plantNumber) {
		this.plantNumber = plantNumber;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getOverAllStatus() {
		return overAllStatus;
	}

	public void setOverAllStatus(String overAllStatus) {
		this.overAllStatus = overAllStatus;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getTechnicianName() {
		return technicianName;
	}

	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	@Override
	public String toString() {
		return "DefectList [defectNumber=" + defectNumber + ", plantNumber=" + plantNumber + ", partNumber="
				+ partNumber + ", overAllStatus=" + overAllStatus + ", departmentName=" + departmentName
				+ ", technicianName=" + technicianName + ", decision=" + decision + "]";
	}

}
