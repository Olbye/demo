package com.example.demo.test.vo;

public class TestVo {
    private int id;
    private String name;
    private String sex;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TestVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
