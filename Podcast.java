package com.aluracursos.radioalura.modelos;

public class Podcast extends  Audio{
    private String presentador;
    private String descripcion;
    private int duracionPodcast;

    @Override
    public int getClasifiacion() {
        if (getTotalReproducciones() >=2000){
            return 9;
        }else{
            return 2;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracionPodcast() {
        return duracionPodcast;
    }

    public void setDuracionPodcast(int duracionPodcast) {
        this.duracionPodcast = duracionPodcast;
    }
}
