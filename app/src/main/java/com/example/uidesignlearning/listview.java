package com.example.uidesignlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class listview extends AppCompatActivity {

    ListView listview;
    Spinner spinner;
    AutoCompleteTextView autocompletetext;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrLanguage = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listview = findViewById(R.id.listview);
        spinner = findViewById(R.id.spinner);
        autocompletetext = findViewById(R.id.autocompletetext);

        arrNames.add("ram");
        arrNames.add("Lokesh");
        arrNames.add("hitesh");
        arrNames.add("ayush");
        arrNames.add("ram");
        arrNames.add("Lokesh");
        arrNames.add("hitesh");
        arrNames.add("ayush");
        arrNames.add("ram");
        arrNames.add("Lokesh");
        arrNames.add("hitesh");
        arrNames.add("ayush");
        arrNames.add("ayush");
        arrNames.add("ram");
        arrNames.add("Lokesh");
        arrNames.add("hitesh");
        arrNames.add("ayush");
        arrNames.add("ram");
        arrNames.add("Lokesh");
        arrNames.add("hitesh");
        arrNames.add("ayush");
        arrNames.add("ram");
        arrNames.add("Lokesh");
        arrNames.add("hitesh");
        arrNames.add("ayush");
        arrNames.add("ayush");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);

        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 1){
                    Toast.makeText(listview.this,"clicked first item",Toast.LENGTH_LONG).show();
                }
            }
        });
        arrIds.add("aadhar card");
        arrIds.add("Aadhar card");
        arrIds.add("Pan card");
        arrIds.add("Driving License card");
        arrIds.add("Ration card");
        arrIds.add("Voter card");
        arrIds.add("PassPort card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);


        // autocompletetextview
        arrLanguage.add("c");
        arrLanguage.add("c++");
        arrLanguage.add("java");
        arrLanguage.add("python");
        arrLanguage.add("go");
        arrLanguage.add("C#");

        ArrayAdapter<String>  autocompeleteAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguage);
        autocompletetext.setAdapter(autocompeleteAdapter);
        autocompletetext.setThreshold(1);
    }
}