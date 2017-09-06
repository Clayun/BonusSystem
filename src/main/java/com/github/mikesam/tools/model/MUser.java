package com.github.mikesam.tools.model;

/**
 * Created by Mikesam on 2017/9/6.
 */
public class MUser {
    private String username;
    private String recommenderUuid;
    private String phone;

    public MUser(String username, String recommenderUuid, String phone) {
        this.username = username;
        this.recommenderUuid = recommenderUuid;
        this.phone = phone;
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
}
