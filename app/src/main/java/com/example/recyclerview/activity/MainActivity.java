package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        //Listagem de filmes
        this.criarFilmes();


        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Coonfigurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplication());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha- De volta ao lar","Aventura","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha","Fantasia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Liga da Justiça","Ficção","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Capitão América","Aventura/Ficção","2016");
        this.listaFilmes.add(filme);

        filme = new Filme("It:A coisa","Drama/Terror","2018");
        this.listaFilmes.add(filme);

        filme = new Filme("It:A coisa","Drama/Terror","2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Pica-Pau :O Filme","Comédia/Animação","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("A Múmia","Terror","2018");
        this.listaFilmes.add(filme);

        filme = new Filme("A Bela e a Fera","Romance","2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Meu malvado favorito 3","Comédia","2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Carros 3","Comédia","2018");
        this.listaFilmes.add(filme);

    }
}