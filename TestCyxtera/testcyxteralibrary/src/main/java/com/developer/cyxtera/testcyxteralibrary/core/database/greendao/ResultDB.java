package com.developer.cyxtera.testcyxteralibrary.core.database.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "result")
public class ResultDB {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "description")
    private String description;

    @Generated(hash = 1237248093)
    public ResultDB(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Generated(hash = 1007125541)
    public ResultDB() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
