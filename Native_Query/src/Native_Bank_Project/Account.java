package Native_Bank_Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private int act_num;
	private String act_holder_name;
	private double act_bal;
	private long adhar;
	public int getAct_num() {
		return act_num;
	}
	public void setAct_num(int act_num) {
		this.act_num = act_num;
	}
	public String getAct_holder_name() {
		return act_holder_name;
	}
	public void setAct_holder_name(String act_holder_name) {
		this.act_holder_name = act_holder_name;
	}
	public double getAct_bal() {
		return act_bal;
	}
	public void setAct_bal(double act_bal) {
		this.act_bal = act_bal;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Account [act_num=" + act_num + ", act_holder_name=" + act_holder_name + ", act_bal=" + act_bal
				+ ", adhar=" + adhar + "]";
	}
}