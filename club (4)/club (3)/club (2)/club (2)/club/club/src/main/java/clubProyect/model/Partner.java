package clubProyect.model;

import java.time.LocalDateTime;


public class Partner {
    private Long id;
    private User userId;
    private double increaseFunds;
    private String isVIP;
    private LocalDateTime affiliationDate;
    

    public Partner() {}


    public long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public User getUserId() {
        return userId;
    }


    public void setUserId(User userId) {
        this.userId = userId;
    }


    public double getIncreaseFunds() {
        return increaseFunds;
    }


    public void setIncreaseFunds(double increaseFunds) {
        this.increaseFunds = increaseFunds;
    }


    public String isVIP() {
        return isVIP;
    }


    public void setVIP(String isVIP) {
        this.isVIP = "isVIP";
    }


    public LocalDateTime getAffiliationDate() {
        return affiliationDate;
    }


    public void setAffiliationDate(LocalDateTime affiliationDate) {
        this.affiliationDate = affiliationDate;
    }

   
}


    

