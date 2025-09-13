package com.example.entity;

import java.util.Date;

public class LoanRecord {
	private Date borrow_date, due_date, return_date;
	
	public LoanRecord(){}

	public LoanRecord(Date borrow_date, Date due_date, Date return_date)
	{
		super();
		this.borrow_date = borrow_date;
		this.due_date = due_date;
		this.return_date = return_date;
	}

	public Date getBorrow_date() {
		return borrow_date;
	}

	public void setBorrow_date(Date borrow_date) {
		this.borrow_date = borrow_date;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	@Override
	public String toString() {
		return "LoanRecord [borrow_date=" + borrow_date + ", due_date=" + due_date + ", return_date=" + return_date
				+ "]";
	}
	
	
	
}
