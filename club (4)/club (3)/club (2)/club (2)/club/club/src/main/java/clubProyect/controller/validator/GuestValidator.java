package clubProyect.controller.validator;

import clubProyect.dto.GuestDto;

public class GuestValidator extends CommonsValidator {

public void isValidGuest(GuestDto guestDto) throws Exception {
        if (guestDto == null) {
            throw new Exception("El invitado no puede ser nulo.");
        }

        // Validar id (long)
        if (guestDto.getId() <= 0) {
            throw new Exception("El ID del invitado debe ser un valor positivo.");
        }

        // Validar userId (UserDto)
        if (guestDto.getUserId() == null) {
            throw new Exception("El usuario asociado no puede ser nulo.");
        }

        // Validar partnerId (PartnerDto)
        if (guestDto.getPartnerId() == null) {
            throw new Exception("El socio asociado no puede ser nulo.");
        }

        // Validar statusActive (String)
        isValidString("Estado de la invitación", guestDto.getStatusActive());
        
        // Validar que el estado de la invitación sea "active" o "inactive"
        if (!"active".equals(guestDto.getStatusActive()) && !"inactive".equals(guestDto.getStatusActive())) {
            throw new Exception("El estado de la invitación debe ser 'active' o 'inactive'.");
        }
    }
}


