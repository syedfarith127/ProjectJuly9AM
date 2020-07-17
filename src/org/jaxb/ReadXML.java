package org.jaxb;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXML {
	public static void main(String[] args) throws JAXBException {
		
	
	
	JAXBContext xl= JAXBContext.newInstance(Details.class);
	
	Unmarshaller un = xl.createUnmarshaller();
	
	File f= new File("C:\\Users\\Hai Guys\\eclipse-workspace\\JAXB\\Sample\\Practice.xml");
	
	Object obj = un.unmarshal(f);
	
	Details d= (Details)obj;
	
	List<Employee> j = d.getEm();
	System.out.println(j);
	for (Employee n : j) {
		System.out.println(n.getId());
	}
	
	
	
	
	
	
	
	
	

}
}