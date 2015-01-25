package impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import base.*;

public class ObjectToXmlEXample1 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		try {
			System.out.println("executing object to xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			User user1 = new User("chota","chetan","abudhabi");
			User user2 = new User("daud","ibrahim","abudhabi");
			
			ArrayList<User> userList = new ArrayList<User>();
			userList.add(user1);
			userList.add(user2);
			
			Users users = new Users(1,userList);
			marshaller.marshal(users,new FileOutputStream("users.xml"));
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		
	}

}
