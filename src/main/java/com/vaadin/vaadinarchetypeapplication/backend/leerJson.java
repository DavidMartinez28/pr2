package com.vaadin.vaadinarchetypeapplication.backend;
import com.google.gson.*;
import com.vaadin.vaadinarchetypeapplication.backend.clases.Inventario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class leerJson {

    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader("output.json"));
            Inventario inventario = gson.fromJson(br, Inventario.class);
            System.out.println(inventario.getEquipos().getHardware().getDiscoDuro().getCapDd()); 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }       
    }
}
