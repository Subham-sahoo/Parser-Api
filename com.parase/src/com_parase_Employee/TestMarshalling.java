package com_parase_Employee;

import javax.xml.bind.JAXBException;

public class TestMarshalling {

	public static void main(String[] args) throws JAXBException {
		Employee eobj = new Employee("subham", "male", "kodigeheli", 404, 40000);
		Java_to_XML_Lib parser = new Java_to_XML_Lib();

		parser.marshalling(eobj);
	}

}
