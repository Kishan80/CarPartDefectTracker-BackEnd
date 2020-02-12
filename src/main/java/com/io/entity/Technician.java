package com.io.entity;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.SequenceGenerator;
	import javax.persistence.Table;

	@Entity
	@Table(name="Technician")
	@SequenceGenerator(name="tech", sequenceName="tech_seq" ,initialValue=55231)
	public class Technician {
		
		
		@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="tech")
		@Column(name="techId")
		private int technicianId;
		
		@Column(name="Name")
		private String technicianName;
		
		@Column(name="Email")
		private String technicianEmail;
		
		@Column(name="dptId")
		private int dptId;

		public Technician() {
		}
		
		public Technician(String technicianName, String technicianEmail) {
			super();
			this.technicianName = technicianName;
			this.technicianEmail = technicianEmail;
		}

		public int getTechnicianId() {
			return technicianId;
		}

		public void setTechnicianId(int technicianId) {
			this.technicianId = technicianId;
		}

		public String getTechnicianName() {
			return technicianName;
		}

		public void setTechnicianName(String technicianName) {
			this.technicianName = technicianName;
		}

		public String getTechnicianEmail() {
			return technicianEmail;
		}

		public void setTechnicianEmail(String technicianEmail) {
			this.technicianEmail = technicianEmail;
		}
		
		public int getDptId() {
			return dptId;
		}

		public void setDptId(int dptId) {
			this.dptId = dptId;
		}
	
	

		@Override
		public String toString() {
			return "Technician [technicianId=" + technicianId + ", technicianName=" + technicianName + ", technicianEmail="
					+ technicianEmail + ", dptId=" + dptId + "]";
		}

		
	}
