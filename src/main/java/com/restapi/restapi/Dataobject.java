package com.restapi.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dataobject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int nid;
	
	
	public String name;
	public String area;

	public Dataobject(int nid, String name, String area) {
		super();
		this.nid = nid;
		this.name = name;
		this.area = area;
	}
	
	public Dataobject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
