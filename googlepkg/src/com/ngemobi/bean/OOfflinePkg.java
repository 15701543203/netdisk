package com.ngemobi.bean;

import java.util.Date;

public class OOfflinePkg {
	private String pkg;
	private Date cteatedate;
	public OOfflinePkg() {
		super();
	}
	public OOfflinePkg(String pkg, Date cteatedate) {
		super();
		this.pkg = pkg;
		this.cteatedate = cteatedate;
	}
	public String getPkg() {
		return pkg;
	}
	public void setPkg(String pkg) {
		this.pkg = pkg;
	}
	public Date getCteatedate() {
		return cteatedate;
	}
	public void setCteatedate(Date cteatedate) {
		this.cteatedate = cteatedate;
	}
	@Override
	public String toString() {
		return "OOfflinePkg [pkg=" + pkg + ", cteatedate=" + cteatedate + "]";
	}
	
}
