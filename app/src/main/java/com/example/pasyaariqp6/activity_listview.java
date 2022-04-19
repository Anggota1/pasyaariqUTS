package com.example.pasyaariqp6;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_listview extends Fragment {

    public activity_listview(){

    }

    public static ArrayList<Shape> shappeList = new ArrayList<Shape>();
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_listview, container, false);
        setupData();

        listView = v.findViewById(R.id.shapeListview);
        shape_cell adapter = new shape_cell(getContext(), 0, shappeList);
        listView.setAdapter(adapter);

        setupOnClickListener();
        return v;
    }

    public void setupData(){
        Shape snowwhite = new Shape("0", "Snow White       Disney 14yo", R.drawable.snowwhite);
        shappeList.add(snowwhite);

        Shape jasmine = new Shape("1", "Jasmine       Disney 15yo", R.drawable.jasmine);
        shappeList.add(jasmine);

        Shape ariel = new Shape("2", "Ariel      Disney 16yo", R.drawable.ariel);
        shappeList.add(ariel);

        Shape aurora = new Shape("3", "Aurora      Disney 16yo", R.drawable.aurora);
        shappeList.add(aurora);

        Shape mulan = new Shape("4", "Mulan      Disney 16yo", R.drawable.mulan);
        shappeList.add(mulan);

        Shape merida = new Shape("5", "Merida      Disney 16yo", R.drawable.merida);
        shappeList.add(merida);

        Shape belle = new Shape("6", "Belle      Disney 17yo", R.drawable.belle);
        shappeList.add(belle);

        Shape pocahontas = new Shape("7", "Pocahontas      Disney 18yo", R.drawable.pocahontas);
        shappeList.add(pocahontas);

        Shape rapunzel = new Shape("8", "Rapunzel      Disney 18yo", R.drawable.rapunzel);
        shappeList.add(rapunzel);

        Shape cinderella = new Shape("9", "Cinderella      Disney 19yo", R.drawable.cinderella);
        shappeList.add(cinderella);

        Shape tiana = new Shape("10", "Tiana      Disney 19yo", R.drawable.tiana);
        shappeList.add(tiana);
    }

    private void setupOnClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shape selectShape = (Shape) listView.getItemAtPosition(i);
                Intent showDetail = new Intent(getContext(), activity_list_detail.class);
                showDetail.putExtra("id", selectShape.getId());
                startActivity(showDetail);
            }
        });
    }
}
