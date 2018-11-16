package com.developer.cyxtera.testcyxteralibrary.core.database.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "logIntents")
public class LogIntentsDB {

    @Id(autoincrement = true)
    private Long idLogIntent;

    @Property(nameInDb = "user")
    private String user;

    @Property(nameInDb = "createdDate")
    private Date createdDate;


    @Property(nameInDb = "idresult")
    private Long idResult;


    @Generated(hash = 177610520)
    public LogIntentsDB(Long idLogIntent, String user, Date createdDate,
            Long idResult) {
        this.idLogIntent = idLogIntent;
        this.user = user;
        this.createdDate = createdDate;
        this.idResult = idResult;
    }


    @Generated(hash = 698199988)
    public LogIntentsDB() {
    }


    public Long getIdLogIntent() {
        return this.idLogIntent;
    }


    public void setIdLogIntent(Long idLogIntent) {
        this.idLogIntent = idLogIntent;
    }


    public String getUser() {
        return this.user;
    }


    public void setUser(String user) {
        this.user = user;
    }


    public Date getCreatedDate() {
        return this.createdDate;
    }


    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    public Long getIdResult() {
        return this.idResult;
    }


    public void setIdResult(Long idResult) {
        this.idResult = idResult;
    }


}
