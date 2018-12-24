package com.cau.dsprj.dsprj;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    ArrayList<String> resultPath;
    ArrayList<Integer> weight;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultPath = (ArrayList<String>) getIntent().getSerializableExtra("PATH");
        weight = new ArrayList<>();
        final ListViewAdapter adapter = new ListViewAdapter();

        listView = findViewById(R.id.resultListView);
        listView.setAdapter(adapter);
        for( int i = 0; i < resultPath.size() - 1; i++) {
            String nodeIdx = resultPath.get(i++);
            String nodeName = resultPath.get(i++);
            adapter.addItem(ContextCompat.getDrawable(this, R.drawable.play_button),
                    nodeIdx, nodeName);
            if (i == 2) i--;
            else{
                String nodeWeight = resultPath.get(i);
                weight.add(Integer.valueOf(nodeWeight) );
            }
        }
        weight.add(Integer.valueOf(resultPath.get(resultPath.size()-1)));
        String firstPlace = resultPath.get(0);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), String.valueOf(weight.get(position)), Toast.LENGTH_LONG).show();
            }
        });
    }
}
