package com.product;

public class product {
    public int Id;
    public String Name;
    public String MfgDate;
    public String expireDate;

    public product(int id, String name, String mfgDate, String expireDate) {
        Id = id;
        Name = name;
        MfgDate = mfgDate;
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "product{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", MfgDate='" + MfgDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }
}
