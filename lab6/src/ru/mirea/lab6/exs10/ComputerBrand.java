package ru.mirea.lab6.exs10;

import java.util.ArrayList;

import java.util.ArrayList;

enum ComputerBrand {
    HP, DELL, ASUS, ACER
}

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Memory {
    private int sizeGB;

    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public int getSizeGB() {
        return sizeGB;
    }
}

class Monitor {
    private String type;

    public Monitor(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}