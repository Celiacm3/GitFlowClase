package com.ufv.ejemploGitFlow;

public class Persona {
    private String nombre;

    private String apellidos;
    private int dniSinLetra;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDniSinLetra() {
        return dniSinLetra;
    }

    public void setDniSinLetra(int dniSinLetra) {
        this.dniSinLetra = dniSinLetra;
    }




    public void setEdad(int _edad){
        if(_edad <= 18){
            System.out.println("Estás hecho un chaval");
        }else{
            System.out.println("no ");
        }
        this.edad= _edad;
    }
    public int getEdad() {
        return this.edad;
    }

}
