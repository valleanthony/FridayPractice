package com.company;

public class Pants extends Clothes {
    private String typeOfPants;

    public Pants(String color, String size, String typeOfPants) {
        super(color, size);
        this.typeOfPants = typeOfPants;
    }

    public Pants() {
    }

    public String getTypeOfPants() {
        return typeOfPants;
    }

    public void setTypeOfPants(String typeOfPants) {
        this.typeOfPants = typeOfPants;
    }


}
