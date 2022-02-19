package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private double salePrice;
    // Quantity in ounces
    private int quantity;

    public IceCream(String flavor, double salePrice) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.quantity = 384;
    }

    public void restock(int amount) {
        this.quantity += amount;
    }

    public void makeSale(int scoops) {
        // decrement the stock of this flavor, assuming a 4 ounce scoop
        this.quantity -= scoops * 4;
        System.out.format("The sale price is $%.2f%n", scoops * salePrice);
    }

    public void voidSale(int scoops){
        this.quantity += scoops * 4;
        System.out.format("Your refund is $%.2f%n", scoops * salePrice);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.getSalePrice(), getSalePrice()) == 0 && getQuantity() == iceCream.getQuantity() && Objects.equals(getFlavor(), iceCream.getFlavor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlavor(), getSalePrice(), getQuantity());
    }
}
