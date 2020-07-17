package org.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Details {
	private List<Employee> em;

	public List<Employee> getEm() {
		return em;
	}

	public void setEm(List<Employee> em) {
		this.em = em;
	}

	
	

}
