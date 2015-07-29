package com.example.rafal.recyclerviewtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rafal on 2015-07-25.
 */
public class TestFragment extends Fragment {

    ArrayList<String> testList;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test_fragment, container, false);
        ListView lv = (ListView) view.findViewById(R.id.listView);
        testList = new ArrayList<>();
        generateDummyList();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, testList);

        lv.setAdapter(arrayAdapter);

        return view;
    }

    public void generateDummyList() {
        for (int i = 0; i < 40; i++) {
            testList.add(String.valueOf(i));
        }

    }
}

