package com.example.onlinelearning.pojo;

public class ModelSort implements java.util.Comparator<Model>{
    @Override
    public int compare(Model o1, Model o2) {
        return (o1.getModid()-o2.getModid());
    }
}
