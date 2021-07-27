package Progrms;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class User {
	
	@Id
	private int uid;
	private String uname;
	private String usal;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsal() {
		return usal;
	}
	public void setUsal(String usal) {
		this.usal = usal;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", usal=" + usal + "]";
	}
	

}
