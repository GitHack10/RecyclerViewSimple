package com.example.administrator.recyclerviewsimpe;

import java.util.ArrayList;
import java.util.List;

public class Car {

    public static List<Car> cars = new ArrayList<>();

    public static String[] carModel = {"Mercedes-Benz", "BMW", "Volkswagen", "Opel", "Ford",
            "Lada", "Chevrolet", "Audi", "Ferrari"};

    public static String[] carECapacity = {"6.3", "5.0", "3.5", "2.4", "4.5",
            "1.8", "2.2", "6.5", "7.0"};

    public static String[] carTransmission = {"4WD", "4WD", "FWD", "RWD", "FWD",
            "FWD", "RWD", "4WD", "FWD"};

    public static String[] carClass = {"E", "5", "C", "D", "A", "F", "B", "A", "A"};

    public static String[] carColor = {"Black", "White", "Gray", "Orange", "Blue",
            "Silver", "Yellow", "Brown", "Red"};

    public static int[] carImg = {R.drawable.img_mb, R.drawable.img_bmw, R.drawable.img_volkswagen,
            R.drawable.img_opel, R.drawable.img_ford, R.drawable.img_lada, R.drawable.img_chevrolet,
            R.drawable.img_audi, R.drawable.img_ferrari};

    private int img;
    private String model;
    private String eCapacity;
    private String transmission;
    private String classs;
    private String color;

    public Car(int img, String model, String eCapacity, String transmission,
               String classs, String color) {
        this.img = img;
        this.model = model;
        this.eCapacity = eCapacity;
        this.transmission = transmission;
        this.classs = classs;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String geteCapacity() {
        return eCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getClasss() {
        return classs;
    }

    public String getColor() {
        return color;
    }

    public int getImg() {
        return img;
    }
}