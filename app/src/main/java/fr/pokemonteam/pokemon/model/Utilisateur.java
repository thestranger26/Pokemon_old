package fr.pokemonteam.pokemon.model;

import java.util.ArrayList;

/**
 * Created by Tristan on 04/01/16.
 */
public class Utilisateur {
    int id;
    String pseudo;
    String nom;
    String prenom;
    ArrayList<Pokemon_reel> equipe = new ArrayList<>();
    ArrayList<Element> sac_a_dos = new ArrayList<>();
    ArrayList<Lieu> lieux_favoris = new ArrayList<>();

    public Utilisateur(int id, String pseudo, String nom, String prenom, ArrayList<Pokemon_reel> equipe, ArrayList<Element> sac_a_dos, ArrayList<Lieu> lieux_favoris) {
        this.id = id;
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.equipe = equipe;
        this.sac_a_dos = sac_a_dos;
        this.lieux_favoris = lieux_favoris;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Pokemon_reel> getEquipe() {
        return equipe;
    }

    public void setEquipe(ArrayList<Pokemon_reel> equipe) {
        this.equipe = equipe;
    }

    public ArrayList<Element> getSac_a_dos() {
        return sac_a_dos;
    }

    public void setSac_a_dos(ArrayList<Element> sac_a_dos) {
        this.sac_a_dos = sac_a_dos;
    }

    public ArrayList<Lieu> getLieux_favoris() {
        return lieux_favoris;
    }

    public void setLieux_favoris(ArrayList<Lieu> lieux_favoris) {
        this.lieux_favoris = lieux_favoris;
    }
}
