package com.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("saikrishna")
	private String stdname;
	@Value("Hyderbad")
	private String city;
	@Value("#{temp}")
	private List<String> adress;
	
	public List<String> getAdress() {
		return adress;
	}
	public void setAdress(List<String> adress) {
		this.adress = adress;
	}
	//Getter and setter startfrom here
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [stdname=" + stdname + ", city=" + city + "]";
	}
	
}
