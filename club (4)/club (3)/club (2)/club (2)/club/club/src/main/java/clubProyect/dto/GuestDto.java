package clubProyect.dto;



public class GuestDto {
private long id;
private UserDto userId; // Id del usuario
private PartnerDto partnerId; //id del socio que invita
private String statusActive;


public GuestDto() {}


public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}


public UserDto getUserId() {
    return userId;
}

public void setUserId(UserDto userId) {
    this.userId = userId;
}


public PartnerDto getPartnerId() {
    return partnerId;
}

public void setPartnerId(PartnerDto partnerId) {
    this.partnerId = partnerId;
}

public String getStatusActive() {
    return statusActive;
}

public void setStatusActive(String statusActive) {
    this.statusActive = statusActive;
}






}







