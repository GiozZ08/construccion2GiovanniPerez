package clubProyect.Service.interfaces;

import clubProyect.dto.PartnerDto;

public interface AdminService {

 
    // Registro de nuevos socios no invitados
    void registerNewPartner(PartnerDto partnerDto) throws Exception;

    // Acceso al historial de facturas
    void viewClubInvoices();

    // Promoción de socios a VIP
    void promotePartnerToVIP(Long partnerId) throws Exception;
            }

