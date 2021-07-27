package Native_curd_project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libraray {

	
	@Id
	private int lid;
	private String lname;
	private String laddrs;
	private int totalbk;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLaddrs() {
		return laddrs;
	}
	public void setLaddrs(String laddrs) {
		this.laddrs = laddrs;
	}
	public int getTotalbk() {
		return totalbk;
	}
	public void setTotalbk(int totalbk) {
		this.totalbk = totalbk;
	}
	@Override
	public String toString() {
		return "Libraray [lid=" + lid + ", lname=" + lname + ", laddrs=" + laddrs + ", totalbk=" + totalbk + "]";
	}
	
	
}
