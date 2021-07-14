package com.example.alertdialog_passing_event;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleDialog.ExampleDialogListener {
    private TextView counterText;
    private Button button;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.txtNum);
        button= findViewById(R.id.btnClick);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });


    }

    private void openDialog() {
     ExampleDialog dialog = new ExampleDialog();
     dialog.show(getSupportFragmentManager(), "example dialog");
    }

    @Override
    public void onYesClicked() {
        counter++;
        counterText.setText(""+ counter);
    }
}