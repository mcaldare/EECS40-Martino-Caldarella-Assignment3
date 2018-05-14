package com.pandopia.pandadestroyer;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TableLayout pandas = new TableLayout(this);
    ImageButton[][] androidImageButton = new ImageButton[7][7];
    TextView display;

    //???

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);

        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                String buttonID = "imageButton" + (i+1) + (j+1);
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                androidImageButton[i][j] = ((ImageButton) findViewById(resID));

            }
        }




        androidImageButton[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("PANDA");
                goRed();
            }
        });





    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void goRed(){

    }

}

