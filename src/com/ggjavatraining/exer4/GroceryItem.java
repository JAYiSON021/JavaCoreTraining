package com.ggjavatraining.exer4;

/**
 * Created by Jayson San Agustin on 24/05/2017.
 */
public class GroceryItem {
    private String itemName;
    private Double itemCost;
    private Integer itemQuantity;

    GroceryItem(String name, Double cost, Integer quantity ) {
        itemName = name;
        itemCost = cost;
        itemQuantity = quantity;
    }

    public Double getTotal(){
        return itemCost * itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemCost() {
        return itemCost;
    }

    public void setItemCost(Double itemCost) {
        this.itemCost = itemCost;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
