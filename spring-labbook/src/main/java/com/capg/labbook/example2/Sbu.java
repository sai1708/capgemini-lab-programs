package com.capg.labbook.example2;

import java.util.ArrayList;
import java.util.List;

public class Sbu {
	
	private int sbuid;
	private String sbuName;
	private String sbuHead;
	private ArrayList<Employee> emplist;
	
	public int getSbuid() {
		return sbuid;
	}
	public void setSbuid(int sbuid) {
		this.sbuid = sbuid;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public ArrayList<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(ArrayList<Employee> emplist) {
		this.emplist = emplist;
	}
	@Override
	public String toString() {
		return "Sbu [sbuid=" + sbuid + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", emplist=" + emplist + "]";
	}
	
	
}
