package com.cau.dsprj.dsprj;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchActivity extends AppCompatActivity {
    ListView listView;
    String[] csvList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        csvList = new String[3];
        csvList[0] = "Data_structure_tp_nodes_sc.csv";
        csvList[1] = "Data_structure_tp_nodes_el.csv";
        csvList[2] = "Data_structure_tp_nodes_st.csv";

        final ListViewAdapter adapter = new ListViewAdapter();
        listView = findViewById(R.id.searchListView);
        listView.setAdapter(adapter);
        InputStreamReader is;
        BufferedReader reader;
        String[] Token;
        String tmp;
        try{
            is = new InputStreamReader(getApplicationContext().getAssets().open(csvList[0]));
            reader = new BufferedReader(is);
            tmp = reader.readLine(); // Read Header
            while ((tmp = reader.readLine()) != null ) {
                Token = tmp.split(",");
                adapter.addItem(ContextCompat.getDrawable(this, R.drawable.play_button),
                        Token[0], Token[1]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        EditText editTextFilter = findViewById(R.id.editTextFilter) ;
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                if (filterText.length() > 0) {
                    listView.setFilterText(filterText) ;
                } else {
                    listView.clearTextFilter() ;
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListViewItem curItem = (ListViewItem) adapter.getItem(position);
                String[] curData=curItem.getData();
                String newId = curData[0];
                if (newId.length() == 3) {
                    newId = "0" + newId;
                }
                Intent intent = new Intent();
                String address = newId + "_" + curData[1];
                intent.putExtra("ADDRESS",address);
                setResult(MainActivity.RESULT_OK, intent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        setResult(MainActivity.RESULT_CANCEL);
        finish();
        return;
    }
}
