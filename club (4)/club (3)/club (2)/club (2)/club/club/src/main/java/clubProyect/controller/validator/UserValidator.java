package clubProyect.controller.validator;

import clubProyect.dto.PersonDto;
import clubProyect.dto.UserDto;

public class UserValidator extends CommonsValidator {
public void validateUser(UserDto userDto) throws Exception {
      
        if (userDto == null){
            throw new Exception ("PersonDto no puede ser nulo");
        }
       
        isValidString("Nombre de Usuario", userDto.getUserName());
        isValidString("Contraseña", userDto.getPassword());
        isValidString("Rol", userDto.getRole());

        // Validaciones para los atributos dentro del PersonDto
        PersonDto personDto = userDto.getPersonId(); // Asegúrate de obtener personId
        if (personDto == null) {
            throw new Exception("PersonDto dentro de UserDto no puede ser nulo.");
        }

        // Validaciones para los atributos dentro del PersonDto
        isValidLong("ID de la Persona", personDto.getIdentification());
        isValidLong("Número de Teléfono", personDto.getPhoneNumber());
        isValidString("Nombre de la Persona", personDto.getName());
    }
        
    }
     
    

 
        


