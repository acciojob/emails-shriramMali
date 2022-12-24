package com.driver;
import java.util.Date;

import java.text.SimpleDateFormat;

public class Mail {
   private Date date;
    private String sender;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String message;

    Mail(Date date, String sender, String message){
        this.message=message;
        this.sender=sender;
        this.date=date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
