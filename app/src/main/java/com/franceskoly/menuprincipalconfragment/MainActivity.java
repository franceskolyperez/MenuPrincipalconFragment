package com.franceskoly.menuprincipalconfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.franceskoly.menuprincipalconfragment.fragments.InicioFragment;

public class MainActivity extends AppCompatActivity implements InicioFragment.OnFragmentInteractionListener {

    InicioFragment fragmentInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments, fragmentInicio).commit();


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
