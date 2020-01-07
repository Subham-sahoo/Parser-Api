package com_parase_Employee;

import javax.xml.bind.JAXBException;

public class TestUnmarshalling {

	public static void main(String[] args) throws JAXBException {
		String name="employee.xml";
		Xml_lib_TO_Java parser=new Xml_lib_TO_Java();
		parser.unmarshalling(name);
		
	}

}
