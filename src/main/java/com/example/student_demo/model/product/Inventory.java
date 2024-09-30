package com.example.student_demo.model.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private String id;
    private List<Product> products ;
   
    private LocalDate	restockDate;
    public Inventory() {
        this.products=new ArrayList<>();
    }
    public Inventory(String id,  LocalDate restockDate) {
        this.products=new ArrayList<>();
        this.id = id;
        
        this.restockDate = restockDate;
    }
    public Inventory( LocalDate restockDate) {
        this.products=new ArrayList<>();
        
        this.restockDate = restockDate;
    }
    public String getId() {
        return id;
    }
    public List<Product> getProducts() {
        return products;
    }
 
    public LocalDate getRestockDate() {
        return restockDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    

    public void setRestockDate(LocalDate restockDate) {
        this.restockDate = restockDate;
    }
    
    
    
}
