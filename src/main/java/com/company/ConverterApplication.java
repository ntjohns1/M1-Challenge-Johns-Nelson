package com.company;

import com.company.interfaces.Converter;

public class ConverterApplication {
    public static void main(String[] args) {
        Converter converterIf = new ConverterIf();
        Converter converterSwitch = new ConverterSwitch();
    }
}
