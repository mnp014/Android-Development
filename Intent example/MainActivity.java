package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity 
{
	//String EXTRA_MESSAGE = "asdf";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void sendMessage (View view){
		Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edittext);
        String message = editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE" , message);
        startActivity(intent);
	}
}
