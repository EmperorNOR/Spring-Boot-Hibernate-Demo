package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class person {
	
	@Id
	private int person_id;
	
	private String person_name;
	
	private int person_age;
	
	private String person_address;
	
	private String person_zipcode;
	
	
	public String getPerson_zipcode() {
		return person_zipcode;
	}
	public void setPerson_zipcode(String person_zipcode) {
		this.person_zipcode = person_zipcode;
	}
	public String getPerson_mail() {
		return person_mail;
	}
	public void setPerson_mail(String person_mail) {
		this.person_mail = person_mail;
	}
	private String person_mail;
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public int getPerson_age() {
		return person_age;
	}
	public void setPerson_age(int person_age) {
		this.person_age = person_age;
	}
	public String getPerson_address() {
		return person_address;
	}
	public void setPerson_address(String person_address) {
		this.person_address = person_address;
	}

	@Override
	public String toString() {
		return "person [person_id=" + person_id + ", person_name=" + person_name + ", person_age=" + person_age
				+ ", person_address=" + person_address + ", person_zipcode=" + person_zipcode + ", person_mail="
				+ person_mail + "]";
	}
	
}
