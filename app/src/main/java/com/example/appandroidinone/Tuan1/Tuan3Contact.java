package com.example.appandroidinone.Tuan1;

public class Tuan3Contact {
    private String ava;
    private String name;
    private String phone;

    public Tuan3Contact(String name, String phone, String ava) {
        this.ava = ava;
        this.name = name;
        this.phone = phone;
    }

    public String getAva() {
        return ava;
    }

    public void setAva(String ava) {
        this.ava = ava;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
