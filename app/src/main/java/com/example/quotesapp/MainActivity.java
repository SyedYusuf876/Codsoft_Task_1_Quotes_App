package com.example.quotesapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textQuote;
    private Button showQuoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textQuote = findViewById(R.id.textQuote);
        showQuoteButton = findViewById(R.id.showQuoteButton);

        showQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuoteServ quoteServ = new QuoteServ();
                textQuote.setText(quoteServ.getRandomQuotes());
            }
        });
    }
}
