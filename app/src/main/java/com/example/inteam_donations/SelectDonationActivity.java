package com.example.inteam_donations;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.Button;

public class SelectDonationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_donation);
        Button tbutton = (Button) findViewById(R.id.target_donation_button);
        tbutton.setText(Html.fromHtml("<font color='#000000''>Целевой сбор</font><br/><font color='#6D7885'>Когда есть определенная цель</font>"));
        Button rbutton = (Button) findViewById(R.id.regular_donation_button);
        rbutton.setText(Html.fromHtml("<font color='#000000'>Регулярный сбор</font><br/><font color='#6D7885'>Если помощь нужна ежемесячно</font>"));
    }

    private void StartDonationFormActivity(String donationForm)
    {
        Intent intent = new Intent(SelectDonationActivity.this, DonationFormActivity.class);
        intent.putExtra("DonationForm", donationForm);
        startActivity(intent);
    }

    public void onTargetDonationClick(View view) {
        StartDonationFormActivity("Target");
    }

    public void onRegularDonationClick(View view) {
        StartDonationFormActivity("Regular");
    }
}