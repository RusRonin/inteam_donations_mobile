package com.example.inteam_donations;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DonationFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_form);
        String donationType = getIntent().getExtras().getString("DonationForm");
        setTitle(donationType);
        setAmount(donationType);
    }

    private void setTitle(String donationType)
    {
        TextView title = (TextView) findViewById(R.id.text_type);
        String titleText = "";
        switch (donationType) {
            case "Target":
                titleText = "Целевой сбор";
                break;
            case "Regular":
                titleText = "Регулярный сбор";
                break;
        }
        title.setText(titleText);
    }

    private void setAmount(String donationType)
    {
        TextView amount = (TextView) findViewById(R.id.text_amount);
        String amountText = "";
        switch (donationType) {
            case "Target":
                amountText = "Сумма";
                break;
            case "Regular":
                amountText = "Сумма в месяц";
                break;
        }
        amount.setText(amountText);
    }
}