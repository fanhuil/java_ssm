package com.itheima.domain;

/**
 * @author fanhuilin
 * @date 2021-10-20 15:06
 */
public class Account {
    private Integer id;
    private String name;
    private Double acount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAcount() {
        return acount;
    }

    public void setAcount(Double acount) {
        this.acount = acount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acount=" + acount +
                '}';
    }
}
