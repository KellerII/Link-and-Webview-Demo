/*
 * James Keller
 * In Class Assignment 2
 * 2/18/14
 */

package com.example.inclass2;

import com.example.inclass2.Data.News;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	RadioGroup radioGroup;
	final static String URL_KEY = "URL";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        
        for(int i = 0; i < Data.NEWS.size(); i++) {
        	News link = Data.NEWS.get(i);
        	RadioButton radioButton = new RadioButton(this);
        	radioButton.setText(link.getTitle());
        	radioButton.setTag(link.getUrl());
        	radioGroup.addView(radioButton);
        }
        
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (radioGroup.getCheckedRadioButtonId() != -1) {
					RadioButton radioButtonChecked = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
					Intent intent = new Intent(MainActivity.this, WebActivity.class);
					intent.putExtra(URL_KEY, (String) radioButtonChecked.getTag());
					radioButtonChecked.setTextColor(Color.BLUE);
					startActivity(intent);
				}
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
