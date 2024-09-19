package clubProyect.controller.validator;

public abstract class CommonsValidator {
    
 

    public long isValidLong(String element, long value) throws Exception {
        if (value <= 0) {
            throw new Exception(element + " debe ser un número positivo.");
        }
        return value;
    }
 public void isValidString(String element, String value) throws Exception {
        if (value == null || value.trim().isEmpty()) {
            throw new Exception(element + " no puede ser un valor vacío");
        }
    }

    // Validación de un entero válido
    public int isValidInteger(String element, String value) throws Exception {
        isValidString(element, value);
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new Exception(element + " debe ser un valor entero válido");
        }
    }

    // Validación de un Long válido
    public long isValidLong(String element, String value) throws Exception {
        isValidString(element, value);
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            throw new Exception(element + " debe ser un valor Long válido");
        }
    }

    // Validación de un número de teléfono (Long con 10 dígitos)
    public long isValidPhoneNumber(String element, String value) throws Exception {
        isValidLong(element, value);
        if (value.length() != 10) {
            throw new Exception(element + " debe contener 10 dígitos");
        }
        return Long.parseLong(value);
    }

    // Validación de un Double válido
    public double isValidDouble(String element, String value) throws Exception {
        isValidString(element, value);
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new Exception(element + " debe ser un valor numérico decimal válido");
        }
    }
    
    
}
 

