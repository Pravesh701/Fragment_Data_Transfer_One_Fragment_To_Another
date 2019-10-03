package com.appinventiv.app_fragment.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appinventiv.app_fragment.R;


public class BlankFragment3 extends Fragment {


    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d("BlankFragment '3' ","onAttach Called");
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BlankFragment '3' ","onCreate Called");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("BlankFragment '3' ","onCreateView Called");

        return inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BlankFragment '3' ","onActivityCreated Called");
    }

    // Not Part Of Activity Life Cycle

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("BlankFragment '3' ","onViewCreated Called");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BlankFragment '3' ","onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BlankFragment '3' ","onResume Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BlankFragment '3' ","onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("BlankFragment '3' ","onStop Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BlankFragment '3' ","onDestroyView Called");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BlankFragment '3' ","onDestroy Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BlankFragment '3' ","onDetach Called");
    }

}
