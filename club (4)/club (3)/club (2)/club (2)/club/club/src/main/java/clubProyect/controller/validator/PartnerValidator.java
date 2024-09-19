package clubProyect.controller.validator;

import clubProyect.dto.PartnerDto;
import clubProyect.dto.UserDto;

public class PartnerValidator extends CommonsValidator {
    public void validatePartner(PartnerDto partnerDto) throws Exception {
        if (partnerDto == null) {
            throw new Exception("PartnerDto no puede ser nulo.");
        }

        // Validaciones para los atributos del Partner
        isValidLong("ID del Socio", String.valueOf(partnerDto.getId()));
        isValidDouble("Fondos", String.valueOf(partnerDto.getIncreaseFunds()));

        // Validar si es VIP o Regular
        if (!"VIP".equals(partnerDto.getIsVIP()) && !"Regular".equals(partnerDto.getIsVIP())) {
            throw new Exception("El estado de suscripción debe ser 'VIP' o 'Regular'.");
        }

        // Validar la fecha de afiliación
        if (partnerDto.getAffiliationDate() == null) {
            throw new Exception("La fecha de afiliación no puede ser nula.");
        }

        // Validación para el UserDto asociado al Partner
        UserDto userDto = partnerDto.getUserId();
        if (userDto == null) {
            throw new Exception("UserDto asociado al Partner no puede ser nulo.");
        }

        // Validación del User usando el UserValidator
        UserValidator userValidator = new UserValidator();
        userValidator.validateUser(userDto); // Usamos el validador de UserDto
        
    }

}
