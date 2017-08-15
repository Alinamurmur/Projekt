package com.example.alinamurmur.myprojektiswork.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alinamurmur.myprojektiswork.DataForDelete.NewsData;
import com.example.alinamurmur.myprojektiswork.Interfaces.eventListener;
import com.example.alinamurmur.myprojektiswork.R;
import com.example.alinamurmur.myprojektiswork.RecyclerItemClickListener;
import com.example.alinamurmur.myprojektiswork.other.AdapterDelMain;

import java.util.ArrayList;

import static android.R.attr.data;

public class MainFragment extends Fragment implements View.OnClickListener {

    eventListener someEventListener;
    AdapterDelMain adapterDel;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.glavni, container, false);
        RecyclerView mRecyclerView = (RecyclerView)view.findViewById(R.id.recyclerMain);
        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setHasFixedSize(true);
        adapterDel = new AdapterDelMain(getData());
        mRecyclerView.setAdapter(adapterDel);

        CardView c1 = (CardView)view.findViewById(R.id.but1);
        c1.setOnClickListener(this);
        CardView c2 = (CardView)view.findViewById(R.id.but2);
        c2.setOnClickListener(this);
        CardView c3 = (CardView)view.findViewById(R.id.but3);
        c3.setOnClickListener(this);
        CardView c4 = (CardView)view.findViewById(R.id.but4);
        c4.setOnClickListener(this);
        CardView c5 = (CardView)view.findViewById(R.id.but5);
        c5.setOnClickListener(this);
        CardView c6 = (CardView)view.findViewById(R.id.but6);
        c6.setOnClickListener(this);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(context, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                someEventListener.onArticleSelected("Статья ",position, 0);
            }
        }));
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Главная страница");

    }

    private ArrayList<NewsData> getData() {
        ArrayList results = new ArrayList<NewsData>();
        for (int index = 0; index < 3; index++) {
            results.add(index,data);
        }
        return results;
    }

    @Override
    public void onClick(View view) {
        int num =0;
        switch (view.getId()) {
            case R.id.but1:
                num = 1;
                break;
            case R.id.but2:
                num=2;
                break;
            case R.id.but3:
                num=3;
                break;
            case R.id.but4:
                num=4;
                break;
            case R.id.but5:
                num=5;
                break;
            case R.id.but6:
                num=6;
                break;
        }
        someEventListener.someEvent(num);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            someEventListener = (eventListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement onSomeEventListener");
        }
    }
}
