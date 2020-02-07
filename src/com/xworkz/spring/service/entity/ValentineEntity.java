package com.xworkz.spring.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Valentine")
public class ValentineEntity implements Serializable {
	@Id
	@GenericGenerator(name="set",strategy="increment")
	@GeneratedValue(generator="set")
	@Column(name="V_id")
	private int vid;
	@Column(name="V_name")
	private String name;
	@Column(name="V_gift")
	private String gift;
	@Column(name="V_status")
	private String status;
	@Column(name="V_amountpaid")
	private double amountpaid;
	
		
		public ValentineEntity() {
			System.out.println("created\t"+this.getClass().getName());
		}

		public int getVid() {
			return vid;
		}

		public void setVid(int vid) {
			this.vid = vid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGift() {
			return gift;
		}

		public void setGift(String gift) {
			this.gift = gift;
		}

		public double getAmountpaid() {
			return amountpaid;
		}

		public void setAmountpaid(double amountpaid) {
			this.amountpaid = amountpaid;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		
		@Override
		public String toString() {
			return "ValentineEntity [vid=" + vid + ", name=" + name + ", gift=" + gift + ", amountpaid=" + amountpaid
					+ ", status=" + status + "]";
		}

		public ValentineEntity(int vid, String name, String gift, double amountpaid, String status) {
			super();
			this.vid = vid;
			this.name = name;
			this.gift = gift;
			this.amountpaid = amountpaid;
			this.status = status;
		}
		
		
		
		
}

