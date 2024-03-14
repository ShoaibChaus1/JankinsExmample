package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContactBean implements Serializable
{
	private String pmid,cmid,uname;
	private Long phno,aphno;
	
	
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public ContactBean() {}

	public String getPmid() {
		return pmid;
	}

	public void setPmid(String pmid) {
		this.pmid = pmid;
	}

	public String getCmid() {
		return cmid;
	}

	public void setCmid(String cmid) {
		this.cmid = cmid;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public Long getAphno() {
		return aphno;
	}

	public void setAphno(Long aphno) {
		this.aphno = aphno;
	}
	
	

}
