package com.jor.xxmaster.entity;

/*
 * @Title:  Bike
 * @Description:  ${TODO}<单车>
 * @author:  Jorble
 * @data:  2016/12/27 10:53
 * @version:  V1.0
 */
public class Bike {
    private String id;
    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Bike(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
