package com.kickstart.configuration;
import org.springframework.boot.context.properties.Configurationproperties;
@Configurationproperties
@ConfigurationProperties(prefix = "harddisk.config")
public class HarddiskConfig {
    private String size;
    private String brand;
    private double price;

    public String getSize() {
        return size;
    } 

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price; 
    }
}

/*
Fro @configurationProperties to work for the attributes, it is necessary to have getters and setters for the attributes or else you will face a compilation error asking for methods
*/