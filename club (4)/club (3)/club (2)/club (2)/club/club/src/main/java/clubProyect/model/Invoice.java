package clubProyect.model;

import java.time.LocalDateTime;



public class Invoice {
private long idInvoice;
private Person personId;
private Partner partnerId;
private LocalDateTime dateGenaration;
private double amountTotal;
private String statusInvoice;


public Invoice() {}

public long getIdInvoice() {
    return idInvoice;
}

public void setIdInvoice(long idInvoice) {
    this.idInvoice = idInvoice;
}

public Person getPersonId() {
    return personId;
}

public void setPersonId(Person personId) {
    this.personId = personId;
}

public Partner getPartnerId() {
    return partnerId;
}

public void setPartnerId(Partner partnerId) {
    this.partnerId = partnerId;
}

public LocalDateTime getDateGenaration() {
    return dateGenaration;
}

public void setDateGenaration(LocalDateTime dateGenaration) {
    this.dateGenaration = dateGenaration;
}

public double getAmountTotal() {
    return amountTotal;
}

public void setAmountTotal(double amountTotal) {
    this.amountTotal = amountTotal;
}

public String isStatusInvoice() {
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
               ", fechaGeneracion='" + dateGenaration + '\'' +
               ", valorTotal=" + amountTotal +
               ", estadoPagada=" + statusInvoice +
               '}';
    }
}








