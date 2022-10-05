package com.ufv.ejemploGitFlow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tus apellidos: ");
        p.setApellidos(sc.nextLine());
        System.out.println("Escribe tu dni sin letra: ");
        p.setDniSinLetra(sc.nextInt());
        System.out.println("Escribe tu edad: ");
        p.setEdad(sc.nextInt());


        System.out.println("Buenos días: " + p.getNombre() + " - " + p.getApellidos() + " - " + p.getDniSinLetra() + " - " + p.getEdad());
    }
}
