package com.ironyard.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jasonskipper on 1/17/17.
 */
public class InfoHolder {
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

    private int days;
    private String name;
    private String status;
    private Date importantDate;

    public static int totalNumberOfInfoObjects;


    public InfoHolder(String aDate) throws ParseException {
        setImportantDate(formatter.parse(aDate));
        InfoHolder.totalNumberOfInfoObjects ++;

    }

    /**
     * Default Constructor
     */
    public InfoHolder(){
        InfoHolder.totalNumberOfInfoObjects ++;
    }

    public String getImportantDateFormatted(){
        String formatted = "unknown";
        if(getImportantDate() != null) {
            formatted = formatter.format(getImportantDate());
        }
        return formatted;
    }

    public Date getImportantDate() {
        return importantDate;
    }

    public void setImportantDate(Date importantDate) {
        this.importantDate = importantDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
