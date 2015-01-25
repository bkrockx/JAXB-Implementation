package impl;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  

import base.*;

public class XmlToObjectExample1 {
	
	public static void main(String[] args) throws JAXBException{
		
		File file = new File("users.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		Users u = (Users) jaxbUnmarshaller.unmarshal(file);  
        
        System.out.println("users id"+" "+u.getId());  
        System.out.println("user list:");  
        List<User> list=u.getUser();  
        
        for(User user:list){  
          System.out.println(user.getFirstName()+" "+user.getLastName()+"  "+user.getLocation()); 
        }
	}
}
