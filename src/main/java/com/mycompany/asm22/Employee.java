/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asm22;

import java.io.Serializable;

/**
 *
 * @author giau7
 */
public class Employee implements Serializable{
    private String ma;
    private String ten;
    private int tuoi;
    private String email;
    private double luong;

    public Employee(String ma, String ten, int tuoi, String email, double luong) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public Employee() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
}
