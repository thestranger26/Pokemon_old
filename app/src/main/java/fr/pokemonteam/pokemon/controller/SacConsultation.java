package fr.pokemonteam.pokemon.controller;

/**
 * Created by melvin on 1/4/16.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import fr.pokemonteam.pokemon.Adapter.AdapterSac;
import fr.pokemonteam.pokemon.R;
import fr.pokemonteam.pokemon.model.Utilisateur;

public class SacConsultation extends AppCompatActivity {

    Utilisateur utilisateur = new Utilisateur(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultation_sac);
        remplirList();
    }

    private void remplirList() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AdapterSac adapter = new AdapterSac(SacConsultation.this, R.layout.element_sac, utilisateur.getSacADos());
                ListView listView = (ListView) findViewById(R.id.list_sac);
                listView.setAdapter(adapter);

            }
        });


    }

}
