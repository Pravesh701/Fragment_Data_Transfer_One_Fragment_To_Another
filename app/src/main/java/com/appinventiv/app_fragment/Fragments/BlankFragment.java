package com.appinventiv.app_fragment.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appinventiv.app_fragment.R;
import com.appinventiv.app_fragment.ViewPagerActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d("BlankFragment","onAttach Called");
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BlankFragment","onCreate Called");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("BlankFragment","onCreateView Called");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BlankFragment","onActivityCreated Called");
    }

    // Not Part Of Activity Life Cycle

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("BlankFragment","onViewCreated Called");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BlankFragment","onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BlankFragment","onResume Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("BlankFragment","onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("BlankFragment","onStop Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BlankFragment","onDestroyView Called");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BlankFragment","onDestroy Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BlankFragment","onDetach Called");
    }

}
