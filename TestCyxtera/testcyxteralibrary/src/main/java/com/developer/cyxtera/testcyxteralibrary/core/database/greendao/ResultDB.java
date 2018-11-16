package com.developer.cyxtera.testcyxteralibrary.core.database.greendao;

import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

public class ResultDB {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "description")
    private String description;

}
