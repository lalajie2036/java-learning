package com.lalajie.java.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseEmployeeTest {

    @Test
    public void print() {
    }

    @Test
    public void getSalary() {
        BaseEmployee be = new MarketEmployee("user");
        assertEquals(3000,be.getSalary());
    }
}