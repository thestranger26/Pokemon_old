package fr.pokemonteam.pokemon.model;

/**
 * Created by Tristan on 04/01/16.
 */
public class Pokemon {
    int id;
    String nom;
    String description;
    String lien_image;
    Boolean vue;
    Boolean capture;

    public Pokemon(int id, String nom, String description, String lien_image, Boolean vue, Boolean capture) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.lien_image = lien_image;
        this.vue = vue;
        this.capture = capture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLien_image() {
        return lien_image;
    }

    public void setLien_image(String lien_image) {
        this.lien_image = lien_image;
    }

    public Boolean getVue() {
        return vue;
    }

    public void setVue(Boolean vue) {
        this.vue = vue;
    }

    public Boolean getCapture() {
        return capture;
    }

    public void setCapture(Boolean capture) {
        this.capture = capture;
    }
}
