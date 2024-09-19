package clubProyect.dto;

import java.time.LocalDateTime;


public class PartnerDto {
    private Long id;
    private UserDto userId;
    private double increaseFunds;
    private String isVIP;
    private LocalDateTime affiliationDate;
    

    public PartnerDto() {}


    public long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public UserDto getUserId() {
        return userId;
    }


    public void setUserId(UserDto userId) {
        this.userId = userId;
    }


    public double getIncreaseFunds() {
        return increaseFunds;
    }


    public void setIncreaseFunds(double increaseFunds) {
        this.increaseFunds = increaseFunds;
    }


    public String getIsVIP() {
        return isVIP;
    }


    public void setVIP(String IsVIP) {
        this.isVIP = "isVIP";
    }


    public LocalDateTime getAffiliationDate() {
        return affiliationDate;
    }


    public void setAffiliationDate(LocalDateTime affiliationDate) {
        this.affiliationDate = affiliationDate;
    }

 
   
}

