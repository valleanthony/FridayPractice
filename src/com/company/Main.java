package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Making shirts
        Shirts dressShirt = new Shirts("White","Small","Button Down");
        Shirts tshirt = new Shirts("Black", "Small","T-Shirt");
        Shirts hawaiianShirt = new Shirts("Blue & Yellow", "Small","Hawaiian");

        //Making Pants
        Pants slacks = new Pants("Black","28","Slacks");
        Pants shorts = new Pants("Navy","29","Shorts");
        Pants trunks = new Pants("orange","28","Swimming Trunks");

        //Making shoes

        Shoes oxfords = new Shoes("Black","9","Oxfords");
        Shoes sandels = new Shoes("Dark Brown","NA","Sandels");
        Shoes sneaker = new Shoes("Black","9","Sneakers");

        //Making hats

        Hat panamaHat = new Hat("Sand shade","NA","Panama Hat");
        Hat snapback = new Hat("Camo","NA","Snap Back");
        Hat fidora = new Hat("Black","NA","Fidora");




        // Creating closets..

        Closets work = new Closets(dressShirt,slacks,oxfords,fidora);
        Closets play = new Closets(tshirt,shorts,sneaker,snapback);
        Closets vacation = new Closets(hawaiianShirt,trunks,sandels,panamaHat);

        // Adding the three different closets to an array list.

        ArrayList<Closets> myMainCloset = new ArrayList<Closets>();

        myMainCloset.add(work);
        myMainCloset.add(play);
        myMainCloset.add(vacation);


        System.out.println("Prints out closet for play:");
        myMainCloset.get(1).whatisinmycloset();


        // This prints everything in all closets.
        /*for (Closets temp: myMainCloset){
            temp.whatisinmycloset();
        }
        */

    }
}
