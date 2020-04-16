package com.odilonsimpore.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientDiagnostic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdiagnostic);

        final CardView cardViewQ1 = findViewById(R.id.Q1);
        Button btnYes = findViewById(R.id.bouttonOui);
        Button btnNo = findViewById(R.id.bouttonNon);

        final CardView cardViewQ2 = findViewById(R.id.Q2);
        Button btnYes2 = findViewById(R.id.boutton_oui);
        Button btnNo2 = findViewById(R.id.boutton_non);

        final CardView cardViewQ3 = findViewById(R.id.Q3);
        Button btnYes3 = findViewById(R.id.bouttonOui1);
        Button btnNo3 = findViewById(R.id.bouttonNon1);

        final CardView cardViewQ4 = findViewById(R.id.Q4);
        Button btnCount = findViewById(R.id.bouttonCont);
        Button btnCount1 = findViewById(R.id.bouttonCont1);

        final CardView cardViewQ5 = findViewById(R.id.Q5);
        Button btnContinuer = findViewById(R.id.bouttonContinuer);

        final CardView cardViewRespondF = findViewById(R.id.RespondFaible);
        Button btnValider = findViewById(R.id.bouttonValider);

//        final CardView cardViewRespondM = findViewById(R.id.RespondModeree);
//        Button btnValid = findViewById(R.id.bouttonValid);
//
//        final CardView cardViewRespondE = findViewById(R.id.RespondElevee);
//        Button btnVal = findViewById(R.id.bouttonVal);

        final CardView cardViewMer = findViewById(R.id.remercier);
        Button btnN = findViewById(R.id.bouttonN);

        final CardView cardViewRespondRem = findViewById(R.id.Assister);
        Button btnAS = findViewById(R.id.bouttonAs);
        Button btnRes = findViewById(R.id.bouttonRes);

        final CardView cardViewRespondMic = findViewById(R.id.merci);
        Button btn1 = findViewById(R.id.btn1);
        Button btnRefus = findViewById(R.id.btnRefu2);

        final CardView cardViewTerminer = findViewById(R.id.terminer);
        Button btn01Ac = findViewById(R.id.btn01Activ);

        final CardView cardViewMicro = findViewById(R.id.micro);
        Button btnMic1 = findViewById(R.id.btnMicro1);



        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ1.setVisibility(View.GONE);
                cardViewQ2.setVisibility(View.VISIBLE);
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ1.setVisibility(View.GONE);
                cardViewQ2.setVisibility(View.VISIBLE);
            }
        });




        btnYes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ2.setVisibility(View.GONE);
                cardViewQ3.setVisibility(View.VISIBLE);
            }
        });

        btnNo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ2.setVisibility(View.GONE);
                cardViewQ3.setVisibility(View.VISIBLE);
            }
        });




        btnYes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ3.setVisibility(View.GONE);
                cardViewQ4.setVisibility(View.VISIBLE);
            }
        });


        btnNo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ3.setVisibility(View.GONE);
                cardViewQ4.setVisibility(View.VISIBLE);
            }
        });




        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ4.setVisibility(View.GONE);
                cardViewQ5.setVisibility(View.VISIBLE);
            }
        });

        btnCount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ4.setVisibility(View.GONE);
                cardViewQ5.setVisibility(View.VISIBLE);
            }
        });




        btnContinuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewQ5.setVisibility(View.GONE);
                cardViewRespondF.setVisibility(View.VISIBLE);
            }
        });




        btnValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewRespondF.setVisibility(View.GONE);
                cardViewMer.setVisibility(View.VISIBLE);
            }
        });




        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewMer.setVisibility(View.GONE);
                cardViewRespondRem.setVisibility(View.VISIBLE);
            }
        });



        btnAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewRespondRem.setVisibility(View.GONE);
                cardViewRespondMic.setVisibility(View.VISIBLE);
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewRespondRem.setVisibility(View.GONE);
                cardViewRespondMic.setVisibility(View.VISIBLE);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewRespondMic.setVisibility(View.GONE);
                cardViewTerminer.setVisibility(View.VISIBLE);
            }
        });

        btnRefus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewRespondMic.setVisibility(View.GONE);
                cardViewTerminer.setVisibility(View.VISIBLE);
            }
        });

        btn01Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewTerminer.setVisibility(View.GONE);
                cardViewMicro.setVisibility(View.VISIBLE);
            }
        });

        btnMic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cardViewMicro.setVisibility(View.GONE);
                cardViewMicro.setVisibility(View.VISIBLE);
            }
        });

    }
}
