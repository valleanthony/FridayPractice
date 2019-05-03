package com.company;

public class Hat extends Clothes {
    private String typeOfHat;

    public Hat(String color, String size, String typeOfHat) {
        super(color, size);
        this.typeOfHat = typeOfHat;
    }

    public Hat() {
    }

    public String getTypeOfHat() {
        return typeOfHat;
    }

    public void setTypeOfHat(String typeOfHat) {
        this.typeOfHat = typeOfHat;
    }


}
