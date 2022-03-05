package com.sebastopol.nd_gitlocal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Fragmento2 extends Fragment {

    Button btnSave;

   @Override
    public View onCreateView(LayoutInflater, ViewGroup container,
                             Bundle saveInstanceStance){

       View v = inflater.inflate(R.id.btnSave,container, false);

       btnSave = v.findViewById(R.id.btnSave);

       btnSave.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(),"Salvaste al planeta Tierra", Toast.LENGTH_LONG).show();
           }
       });

       return v;



    }

}
