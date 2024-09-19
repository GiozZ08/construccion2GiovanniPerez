package clubProyect.controller.validator;

import clubProyect.dto.InvoiceDetailDto;

public class InvoiceDetailValidator extends CommonsValidator {
    
public void isValidInvoiceDetail(InvoiceDetailDto invoiceDetailDto) throws Exception {
        if (invoiceDetailDto == null) {
            throw new Exception("El detalle de la factura no puede ser nulo.");
        }

        // Validar idRegister (long)
        if (invoiceDetailDto.getIdRegister() <= 0) {
            throw new Exception("El ID de registro debe ser un valor positivo.");
        }

        // Validar idInvoice (InvoiceDto)
        if (invoiceDetailDto.getIdInvoice() == null) {
            throw new Exception("La factura asociada no puede ser nula.");
        }

        // Validar item (int)
        if (invoiceDetailDto.getItem() <= 0) {
            throw new Exception("El número de ítem debe ser un valor positivo.");
        }

        // Validar description (String)
        isValidString("Descripción del ítem", invoiceDetailDto.getDescription());

        // Validar valueItem (double)
        if (invoiceDetailDto.getValueItem() <= 0) {
            throw new Exception("El valor del ítem debe ser un número positivo.");
        }
    }
}
