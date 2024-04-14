package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int totalReproducciones;
    private int totalMegusta;
    private int clasifiacion;


    public void meGusta() {
        this.totalMegusta++;
    }

    public void  reProducen (){
        this.totalReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public int getTotalMegusta() {
        return totalMegusta;
    }

    public void setTotalMegusta(int totalMegusta) {
        this.totalMegusta = totalMegusta;
    }

    public int getClasifiacion() {
        return clasifiacion;
    }

    public void setClasifiacion(int clasifiacion) {
        this.clasifiacion = clasifiacion;
    }
}
