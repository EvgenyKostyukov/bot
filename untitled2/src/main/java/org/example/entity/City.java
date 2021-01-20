package org.example.entity;


public class City {

    private int id;
    private String city;
    private String info;


    public City() {
    }


    public City(String city, String info) {
        this.city = city;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String nameCities) {
        this.city = nameCities;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String referenceInformation) {
        this.info = referenceInformation;
    }


    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", nameCities='" + city + '\'' +
                ", referenceInformation='" + info + '\'' +
                '}';
    }
}



