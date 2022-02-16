package com.company;

import com.company.interfaces.Converter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {

    Converter converterIf;
    Converter converterSwitch;

    @Before
    public void setUp() throws Exception {
        converterIf = new ConverterIf();
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnMonthNameFromIfStatement() {
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("March", converterIf.convertMonth(3));
        assertEquals("Invalid Input", converterIf.convertMonth(0));
    }
    @Test
    public void shouldReturnMonthNameFromSwitchStatement() {
        assertEquals("January", converterSwitch.convertMonth(1));
        assertEquals("November", converterSwitch.convertMonth(11));
        assertEquals("Invalid Input", converterSwitch.convertMonth(13));
    }

    @Test
    public void shouldReturnDayOfWeekFromIfStatement() {
        assertEquals("Monday", converterIf.convertDay(2));
        assertEquals("Sunday", converterIf.convertDay(1));
        assertEquals("Invalid Input", converterIf.convertDay(0));
    }
    @Test
    public void shouldReturnDayOfWeekFromSwitchStatement() {
        assertEquals("Monday", converterSwitch.convertDay(2));
        assertEquals("Wednesday", converterSwitch.convertDay(4));
        assertEquals("Invalid Input", converterSwitch.convertDay(15));
    }
}