package com.example.lab8;


import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * Compares this city with another city by name for order.
     * @param o
     *      the city to be compared
     * @return
     *      a negative integer, zero, or a positive integer as this city is less than,
     *      equal to, or greater than the specified city
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Constructs a new City instance.
     * @param city
     *      the name of the city
     * @param province
     *      the name of the province the city is in
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     * @return
     *      the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the name of the province.
     * @return
     *      the province name
     */
    String getProvinceName () {
        return this.province;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * @param o
     *      the reference object with which to compare
     * @return
     *      true if this object is the same as the obj argument; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return this.city.equals(city.city) && this.province.equals(city.province);
    }

    /**
     * Returns a hash code value for the object.
     * @return
     *      a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

}


