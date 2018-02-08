package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends MainActivity
{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);
		
		Intent intent = getIntent();
		String message = intent.getStringExtra("EXTRA_MESSAGE");
		
		TextView textView = (TextView)findViewById(R.id.text_view_id);
		textView.setText(message);
		}
}
