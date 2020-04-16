package com.odilonsimpore.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home,container,false);

        Button dianosticPart = view.findViewById(R.id.dianostic);
        dianosticPart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                MonModal monModal = MonModal.newInstance();
//                monModal.show(getActivity().getSupportFragmentManager(), "");
                startActivity(new Intent(getContext(), PatientDiagnostic.class));
            }
        });

        return view;
    }
}
