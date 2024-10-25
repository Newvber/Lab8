package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class CustomListTest {
    public CustomList MockCityList() {
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be 0");
        list.addCity(new City("edmonton", "alberta"));
        //check count of list increase by 1
        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "After add, city count should be 1");
    }

    @Test
    public void deleteCityTest() {
        CustomList list = MockCityList();
        City newCity = new City("Edmonton", "Alberta");
        list.addCity(newCity);
        list.deleteCity(newCity);
        int expectedCountAfterDelete = 0;
        assertEquals(expectedCountAfterDelete, list.getCount(), "After deleting the newCity, the list should be empty again. ");
    }

    @Test
    public void countCitiesTest() {
        CustomList list = MockCityList();
        int expectedCitiesCount = 0;
        assertEquals(expectedCitiesCount, list.countCities());
        City newCity = new City("Edmonton", "Alberta");
        list.addCity(newCity);
        int expectedCitiesCountAfterAdd = 1;
        assertEquals(expectedCitiesCountAfterAdd, list.countCities());
    }

}
