package com.klef.jfsd.exam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String type;
    private int maxSpeed;
    private String color;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
