package com.itheima.domain;

/**
 * @author fanhuilin
 * @date 2021-10-14 16:38
 */
public class Account {
    private String name;
    private int acount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcount() {
        return acount;
    }

    public void setAcount(int acount) {
        this.acount = acount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", acount=" + acount +
                '}';
    }
}
