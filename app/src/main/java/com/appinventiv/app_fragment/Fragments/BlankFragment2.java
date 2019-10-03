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

public class BlankFragment2 extends Fragment {


    public BlankFragment2() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d("BlankFragment '2' ","onAttach Called");
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BlankFragment '2' ","onCreate Called");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("BlankFragment '2' ","onCreateView Called");

        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BlankFragment '2' ","onActivityCreated Called");
    }

    // Not Part Of Activity Life Cycle

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("BlankFragment '2' ","onViewCreated Called");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BlankFragment '2' ","onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BlankFragment '2' ","onResume Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BlankFragment '2' ","onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("BlankFragment '2' ","onStop Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BlankFragment '2' ","onDestroyView Called");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BlankFragment '2' ","onDestroy Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BlankFragment '2' ","onDetach Called");
    }

}
