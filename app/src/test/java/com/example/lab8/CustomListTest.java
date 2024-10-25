package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


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

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be 0");
        list.addCity(new City("edmonton", "alberta"));
        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "After add, city count should be 1");
    }

    @Test
    void testHasCity() {
        CustomList cityList = MockCityList();

        assertFalse(cityList.hasCity(mockCity()));

        assertTrue(cityList.hasCity(new City("Edmonton", "Alberta")));

        City city = new City("Regina", "Saskatchewan");
        assertFalse(cityList.hasCity(city));
    }

//    @Test
//    void testDelete() {
//        CustomList cityList = MockCityList();
//
//        City city = new City("Regina", "Saskatchewan");
//        cityList.add(city);
//        assertTrue(cityList.hasCity(city));
//        cityList.delete(city);
//        assertFalse(cityList.hasCity(city));
//    }


//
//    @Test
//    public void countCitiesTest() {
//        CustomList list = MockCityList();
//        int expectedCitiesCount = 0;
//        assertEquals(expectedCitiesCount, list.countCities());
//        City newCity = new City("Edmonton", "Alberta");
//        list.addCity(newCity);
//        int expectedCitiesCountAfterAdd = 1;
//        assertEquals(expectedCitiesCountAfterAdd, list.countCities());
//    }

}
