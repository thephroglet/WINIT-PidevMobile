package tn.esprit.pidevmobile;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PatchValo extends AppCompatActivity {
    Button valopatch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valorant_page);
        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.valotrailer;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(PatchValo.this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        valopatch = (Button) findViewById(R.id.valopatch);
        valopatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.patchnotes_valo);
                Toast.makeText(PatchValo.this,"Button is dumb",Toast.LENGTH_SHORT).show();
            }
        });
}}
