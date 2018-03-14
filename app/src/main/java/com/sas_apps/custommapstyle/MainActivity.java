package com.sas_apps.custommapstyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
//         Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        switch (view.getId()) {
            case R.id.buttonAubergine:
                intent.putExtra(getResources().getString(R.string.app_name), "Aubergine");
                break;
            case R.id.buttonDark:
                intent.putExtra(getResources().getString(R.string.app_name), "Dark");
                break;
            case R.id.buttonSilver:
                intent.putExtra(getResources().getString(R.string.app_name), "Silver");
                break;
            case R.id.buttonRetro:
                intent.putExtra(getResources().getString(R.string.app_name), "Retro");
                break;
            case R.id.buttonNight:
                intent.putExtra(getResources().getString(R.string.app_name), "Night");
                break;
            case R.id.buttonBlueWater:
                intent.putExtra(getResources().getString(R.string.app_name), "BlueWater");
                break;
            case R.id.buttonDesert:
                intent.putExtra(getResources().getString(R.string.app_name), "Desert");
                break;
            case R.id.buttonBrowns:
                intent.putExtra(getResources().getString(R.string.app_name), "Browns");
                break;
            case R.id.buttonAvocado:
                intent.putExtra(getResources().getString(R.string.app_name), "Avocado");
                break;
        }
        startActivity(intent);
    }
}
