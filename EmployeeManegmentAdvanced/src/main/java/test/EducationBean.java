package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EducationBean implements Serializable
{
	private String hg,fos,clg,type,uname;
	private long year;
	private float marks;
	
	public EducationBean() {}
	
	

	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getHg() {
		return hg;
	}

	public void setHg(String hg) {
		this.hg = hg;
	}

	public String getFos() {
		return fos;
	}

	public void setFos(String fos) {
		this.fos = fos;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	

}
