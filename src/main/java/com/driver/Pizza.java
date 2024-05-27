package com.driver;

public class Pizza {

    private int price;
    private int cheese;
    private int toppings;
    private int takeAwayPrice;
    private int totalPrice;

    private boolean isVeg;
    private boolean hasExtraCheese;
    private boolean hasExtraToppings;
    private boolean hasTakeAway;
    private boolean isBillFinalised;
    private StringBuilder bill;

    //constructor
    public Pizza (boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        this.cheese = 80;
        this.takeAwayPrice = 20;
        //if veg or not
        if (isVeg) {
            this.price = 300;
            this.toppings = 70;
        } else {
            this.price = 400;
            this.toppings = 120;
        }
        //intialize total price with base price
        this.totalPrice = this.price;

        //initialize flags for added items
        this.hasExtraCheese = false;
        this.hasExtraToppings = false;
        this.hasTakeAway = false;
        this.isBillFinalised = false;

        //added to string builder
        this.bill = new StringBuilder();
        this.bill.append("Base Price Of The Pizza: ").append(this.price).append("\n");
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.hasExtraCheese){
            this.totalPrice += this.cheese;
            hasExtraCheese = true;
            this.bill.append("Extra Cheese Added: ").append(this.cheese).append("\n");
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.hasExtraToppings){
            this.totalPrice += this.toppings;
            this.hasExtraToppings = true;
            this.bill.append("Extra Toppings Added: ").append(this.toppings).append("\n");
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!hasTakeAway){
            this.totalPrice += this.takeAwayPrice;
            this.hasTakeAway = true;
            this.bill.append("Paperbag Added: ").append(this.takeAwayPrice).append("\n");

        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillFinalised) {
            this.bill.append("Total Price: ").append(this.totalPrice).append("\n");
            this.isBillFinalised = true;

        }
        return this.bill.toString();
    }
}
