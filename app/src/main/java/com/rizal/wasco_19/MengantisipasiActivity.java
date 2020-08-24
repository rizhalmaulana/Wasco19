package com.rizal.wasco_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.rizal.wasco_19.ui.home.HomeFragment;

public class MengantisipasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengantisipasi);

        ImageView back = findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        WebView webb = findViewById(R.id.webView4);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("https://www.alodokter.com/ketahui-cara-untuk-mencegah-penularan-virus-corona");
    }
}
