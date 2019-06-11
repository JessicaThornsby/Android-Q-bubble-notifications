package com.jessicathornsby.bubblenotifications;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;

public class BubbleActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble);
        ImageButton voiceCall = (ImageButton) findViewById(R.id.voice_call);
        voiceCall.setOnClickListener(this);
        ImageButton sendMessage = (ImageButton) findViewById(R.id.send);
        sendMessage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.voice_call:
                Toast.makeText(BubbleActivity.this, "Calling contact", Toast.LENGTH_SHORT).show();
                break;
            case R.id.send:
                Toast.makeText(BubbleActivity.this, "Sending message", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
