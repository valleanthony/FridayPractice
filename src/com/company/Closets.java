package com.company;

import java.sql.SQLOutput;

public class Closets {
    private Shirts myshirts;
    private Pants mypants;
    private Shoes myshoes;
    private Hat myhat;

    public Closets() {
    }

    public Closets(Shirts myshirts, Pants mypants, Shoes myshoes, Hat myhat) {
        this.myshirts = myshirts;
        this.mypants = mypants;
        this.myshoes = myshoes;
        this.myhat = myhat;
    }



    public Shirts getMyshirts() {
        return myshirts;
    }

    public void setMyshirts(Shirts myshirts) {
        this.myshirts = myshirts;
    }

    public Pants getMypants() {
        return mypants;
    }

    public void setMypants(Pants mypants) {
        this.mypants = mypants;
    }

    public Shoes getMyshoes() {
        return myshoes;
    }

    public void setMyshoes(Shoes myshoes) {
        this.myshoes = myshoes;
    }

    public Hat getMyhat() {
        return myhat;
    }

    public void setMyhat(Hat myhat) {
        this.myhat = myhat;
    }


    public void whatisinmycloset(){

        System.out.println("Hat: a " + myhat.getColor() +" "+ myhat.getTypeOfHat() + " size "+ myhat.getSize());
        System.out.println("Shirt: a " + myshirts.getColor() + " "+ myshirts.getTypeOfShirt() + " size "+ myshirts.getSize());
        System.out.println("Pants: a " + mypants.getColor() +  " "+ mypants.getTypeOfPants()+ " size "+ mypants.getSize());
        System.out.println("Shoes: a " + myshoes.getColor() + " "+ myshoes.getTypeOfShoe() + " size "+myshoes.getSize());

    }



//Not sure if i need this??
    Shirts c1 = new Shirts();
    Pants c2 = new Pants();
    Shoes c3 = new Shoes();
    Hat c4 = new Hat();


}
