package com.example.bezeka.fragmentsexamplefordima;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainSettingsFragment extends Fragment implements View.OnClickListener {

    private Button btnChangeEmail;
    private Button btnChangeName;
    FragmentManager fm;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_settings,container,false);

        fm = getActivity().getSupportFragmentManager();

        btnChangeEmail = (Button) view.findViewById(R.id.btnGoChangeEmail);
        btnChangeName = (Button) view.findViewById(R.id.btnGoChangeName);

        btnChangeEmail.setOnClickListener(this);
        btnChangeName.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGoChangeEmail:
                fm.beginTransaction()
                        .replace(R.id.container,new ChangeEmailFragment())
                        .addToBackStack("ChangeEmailFragment")
                        .commit();
                break;
            case R.id.btnGoChangeName:
                fm.beginTransaction()
                        .replace(R.id.container,new ChangeNameFragment())
                        .addToBackStack("ChangeNameFragment")
                        .commit();
                break;
        }
    }
}
