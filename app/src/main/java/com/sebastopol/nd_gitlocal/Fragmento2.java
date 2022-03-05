package com.sebastopol.nd_gitlocal;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragmento2 extends Fragment {

    Button btnSave;
    Button btnJudgment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceStance) {

        View v = inflater.inflate(R.layout.fragmento2, container, false);
        btnSave = v.findViewById(R.id.btnSave);
        btnJudgment = v.findViewById(R.id.btnJudgment);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Haz salvado el planeta", Toast.LENGTH_LONG).show();

            }
        });

        btnJudgment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Haz reemplazado la existencia humana", Toast.LENGTH_SHORT).show();
            }
        });

        return v;

    }


}
