package com.franceskoly.menuprincipalconfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import com.franceskoly.menuprincipalconfragment.adapters.PostreAdapter;
import com.franceskoly.menuprincipalconfragment.fragments.InicioFragment;
import com.franceskoly.menuprincipalconfragment.modelos.Postre;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements InicioFragment.OnFragmentInteractionListener {

    InicioFragment fragmentInicio;

    ArrayList<Postre> postres;
    private RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = (RecyclerView) findViewById(R.id.recycler_contenedor);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getParent(), LinearLayoutManager.VERTICAL,false);
        myRecyclerView.setLayoutManager(layoutManager);
        //GridLayoutManager myGridLayoutManager = new GridLayoutManager(this, 2);
        //myRecyclerView.setLayoutManager(myGridLayoutManager);



        creaPostres();
        PostreAdapter myPostreAdapter = new PostreAdapter(postres,this);
        myRecyclerView.setAdapter(myPostreAdapter);


        fragmentInicio = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments, fragmentInicio).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void creaPostres(){
        postres = new ArrayList<>();
        postres.add(new Postre("","Pudin de Chocolate"));
        postres.add(new Postre("","Carlota"));
        postres.add(new Postre("","Gelatina"));
        postres.add(new Postre("","Name Postre 1"));
        postres.add(new Postre("","Name Postre 2"));


    }
}
