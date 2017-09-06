package com.github.mikesam.tools.model;

import java.util.Date;

/**
 * Created by Mikesam on 2017/9/6.
 */
public class TUser {
    private int id;
    private String uuid;
    private String username;
    private String recommenderUuid;
    private String phone;
    private String keyString;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRecommenderUuid() {
        return recommenderUuid;
    }

    public void setRecommenderUuid(String recommenderUuid) {
        this.recommenderUuid = recommenderUuid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKeyString() {
        return keyString;
    }

    public void setKeyString(String keyString) {
        this.keyString = keyString;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public TUser(int id, String uuid, String username, String recommenderUuid, String phone, String keyString, Date createTime) {
        this.id = id;
        this.uuid = uuid;
        this.username = username;
        this.recommenderUuid = recommenderUuid;
        this.phone = phone;
        this.keyString = keyString;
        this.createTime = createTime;
    }
}
