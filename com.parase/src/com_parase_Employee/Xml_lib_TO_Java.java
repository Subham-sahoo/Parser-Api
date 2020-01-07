package com_parase_Employee;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Xml_lib_TO_Java
 {

	public void unmarshalling(String Filename) throws JAXBException {

		File Xml_File = new File(Filename);
		JAXBContext employee = JAXBContext.newInstance(Employee.class);
		Unmarshaller un = employee.createUnmarshaller();
		Employee eobj = (Employee) un.unmarshal(Xml_File);

		System.out.println(eobj);

	}
}
