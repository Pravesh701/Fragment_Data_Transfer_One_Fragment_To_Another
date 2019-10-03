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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.appinventiv.app_fragment.MainActivity;
import com.appinventiv.app_fragment.R;
import com.appinventiv.app_fragment.TabLayoutActivity;
import com.appinventiv.app_fragment.ViewPagerActivity;


public class DetailFragment extends Fragment {

    TextView tv_Details;
    Button btnGoForViewPager;
    Button btnTabLayout;

    public DetailFragment() {
        // Required empty public constructor
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Log.d("DetailsFragment","onAttach Called");
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("DetailsFragment","onCreate Called");

    }

    public void displayRecieveData(String name, String email, String gender, String hobbies){
        tv_Details.setText("Name :-  "+ name+ "\n"+
                "Email :-  " +email+ "\n"+
                "Gender :-  " +gender+ "\n"+
                "Hobbies :-  " +hobbies+ "\n"
        );

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        Log.d("DetailsFragment","onCreateView Called");

        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("DetailsFragment","onActivityCreated Called");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("DetailsFragment","onViewCreated Called");

        btnGoForViewPager = view.findViewById(R.id.btn_fragment_detail_submit);
        btnTabLayout = view.findViewById(R.id.btn_fragment_detail_tab);
        tv_Details = view.findViewById(R.id.tv_fragment_details);

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("DetailsFragment","onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("DetailsFragment","onResume Called");

        btnGoForViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                startActivity(intent);
            }
        });

        btnTabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TabLayoutActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("DetailsFragment","onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("DetailsFragment","onStop Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("DetailsFragment","onDestroyView Called");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("DetailsFragment","onDestroy Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("DetailsFragment","onDetach Called");
    }
}
