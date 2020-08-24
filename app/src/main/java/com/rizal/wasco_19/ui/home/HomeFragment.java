package com.rizal.wasco_19.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.rizal.wasco_19.MencegahActivity;
import com.rizal.wasco_19.MengantisipasiActivity;
import com.rizal.wasco_19.MengenalActivity;
import com.rizal.wasco_19.MengobatiActivity;
import com.rizal.wasco_19.R;
import com.rizal.wasco_19.SelfCheckActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class HomeFragment extends Fragment {
    private LinearLayout lnMengenal, lnMencegah, lnMengobati, lnMengantisipasi;
    private CardView viewCovid;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lnMengenal = view.findViewById(R.id.mengenal);
        lnMencegah = view.findViewById(R.id.mencegah);
        lnMengantisipasi = view.findViewById(R.id.mengantisipasi);
        lnMengobati = view.findViewById(R.id.mengobati);
        viewCovid = view.findViewById(R.id.cvViewVirus);

        lnMengobati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MengobatiActivity.class));
            }
        });

        lnMengantisipasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MengantisipasiActivity.class));
            }
        });

        lnMencegah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MencegahActivity.class));
            }
        });

        lnMengenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MengenalActivity.class));
            }
        });

        viewCovid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SelfCheckActivity.class));
            }
        });
    }
}
