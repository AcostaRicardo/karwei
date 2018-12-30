package com.acosta.ricardo.logindemo;

public class Karwei {
    String title;
    String description;
    String contact_info;

    public Karwei(String title, String description, String contact_info){
        this.title = title;
        this.description = description;
        this.contact_info = contact_info;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getContact_info(){
        return contact_info;
    }
}
