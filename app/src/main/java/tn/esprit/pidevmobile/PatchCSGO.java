package tn.esprit.pidevmobile;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


import androidx.appcompat.app.AppCompatActivity;

public class PatchCSGO extends AppCompatActivity {
    Button cspatch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csgo_page);
        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.csgo;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(PatchCSGO.this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        cspatch = (Button) findViewById(R.id.cspatch);
        cspatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.patchnotes_cs);
                Toast.makeText(PatchCSGO.this,"Button is dumb",Toast.LENGTH_SHORT).show();
            }
        });

}}
