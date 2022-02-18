package com.company.factory;

import java.util.Arrays;
import java.util.Objects;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public void replaceIngredient(int index, String ingredient) {
        ingredients[index] = ingredient;
    }

    public void addNewIngredient(String ingredient) {
        String[] temp = new String[ingredients.length + 1];
        System.arraycopy(ingredients, 0, temp, 0, ingredients.length);
        temp[ingredients.length] = ingredient;
        this.ingredients = temp;
    }

    public void orderFlavor(int quantity) {
        System.out.format("Your order of %d gallons of %s ice cream will take %d hours to produce%n", quantity, flavor, productionTime * quantity);
        System.out.format("It will cost %.2f to produce and should be sold at %.2f %n", productionCost * quantity, salePrice * quantity);
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

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.getSalePrice(), getSalePrice()) == 0 && Double.compare(iceCream.getProductionCost(), getProductionCost()) == 0 && getProductionTime() == iceCream.getProductionTime() && Objects.equals(getFlavor(), iceCream.getFlavor()) && Arrays.equals(getIngredients(), iceCream.getIngredients());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFlavor(), getSalePrice(), getProductionCost(), getProductionTime());
        result = 31 * result + Arrays.hashCode(getIngredients());
        return result;
    }
}
