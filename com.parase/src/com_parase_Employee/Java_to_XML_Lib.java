package com_parase_Employee;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Java_to_XML_Lib {
	public void marshalling(Employee eobj) throws JAXBException

	{
		JAXBContext employee = JAXBContext.newInstance(Employee.class);
		Marshaller m = employee.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		m.marshal(eobj, System.out);
		m.marshal(eobj, new File("./employee.xml"));
	}
}