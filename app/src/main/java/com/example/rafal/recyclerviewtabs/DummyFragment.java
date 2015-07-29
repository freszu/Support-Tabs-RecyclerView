package com.example.rafal.recyclerviewtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafal on 2015-07-29.
 */
public class DummyFragment extends Fragment {
    SimpleRecycleTestAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dummy_fragment, container, false);
        final FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frame_layout);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvMenu);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        List<String> list = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            list.add(i+"asdasd");
        }
        adapter = new SimpleRecycleTestAdapter(list,R.layout.rv_item);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
