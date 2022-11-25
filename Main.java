package com.Principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Persona Estudiante = new Persona();
       String Nombre,Apellidos, ID, Correo_Electronico,Pais;
       int Edad;
       Scanner est = new Scanner(System.in);
       System.out.println("Ingrese su nombre");
       Nombre = est.next();
       Estudiante.setNombre(Nombre);
       System.out.print("Ingrese su apellido");
       Apellidos = est.next();
       Estudiante.setApellidos(Apellidos);
       System.out.println("Ingrese su ID");
       ID = est.next();
       Estudiante.setID(ID);
       System.out.println("Ingrese su Email");
       Correo_Electronico = est.next();
       Estudiante.setCorreo_Electronico(Correo_Electronico);
        System.out.println("ingrese su Pais");
        Pais = est.next();
        Estudiante.setPais(Pais);
        System.out.println("Ingrese su edad");
        Edad = est.nextInt();
        Estudiante.setEdad(Edad);
        System.out.println("\n************* Datos *************");
        System.out.println("\n Nombre : "+ Estudiante.getNombre());
        System.out.println("\n Apellidos : "+Estudiante.getApellidos());
    }
}