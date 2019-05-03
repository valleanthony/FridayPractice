package com.company;

public class Shoes extends Clothes {
    private String TypeOfShoe;

    public Shoes(String color, String size, String typeOfShoe) {
        super(color, size);
        TypeOfShoe = typeOfShoe;
    }

    public Shoes() {
    }

    public String getTypeOfShoe() {
        return TypeOfShoe;
    }

    public void setTypeOfShoe(String typeOfShoe) {
        TypeOfShoe = typeOfShoe;
    }


}
