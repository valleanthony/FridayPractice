package com.company;

public class Shirts extends Clothes {
    private String TypeOfShirt;

    public Shirts(String color, String size, String typeOfShirt) {
        super(color, size);
        TypeOfShirt = typeOfShirt;
    }

    public Shirts() {
    }

    public String getTypeOfShirt() {
        return TypeOfShirt;
    }

    public void setTypeOfShirt(String typeOfShirt) {
        TypeOfShirt = typeOfShirt;
    }


}
