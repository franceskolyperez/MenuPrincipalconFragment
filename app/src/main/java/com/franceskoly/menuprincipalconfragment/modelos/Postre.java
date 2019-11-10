package com.franceskoly.menuprincipalconfragment.modelos;

public class Postre {

    private String imagen;
    private String food_name;

    public Postre(String imagen, String food_name) {
        this.imagen = imagen;
        this.food_name = food_name;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }
}
