package org.example;

public class Main {
     static void main(String[] args) {
        // Desativa o escalonamento automático do Java para lidar com a escala de 125% do Windows
        System.setProperty("sun.java2d.uiScale", "1.0");

        try {
            Sikuli sikuli = new Sikuli();
            sikuli.click();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
