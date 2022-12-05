package com.example.broadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variable
    private final String BROADCAST_ACCESS = "custom_broadcast_filter";
    private Button SendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SendBroadcast = findViewById(R.id.sendbroadcast);
        SendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mengirim Broadcast dengan filter yang dituju
                Intent sendBC = new Intent();
                sendBC.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
                        .setAction(BROADCAST_ACCESS)
                        .putExtra("myBroadcast","Broadcast diterima!");
                sendBroadcast(sendBC);
            }
        });
    }
}