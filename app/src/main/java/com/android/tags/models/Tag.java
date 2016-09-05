package com.android.tags.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Tag extends RealmObject {
    @PrimaryKey
    private int id;
    private String name;

    public Tag() {
    }

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int orderId) {
        this.id = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
