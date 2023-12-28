package com.OrderNotifierSystem.OrderNotifierModule.orders.model;

import org.springframework.stereotype.Component;
import com.OrderNotifierSystem.OrderNotifierModule.orders.service.ShoppingCartBSL;

import java.time.LocalDateTime;

@Component
public class Order {
    private LocalDateTime placementTime;

    // Constructor and other methods

    private boolean isPlaced = false;

    private boolean isShipped = false;
    private int orderId = 0;
    Boolean orderStatus = false;

    private final static User user = new User();

    private final static ShoppingCartBSL shoppingCartBSL = new ShoppingCartBSL();
    public Order() {
    }
    public boolean getShipped() {
        return isShipped;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }
    public boolean getPlaced() {
        return isPlaced;
    }
    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }


    public ShoppingCartBSL getShoppingCartBSL() {
        return shoppingCartBSL;
    }
    public User getUser() {
        return user;
    }



    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public boolean getStatus() {
        return orderStatus;
    }

    public void setStatus(boolean status) {
        this.orderStatus = status;
    }

    public LocalDateTime getPlacementTime() {return placementTime;}

    public void setPlacementTime(LocalDateTime placementTime) {this.placementTime = placementTime;}

}






