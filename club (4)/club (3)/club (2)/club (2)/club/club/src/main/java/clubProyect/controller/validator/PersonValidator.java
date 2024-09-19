package clubProyect.controller.validator;

public class PersonValidator extends CommonsValidator {
    
public void validatePerson(String name, long phoneNumber, long identification, long id) throws Exception {
        isValidString("Name", name);
        isValidLong("Phone Number", phoneNumber);
        isValidLong("Identification", identification);
        isValidLong("ID", id);
    }


   
}