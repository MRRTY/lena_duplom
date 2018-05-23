package com.facecheck.core.entity;

import java.util.Objects;

public class Location {
    private String country;
    private String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(country, location.country) &&
                Objects.equals(city, location.city);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country, city);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
