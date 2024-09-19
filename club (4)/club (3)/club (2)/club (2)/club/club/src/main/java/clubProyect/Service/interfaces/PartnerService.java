
package clubProyect.Service.interfaces;

import clubProyect.dto.GuestDto;
import clubProyect.dto.InvoiceDto;
import java.util.List;


public interface PartnerService {
    // Métodos relacionados con la gestión de invitados por parte del socio
    void addGuest(GuestDto guestDto) throws Exception;
    void removeGuest(Long guestId) throws Exception;
    List<GuestDto> viewGuestList(Long partnerId);

    // Métodos relacionados con la gestión de facturas
    List<InvoiceDto> viewInvoiceHistory(Long partnerId);
    void payInvoice(Long invoiceId) throws Exception;
}
