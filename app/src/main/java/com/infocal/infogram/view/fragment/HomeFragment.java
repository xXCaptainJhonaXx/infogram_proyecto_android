package com.infocal.infogram.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.infocal.infogram.R;
import com.infocal.infogram.adapter.CardViewAdapter;
import com.infocal.infogram.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //toolbar
        showToolbar(getString(R.string.title_home_fragment), false, view);

        //recyclerview
        RecyclerView recyclerView = view.findViewById(R.id.recycle_view);

        //Layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adapter

        CardViewAdapter cardViewAdapter= new CardViewAdapter(buidImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);

        return view;
    }

    public void showToolbar(String titulo, boolean botonSubir, View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);


    }
    //crear lista de imagenes

    public ArrayList<Image> buidImages() {
        ArrayList<Image> images =new ArrayList<>();
        images.add(new Image("https://articles-img.sftcdn.net/t_article_cover_xl/auto-mapping-folder/sites/2/2015/04/GTAV-Review.jpg", "Carlos Valdivia", " 2 dias", " 1 me gusta"));
        images.add(new Image("https://forum-en-cdn.warthunder.com/original/3X/7/a/7a58fcdf6004e4143d53d218ff961c87679b5cad.jpeg", "Luis Rojas", " 7 dias", " 6 me gusta"));
        images.add(new Image("https://media-cdn.tripadvisor.com/media/attractions-splice-spp-720x480/0a/ae/19/87.jpg", "Johnny Mamani", " 10 dias", " 2 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/3/30/Shot_Kal-.jpg", "Jose Herrera", " 4 dias", " 9 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/F-104_right_side_view.jpg/1024px-F-104_right_side_view.jpg", "Carlos Moscado", " 3 dias", " 19 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/ERC-90_Sagaie_008_FR.JPG/1280px-ERC-90_Sagaie_008_FR.JPG", "Maria Flores", " 8 dias", " 8 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Intel_Headquarters_in_2023.jpg/1280px-Intel_Headquarters_in_2023.jpg", "Juan Balderrama", " 7 dias", " 3 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/MiG-21_LanceR_taking_off_Romania_Oct_2009.jpg/1280px-MiG-21_LanceR_taking_off_Romania_Oct_2009.jpg", "Lorena Patzi", " 5 dias", " 4 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/d/d7/T-55_skos_RB.jpg", "Pedro Valdivia", " 6 dias", " 2 me gusta"));
        images.add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Goyas_2025_-_Antonio_Banderas_%28cropped%29.jpg/800px-Goyas_2025_-_Antonio_Banderas_%28cropped%29.jpg", "Antonio Banderas", " 1 dias", " 3 me gusta"));

        return images;

    }

}