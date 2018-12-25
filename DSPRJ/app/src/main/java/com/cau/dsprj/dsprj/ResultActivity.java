package com.cau.dsprj.dsprj;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ResultActivity extends AppCompatActivity {
    ArrayList<String> resultPath;
    ArrayList<String> resultKey;
    ArrayList<String> resultPosX;
    ArrayList<String> resultPosY;
    ListView listView;

    myview myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultPath = (ArrayList<String>) getIntent().getSerializableExtra("PATH");
        resultKey = new ArrayList<>();
        resultPosX = new ArrayList<>();
        resultPosY = new ArrayList<>();

        final ListViewAdapter adapter = new ListViewAdapter();

        listView = findViewById(R.id.resultListView);
        listView.setAdapter(adapter);
        for ( String pathData: resultPath) {
            String token[] = pathData.split("_");
            adapter.addItem(ContextCompat.getDrawable(this, R.drawable.play_button),
                    token[0], token[1]);
            resultKey.add(token[0]);
            resultPosX.add(token[2]);
            resultPosY.add(token[3]);
        }

        myView = findViewById(R.id.MyView);
        try{
            String header = resultPath.get(0).split("_")[0];
            if (header.substring(0,0).equals('0') ||  header.substring(0,0).equals('1')) {
                header = "f" + header;
            }
            myView.setBackground(getDrawable(getResources().getIdentifier(header.toLowerCase(),"drawable",getPackageName())));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try{
                    String header = resultKey.get(position);
                    if (header.substring(0,0).equals('0') ||  header.substring(0,0).equals('1')) {
                        header = "f" + header;
                    }
                    myView.setBackground(getDrawable(getResources().getIdentifier(header.toLowerCase(),"drawable",getPackageName())));
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
class myview extends View {
    Paint dot;
    float posX = 0;
    float posY = 0;
    public myview(Context context) {
        super(context);
        dot = new Paint();
        dot.setColor(Color.RED);
        dot.setStrokeWidth(50);
    }
    public myview(Context context, AttributeSet att) {
        super(context, att);
        dot = new Paint();
        dot.setColor(Color.RED);
        dot.setStrokeWidth(50);
    }
    public myview(Context context, AttributeSet att, int ref) {
        super(context, att, ref);
        dot = new Paint();
        dot.setColor(Color.RED);
        dot.setStrokeWidth(50);
    }
    @Override
    protected void onDraw(Canvas canvas) {

    }
}