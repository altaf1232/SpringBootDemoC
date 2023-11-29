package com.springbootdemo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "custom")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "custom_seq", allocationSize = 1, name = "CUST_SEQ")
	private Long job_no;
	private String regn_no ;
	private String receipt_dt;
	private Date bond_por;
	
	
	public StudentEntity() {}
	public StudentEntity(Long job_no, String regn_no, String receipt_dt, Date bond_por) {
		this.job_no = job_no;
		this.regn_no = regn_no;
		this.receipt_dt = receipt_dt;
		this.bond_por = bond_por;
	}
	public Long getJob_no() {
		return job_no;
	}
	public void setJob_no(Long job_no) {
		this.job_no = job_no;
	}
	public String getRegn_no() {
		return regn_no;
	}
	public void setRegn_no(String regn_no) {
		this.regn_no = regn_no;
	}
	public String getReceipt_dt() {
		return receipt_dt;
	}
	public void setReceipt_dt(String receipt_dt) {
		this.receipt_dt = receipt_dt;
	}
	public Date getBond_por() {
		return bond_por;
	}
	public void setBond_por(Date bond_por) {
		this.bond_por = bond_por;
	}
	@Override
	public String toString() {
		return "StudentEntity [job_no=" + job_no + ", regn_no=" + regn_no + ", receipt_dt=" + receipt_dt + ", bond_por="
				+ bond_por + "]";
	}
	
	
}