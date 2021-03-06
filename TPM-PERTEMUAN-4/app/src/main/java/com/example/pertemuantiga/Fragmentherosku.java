package com.example.pertemuantiga;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentherosku extends Fragment {

    private RecyclerView rvHero;

    public Fragmentherosku() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmentherosku, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvHero = view.findViewById(R.id.activitymain_rv_hero);
        rvHero.setHasFixedSize(true);

        showRecyclerList();

    }
    private void showRecyclerList() {
        rvHero.setLayoutManager(new LinearLayoutManager(getContext()));

        HeroesAdapter heroesAdapter = new HeroesAdapter(getContext());
        heroesAdapter.setHeroes(HeroesData.getHeroesList());

        rvHero.setAdapter(heroesAdapter);
    }

}
