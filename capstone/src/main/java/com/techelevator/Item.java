package com.techelevator;

import java.math.BigDecimal;

public class Item {
    //attributes of item
    private String name;
    private BigDecimal price;
    private String slotLocation;
    private String type;


    //getters
    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSlotLocation() {
        return slotLocation;
    }

    public String getType() {
        return type;
    }

    public int getInventory() {
        //we might need to change this and is a derived value
        return 5;
    }

    //setters
    //these may be removed later
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setSlotLocation(String slotLocation) {
        this.slotLocation = slotLocation;
    }

    //constructor
    public Item(String name, BigDecimal cost, String slotLocation, String type){
        this.name=name;
        this.price =cost;
        this.slotLocation=slotLocation;
        this.type = type;
    }




}
