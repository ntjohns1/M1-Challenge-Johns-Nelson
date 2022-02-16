package com.company;

import com.company.interfaces.Converter;

public class ConverterApplication {
    public static void main(String[] args) {
        Converter converterIf = new ConverterIf();
        Converter converterSwitch = new ConverterSwitch();
        System.out.println(converterIf.convertMonth(3));
        System.out.println(converterIf.convertDay(4));
        System.out.println(converterSwitch.convertMonth(5));
        System.out.println(converterSwitch.convertDay(2));
    }
}
