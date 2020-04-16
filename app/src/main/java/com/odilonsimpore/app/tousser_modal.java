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

public class tousser_modal extends AppCompatDialogFragment {

    public tousser_modal() {}

    public static tousser_modal newInstance() {
        return new tousser_modal();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = Objects.requireNonNull(getActivity()).getLayoutInflater();
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.tousser_modal, null);
        Button oui = view.findViewById(R.id.boutton_oui);
        oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                douleurs_modal d_modal = douleurs_modal.newInstance();
                d_modal.show(getActivity().getSupportFragmentManager(), "");
            }
        });
        Button non = view.findViewById(R.id.boutton_non);
        non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                douleurs_modal d_modal = douleurs_modal.newInstance();
                d_modal.show(getActivity().getSupportFragmentManager(), "");
            }
        });

        builder.setView(view);
        return builder.create();
    }
}