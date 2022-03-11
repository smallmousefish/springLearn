package com.demo.enumDemo;


import com.demo.enumTeset.EnumTest;

public enum Color {
    HOLDER,
    AAAA;
    private String instance;
    Color(){
        instance = "ffff";
    }
    public String getFFF()
    {
        return instance;
    }

}

