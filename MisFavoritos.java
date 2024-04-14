package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public  void adicionar(Audio audio){
     if (audio.getClasifiacion() >=8){
         System.out.println(audio.getTitulo() + "Es uno de los favoritos del momento");
    }else{
         System.out.println(audio.getTitulo() + "Tambien es uno de los favoritos");
     }

    }
}
