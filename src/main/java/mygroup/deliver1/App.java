package mygroup.deliver1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import mygroup.deliver1.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
       try {
    	   ObjectMapper mapper= new ObjectMapper();
		InputStream inputStream=new FileInputStream(new File("C:\\Users\\nk353\\AppData\\Local\\Temp\\Temp2_data.zip\\data\\28.json"));
		TypeReference<List<Person>> typeReference= new TypeReference<List<Person>>() {
		};
		List<Person> persons= mapper.readValue(inputStream,typeReference);
		for(Person p: persons) {
		
		
			
			System.out.println("name is "+p.getKurzbezeichnung()+ "id is" +p.getId()+ "address is " +p.getStrassenbezeichnung());
		}
		Person person= new Person();
		person.setKurzbezeichnung("Naveen Kumar");
		person.setId(23);
		person.setStrassenbezeichnung("Hyderabad");
		mapper.writeValue(new File("C:\\\\Users\\\\nk353\\\\AppData\\\\Local\\\\Temp\\\\Temp1_data.zip\\\\data\\\\personsOut.json"), person);
		inputStream.close();
       
        }catch (FileNotFoundException e) {
    	    e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
		

	}
    }

