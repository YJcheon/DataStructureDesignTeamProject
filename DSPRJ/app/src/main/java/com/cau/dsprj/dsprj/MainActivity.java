package com.cau.dsprj.dsprj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static String soucre;
    private static String dest;
    private JGraphT graphT;
    public final static int SEARCH_SOURCE = 1;
    public final static int SEARCH_DEST = 2;
    public final static int RESULT_CANCEL = 10;
    public final static int RESULT_OK = 11;

    class BtnOnClickListner implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent;
            switch (view.getId()) {
                case R.id.sourceButton:
                case R.id.sourceText:
                    intent = new Intent(getApplicationContext(), SearchActivity.class);
                    startActivityForResult(intent, SEARCH_SOURCE);
                    break;
                case R.id.destButton:
                case R.id.destText:
                    intent = new Intent(getApplicationContext(), SearchActivity.class);
                    startActivityForResult(intent, SEARCH_DEST);
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        graphT = new JGraphT(getApplicationContext());
        ArrayList<String> nodeInfos = graphT.getAllNodesKeyName();

        BtnOnClickListner onClickListner = new BtnOnClickListner();
        Button sourceButton = findViewById(R.id.sourceButton);
        TextView sourceText = findViewById(R.id.sourceText);
        sourceButton.setOnClickListener(onClickListner);
        sourceText.setOnClickListener(onClickListner);

        Button destButton = findViewById(R.id.destButton);
        TextView destText = findViewById(R.id.destText);
        destButton.setOnClickListener(onClickListner);
        destText.setOnClickListener(onClickListner);

        Button searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = findViewById(R.id.usernumText);
                String userNumTxt = editText.getText().toString();
                int userNum = 0;
                if (userNumTxt.length() != 0){
                    userNum = Integer.valueOf(userNumTxt);
                }
                SeekBar seekBar = findViewById(R.id.busySeekBar);
                int busyCheck = seekBar.getProgress();

                if( soucre == null) {
                    Toast.makeText(getApplicationContext(), "SOUCRE IS MISSING", Toast.LENGTH_LONG).show();
                }
                else if (dest == null) {
                    Toast.makeText(getApplicationContext(), "DEST IS MISSING", Toast.LENGTH_LONG).show();
                }
                else {
                    String ret = "START : ";
                    Log.d("SOURCE", soucre);
                    Log.d("DEST", dest);
                    Log.d("userNum", userNumTxt);
                    Log.d("busyCheck", String.valueOf(busyCheck));
                    ArrayList<String> path = graphT.getShortestPath(soucre, dest, userNum,
                            String.valueOf(busyCheck));
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    intent.putExtra("PATH", path);
                    startActivity(intent);
                }
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String newText;
        TextView newView;
        switch (requestCode){
            case SEARCH_SOURCE:
                if(resultCode != RESULT_CANCEL) {
                    newText = data.getStringExtra("ADDRESS");
                    soucre = newText.split("_")[0];
                    newView = findViewById(R.id.sourceText);
                    newView.setText(newText.split("_")[1]);
                }
            break;
            case SEARCH_DEST:
                if(resultCode != RESULT_CANCEL) {
                    newText = data.getStringExtra("ADDRESS");
                    dest = newText.split("_")[0];
                    newView = findViewById(R.id.destText);
                    newView.setText(newText.split("_")[1]);
                }
                break;
        }
    }

}
