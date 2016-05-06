package com.example;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				final String[] items=new String[]{"≈‹≤Ω","”√´«Ú","∆π≈“«Ú","Õ¯«Ú","”Œ”æ"};
				Builder builder=new AlertDialog.Builder(MainActivity.this);
				builder.setTitle("«Î—°‘Ò");
				builder.setItems(items, new OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(MainActivity.this, "ƒ˙—°‘Ò¡À"+items[which], Toast.LENGTH_SHORT).show();
						
					}
				});
				builder.create().show();
				
			}
		});
    }
}