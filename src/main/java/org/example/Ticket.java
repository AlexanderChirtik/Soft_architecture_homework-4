package org.example;

import javax.xml.crypto.Data;
import java.util.Date;

public class Ticket {

    //region Fields
    private int id;
    private int customerId;
    private Date date;
    private String qrcode;
    private boolean enable = true;
    //endregion

    //region Getters and Setters

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }
    //endregion
}
