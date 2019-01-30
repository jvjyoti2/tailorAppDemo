package com.example.tailorApp.tailorAppDemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
	int cid;
	String cname;
	String cphone;

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + "]";
	}
}
