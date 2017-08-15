package com.example.alinamurmur.myprojektiswork.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alinamurmur.myprojektiswork.Interfaces.eventListener;
import com.example.alinamurmur.myprojektiswork.R;

/**
 * Created by Admin on 19.07.2017.
 */

public class CalendarFragment extends Fragment implements View.OnClickListener {

    eventListener mCallback;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_calendar, container, false);

        CardView b1 = (CardView) view.findViewById(R.id.cb1);
        CardView b2 = (CardView) view.findViewById(R.id.cb2);
        CardView b3 = (CardView) view.findViewById(R.id.cb3);
        CardView b4 = (CardView) view.findViewById(R.id.cb4);
        CardView b5 = (CardView) view.findViewById(R.id.cb5);
        CardView b6 = (CardView) view.findViewById(R.id.cb6);
        CardView b7 = (CardView) view.findViewById(R.id.cb7);
        CardView b8 = (CardView) view.findViewById(R.id.cb8);
        CardView b9 = (CardView) view.findViewById(R.id.cb9);
        CardView b10 = (CardView) view.findViewById(R.id.cb10);
        CardView b11 = (CardView) view.findViewById(R.id.cb11);
        CardView b12 = (CardView) view.findViewById(R.id.cb12);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        String month ="month";
        switch (view.getId()) {
            case R.id.cb1:
                month = getString(R.string.m1);
                break;
            case R.id.cb2:
                month = getString(R.string.m2);
                break;
            case R.id.cb3:
                month = getString(R.string.m3);
                break;
            case R.id.cb4:
                month = getString(R.string.m4);
                break;
            case R.id.cb5:
                month = getString(R.string.m5);
                break;
            case R.id.cb6:
                month = getString(R.string.m6);
                break;
            case R.id.cb7:
                month = getString(R.string.m7);
                break;
            case R.id.cb8:
                month = getString(R.string.m8);
                break;
            case R.id.cb9:
                month = getString(R.string.m9);
                break;
            case R.id.cb10:
                month = getString(R.string.m10);
                break;
            case R.id.cb11:
                month = getString(R.string.m11);
                break;
            case R.id.cb12:
                month = getString(R.string.m12);
                break;
        }
        mCallback.onMonthSelected(month);
    }

 @Override
     public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
         super.onViewCreated(view, savedInstanceState);
         getActivity().setTitle("Календарь");
     }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mCallback = (eventListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement onSomeEventListener");
        }
    }

}
