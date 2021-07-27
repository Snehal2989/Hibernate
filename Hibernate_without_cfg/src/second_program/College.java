package second_program;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	
   @Id
   private int col_id;
   public int getCol_id() {
	return col_id;
}
public void setCol_id(int col_id) {
	this.col_id = col_id;
}
public String getCol_name() {
	return col_name;
}
public void setCol_name(String col_name) {
	this.col_name = col_name;
}
public String getCol_address() {
	return col_address;
}
public void setCol_address(String col_address) {
	this.col_address = col_address;
}
private String col_name;
   private String col_address;
   
   

}
