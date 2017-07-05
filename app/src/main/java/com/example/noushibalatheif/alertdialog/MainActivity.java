package com.example.noushibalatheif.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1Clicked (View v)
    {
        AlertDialog.Builder oneAlert = new AlertDialog.Builder(this);
        oneAlert.setTitle("One Button");
        oneAlert.setMessage("Button Clicked");

        oneAlert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "You clicked OK", Toast.LENGTH_SHORT).show();
            }
        });
        oneAlert.show();
    }

    public void button2Clicked(View v)
    {
        AlertDialog.Builder otwoAlert = new AlertDialog.Builder(this);
        otwoAlert.setTitle("Two Button");
        otwoAlert.setMessage("Do you want to continue?");

        otwoAlert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "You Clicked YES", Toast.LENGTH_SHORT).show();
            }
        });

        otwoAlert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "You clicked NO", Toast.LENGTH_SHORT).show();
            }
        });
        otwoAlert.show();


    }

    public void button3Clicked(View v)
    {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("CONFIRM");
        alertDialog.setMessage("Do you want to delete this item?");

        alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "You Clicked YES", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "You clicked NO", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
    }



}
