package com.appinventiv.app_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.appinventiv.app_fragment.Fragments.DetailFragment;
import com.appinventiv.app_fragment.Fragments.UserFragment;

public class MainActivity extends AppCompatActivity implements UserFragment.FragmentSendData
{

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity Launching","OnCreate for MainActivity");


        simpleFragmentImplementation();

    }

    private void simpleFragmentImplementation() {

        fragment = new Fragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.addToBackStack("TAG");
        transaction.add(R.id.fragment_user, fragment);
        transaction.commit();
    }

    @Override
    public void sendDataToInterface(String name, String email, String gender, String hobbies) {
        Log.d("sendDataToInterface",name+" : "+hobbies);
        DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_details);
        detailFragment.displayRecieveData(name, email, gender, hobbies);
    }
}
