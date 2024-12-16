package org.sid.control.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


public class ComputerDTO {
    private String proce;
    private int ram;
    private int hardDrive;
    private double price;

    public String getProce() { return proce; }
    public void setProce(String proce) { this.proce = proce; }

    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }

    public int getHardDrive() { return hardDrive; }
    public void setHardDrive(int hardDrive) { this.hardDrive = hardDrive; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
