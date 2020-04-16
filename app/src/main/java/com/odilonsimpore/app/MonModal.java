package com.odilonsimpore.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MonModal extends AppCompatDialogFragment {

    public MonModal() {}

    public static MonModal newInstance() {
        return new MonModal();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = Objects.requireNonNull(getActivity()).getLayoutInflater();
        @SuppressLint("InflateParams") View view = inflater.inflate(R.layout.mon_modal_xml, null);
        Button oui = view.findViewById(R.id.boutton_oui);
        oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tousser_modal t_modal = tousser_modal.newInstance();
                t_modal.show(getActivity().getSupportFragmentManager(), "");
            }
        });
        Button non = view.findViewById(R.id.boutton_non);
        non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tousser_modal t_modal = tousser_modal.newInstance();
                t_modal.show(getActivity().getSupportFragmentManager(), "");
            }
        });

        builder.setView(view);
        return builder.create();
    }
}