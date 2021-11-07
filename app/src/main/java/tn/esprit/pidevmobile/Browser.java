package tn.esprit.pidevmobile;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Browser extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitchstream);
        webview = findViewById(R.id.webview);
        webview.loadUrl("https://www.twitch.tv/hiko");

    }
}