package com.OrderNotifierSystem.OrderNotifierModule.orders.model;
import java.util.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    private static final ArrayList<Order> orders = new ArrayList<>();
    private ShoppingCart shoppingCart = new ShoppingCart();

    private String username;
    private String email;
    private String password;
    private String address;
    private float balance;
    private String phone;


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }


}
