package com.hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id@GeneratedValue
	  private long id;
	    private String firstName;
	    private String lastName;
	    private int age;
	    
	    @OneToMany
	    private List<Address> addr;
	    
	    
	    
	  
		public List<Address> getAddr() {
			return addr;
		}
		public void setAddr(List<Address> addr) {
			this.addr = addr;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", addr=" + addr + "]";
		}
	    
	    
}
