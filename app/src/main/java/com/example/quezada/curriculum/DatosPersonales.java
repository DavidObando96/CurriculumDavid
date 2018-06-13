package com.example.quezada.curriculum;

import android.content.Context;
import android.content.Intent;
import android.icu.text.IDNA;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DatosPersonales extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_datos_personales, container, false);
    }

    //test

    public void irAInformacionExtra(View view){
        Intent intent = new Intent(getActivity(), InformacionExtra.class);
        getActivity().startActivity(intent);
        System.out.println();
    }




}


