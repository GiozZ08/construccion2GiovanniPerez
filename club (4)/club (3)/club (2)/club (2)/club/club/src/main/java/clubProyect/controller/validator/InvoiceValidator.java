package clubProyect.controller.validator;

import clubProyect.dto.InvoiceDto;
import java.time.LocalDateTime;

public class InvoiceValidator extends CommonsValidator {

    public void validateInvoice(InvoiceDto invoiceDto) throws Exception {
        // Validación del ID de la factura
        isValidLong("ID de la factura", String.valueOf(invoiceDto.getIdInvoice()));

        // Validación del ID de la persona que realiza el consumo
        isValidLong("ID de la persona", String.valueOf(invoiceDto.getPersonId()));

        // Validación del ID del socio que paga el consumo
        isValidLong("ID del socio", String.valueOf(invoiceDto.getPartnerId()));
        
       
     

        // Validación del estado de la factura (pagada o sin pagar)
        if (!"paid".equals(invoiceDto.getStatusInvoice()) && !"unpaid".equals(invoiceDto.getStatusInvoice())) {
            throw new Exception("El estado de la factura debe ser 'paid' o 'unpaid'.");
        }

        // Validación del valor total de la factura
        isValidDouble("Valor total", String.valueOf(invoiceDto.getAmountTotal()));
        
         // Validación de la fecha de generación de la factura (no puede ser nula o futura)
        validateDateGeneration(invoiceDto.getDateGeneration());
    }
    // Método para validar que la fecha de generación no sea nula o futura
    private void validateDateGeneration(LocalDateTime dateGeneration) throws Exception {
        if (dateGeneration == null) {
            throw new Exception("La fecha de generación no puede ser nula.");
        }
        if (dateGeneration.isAfter(LocalDateTime.now())) {
            throw new Exception("La fecha de generación no puede ser una fecha futura.");
        }
    }
    
}
