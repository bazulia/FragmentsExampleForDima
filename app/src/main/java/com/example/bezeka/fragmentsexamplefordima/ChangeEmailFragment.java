package com.example.bezeka.fragmentsexamplefordima;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangeEmailFragment extends Fragment {

    private Button btnChangeSubmit;
    private EditText etChangeEmail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_change_email,container,false);

        etChangeEmail = (EditText) view.findViewById(R.id.etChangeEmail);

        btnChangeSubmit = (Button) view.findViewById(R.id.btnChangeSubmit);
        btnChangeSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeEmail(etChangeEmail.getText().toString());
            }
        });

        return view;
    }

    private void changeEmail(String newEmail){
        Toast.makeText(getActivity(),"New email is - "+newEmail,Toast.LENGTH_SHORT).show();
        getFragmentManager().popBackStack();//закрываем этот фрагмент
    }

}
