package com.rizal.wasco_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.rizal.wasco_19.ui.home.HomeFragment;

public class MengobatiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mengobati);


        ImageView back = findViewById(R.id.finish);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        WebView webb = findViewById(R.id.webView3);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("https://www.who.int/news-room/q-a-detail/q-a-coronaviruses#:~:text=protect");
    }
}
