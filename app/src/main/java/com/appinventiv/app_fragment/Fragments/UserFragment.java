package com.appinventiv.app_fragment.Fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.appinventiv.app_fragment.R;
import com.appinventiv.app_fragment.ui.main.PageViewModel;
import com.appinventiv.app_fragment.ui.main.PlaceholderFragment;


public class UserFragment extends Fragment {

    EditText et_name;

    EditText et_email;
    RadioButton radioButton_male, radioButton_female;
    RadioGroup radioGroup_user;
    CheckBox checkBox_singing, checkBox_dancing, checkBox_gaming;
    Button btn_send;

    String name, email, gender, hobbies, singing, dancing, gaming;
    boolean check;


    private FragmentSendData dataSendInterface;

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public UserFragment() {
        // Required empty public constructor
    }

    public static UserFragment newInstance(int index) {
        UserFragment userFragment = new UserFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        userFragment.setArguments(bundle);
        return userFragment;
    }

    public interface FragmentSendData{
        void sendDataToInterface(String name, String email, String gender, String hobbies);
    }


    @Override
    public void onAttach(Context context) {

        Log.d("UserFragment","onAttach Called");

        super.onAttach(context);
        if (dataSendInterface == null){
            dataSendInterface = (FragmentSendData) context;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("UserFragment","onCreate Called");

//        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
//        int index = 1;
//        if (getArguments() != null) {
//            index = getArguments().getInt(ARG_SECTION_NUMBER);
//        }
//        pageViewModel.setIndex(index);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("UserFragment","onCreateView Called");
        return inflater.inflate(R.layout.fragment_user,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("UserFragment","onActivityCreated Called");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        et_name = view.findViewById(R.id.edt_fragment_user_name);
        et_email = view.findViewById(R.id.edt_fragment_user_email);
        radioButton_male = view.findViewById(R.id.radio_fragment_user_male);
        radioButton_female = view.findViewById(R.id.radio_fragment_user_female);
        radioGroup_user = view.findViewById(R.id.radioGroup_gender);
        checkBox_singing = view.findViewById(R.id.checkbox_fragment_user_singing);
        checkBox_dancing = view.findViewById(R.id.checkbox_fragment_user_dancing);
        checkBox_gaming = view.findViewById(R.id.checkbox_fragment_user_gaming);
        btn_send = view.findViewById(R.id.btn_click);

        Log.d("UserFragment","onViewCreated Called");


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("UserFragment","onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d("UserFragment","onResume Called");

        btn_send.setEnabled(false);

        radioGroup_user.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i){
                    case R.id.radio_fragment_user_female :
                        gender = "FEMALE";
                        name = et_name.getText().toString();
                        email = et_email.getText().toString();
                        if (name.equals("")){
                            et_name.setError("Please Enter your Name");
                        }
                        if (email.equals("")){
                            et_email.setError("Please Enter Your Email");
                        }
                        check = true;
                        break;

                    case R.id.radio_fragment_user_male :
                        gender = "Male";
                        name = et_name.getText().toString();
                        email = et_email.getText().toString();
                        if (name.equals("")){
                            et_name.setError("Please Enter your Name");
                        }
                        if (email.equals("")){
                            et_email.setError("Please Enter Your Email");
                        }
                        check = true;
                        break;
                }

            }
        });


        btn_send.setEnabled(true);
        name = et_name.getText().toString();
        email = et_email.getText().toString();

        hobbies = "Singing" + " " + "Dancing" + " "+ "Gaming";

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("onClick","Button clicked "+name+" : "+hobbies);
                dataSendInterface.sendDataToInterface(name, email, gender, hobbies);
            }
        });

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("UserFragment","onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("UserFragment","onStop Called");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("UserFragment","onDestroyView Called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("UserFragment","onDestroy Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("UserFragment","onDetach Called");
    }
}
