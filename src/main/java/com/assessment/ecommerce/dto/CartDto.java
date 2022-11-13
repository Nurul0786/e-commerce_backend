package com.assessment.ecommerce.dto;

import java.util.List;

public class CartDto {
    private List<CartItemDto> cartItemDtos;
    private double totalCost;
    private double totalWeight;
    private int totalShippingCharge;
    public CartDto(List<CartItemDto> cartItemDtos, double totalCost,double totalWeight,int totalShippingCharge) {
        this.cartItemDtos = cartItemDtos;
        this.totalCost = totalCost;
        this.totalWeight = totalWeight;
        this.totalShippingCharge=totalShippingCharge;

    }

    public int getTotalShippingCharge() {
        return totalShippingCharge;
    }

    public void setTotalShippingCharge(int totalShippingCharge) {
        this.totalShippingCharge = totalShippingCharge;
    }

    public List<CartItemDto> getCartItemDtos() {
        return cartItemDtos;
    }

    public void setCartItemDtos(List<CartItemDto> cartItemDtos) {
        this.cartItemDtos = cartItemDtos;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
}
