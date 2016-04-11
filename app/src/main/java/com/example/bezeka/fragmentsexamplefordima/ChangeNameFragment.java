package com.example.bezeka.fragmentsexamplefordima;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChangeNameFragment extends Fragment {

    private Button btnChangeSubmit;
    private EditText etChangeName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_change_name,container,false);

        btnChangeSubmit = (Button) view.findViewById(R.id.btnChangeSubmit);
        btnChangeSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeName(etChangeName.getText().toString());
            }
        });

        etChangeName = (EditText) view.findViewById(R.id.etChangeName);

        return view;
    }
    private void changeName(String newEmail){
        Toast.makeText(getActivity(), "New name is - " + newEmail, Toast.LENGTH_SHORT).show();
        getFragmentManager().popBackStack();//закрываем этот фрагмент
    }


}
