package com.example.filter_lab.models;

import java.util.Date;

public class LastAccess {

    private int id;
    private User userId;
    private Date lastAccessTime;

    public LastAccess(int id, User userId, Date lastAccessTime) {
        this.id = id;
        this.userId = userId;
        this.lastAccessTime = lastAccessTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }
}