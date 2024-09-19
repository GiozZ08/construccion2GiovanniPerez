package clubProyect.dao;

import clubProyect.dao.interfaces.PersonDao;
import clubProyect.dto.PersonDto;

public class PersonDaoImplementation implements PersonDao {

	@Override
	public boolean existsByDocument(PersonDto personDto) throws Exception {
		return personDto.getIdentification()==123456789;
	}

	@Override
	public void createPerson(PersonDto personDto) throws Exception {
		System.out.println("se ha creado la persona");
	}
	
	@Override
	public void deletePerson(PersonDto personDto)throws Exception {
		System.out.println("se ha eliminado la persona");
	}
}
