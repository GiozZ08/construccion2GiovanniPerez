package clubProyect.dto;

import java.time.LocalDateTime;



public class InvoiceDto {
private long idInvoice;
private PersonDto personId;
private PartnerDto partnerId;
private LocalDateTime dateGeneration;
private double amountTotal;
private String statusInvoice;


public InvoiceDto() {}

public long getIdInvoice() {
    return idInvoice;
}

public void setIdInvoice(long idInvoice) {
    this.idInvoice = idInvoice;
}

public PersonDto getPersonId() {
    return personId;
}

public void setPersonId(PersonDto personId) {
    this.personId = personId;
}

public PartnerDto getPartnerId() {
    return partnerId;
}

public void setPartnerId(PartnerDto partnerId) {
    this.partnerId = partnerId;
}

public LocalDateTime getDateGeneration() {
    return dateGeneration;
}

public void setDateGeneration(LocalDateTime dateGeneration) {
    this.dateGeneration = dateGeneration;
}

public double getAmountTotal() {
    return amountTotal;
}

public void setAmountTotal(double amountTotal) {
    this.amountTotal = amountTotal;
}

public String getStatusInvoice() {
    return statusInvoice;
}

public void setStatusInvoice(String statusInvoice) {
    this.statusInvoice = statusInvoice;
}


// METODO PARA MARCAR LA FACTURA COMO PAGADA

public void isPaid(){
    this.statusInvoice = "paid";
}

// METODO PARA MARCAR LA FACTURA COMO NO PAGADA

public void isNoPaid(){
    this.statusInvoice = "unpaid";
}

@Override
    public String toString() {
        return "Invoice{" +
               "id=" + idInvoice +
               ", idPersona=" + personId +
               ", idSocio=" + partnerId +
               ", fechaGeneracion='" + dateGeneration + '\'' +
               ", valorTotal=" + amountTotal +
               ", estadoPagada=" + statusInvoice +
               '}';
    }
}
