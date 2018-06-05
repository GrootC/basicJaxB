package com.test.jaxb.app;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Tester {

    public static void main(String[] args) {
        try {
            UsernameToken customer = new UsernameToken("ABC", "MMA");
            JAXBContext jaxbContext = JAXBContext.newInstance(UsernameToken.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
