package com.odilonsimpore.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.Objects;

public class douleurs_modal extends AppCompatDialogFragment {

    public douleurs_modal() {}

    public static douleurs_modal newInstance() {
        return new douleurs_modal();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = Objects.requireNonNull(getActivity()).getLayoutInflater();
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.douleurs_modal, null);
        Button oui = view.findViewById(R.id.boutton_oui);
        oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                douleurs_modal d_modal = douleurs_modal.newInstance();
                d_modal.show(getActivity().getSupportFragmentManager(), "");
            }
        });
        Button non = view.findViewById(R.id.boutton_non);

        builder.setView(view);
        return builder.create();
    }
}